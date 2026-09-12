const fs = require("fs");
const path = require("path");
const os = require("os");
const { EventEmitter } = require("events");
const { URL } = require("url");
//Cria um monitor de arquivo que retorna um EventEmitter.
function criarArquivoMonitor(caminhoArquivo) {
  const emitter = new EventEmitter();
  fs.watchFile(caminhoArquivo, () => {
    const stats = fs.statSync(caminhoArquivo);
    const info = {
      nome: path.basename(caminhoArquivo),
      absoluto: path.resolve(caminhoArquivo),
      tamanho: stats.size,
      usuario: os.userInfo().username,
      url: new URL("file://" + path.resolve(caminhoArquivo)),
    };
    emitter.emit("alterado", info);
  });
  return emitter;
}
// --- Script principal ---
const arquivo = path.join(__dirname, "exemplo.txt");
// Garante que o arquivo exista
if (!fs.existsSync(arquivo)) {
  fs.writeFileSync(arquivo, "Arquivo inicial.\n", "utf8");
}
const monitor = criarArquivoMonitor(arquivo);
monitor.on("alterado", (info) => {
  console.log("Arquivo alterado:", info.nome);
  console.log("Caminho absoluto:", info.absoluto);
  console.log("Tamanho:", info.tamanho, "bytes");
  console.log("Usuário:", info.usuario);
  console.log("URL:", info.url.href);
  console.log("---------------------------\n");
});
console.log(`Monitorando alterações no arquivo: ${arquivo}`);
