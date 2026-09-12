const fs = require("fs");
const path = require("path");
const os = require("os");
const readline = require("readline");
const { EventEmitter } = require("events");
const { URL } = require("url");
const arquivoJSON = path.join(__dirname, "urls.json");
// Garante que o arquivo exista
if (!fs.existsSync(arquivoJSON)) {
  fs.writeFileSync(arquivoJSON, JSON.stringify([], null, 2), "utf8");
}
const emitter = new EventEmitter();
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  prompt: "url> ",
});
emitter.on("urlModificada", (info) => {
  console.log(
    `Evento disparado: urlModificada - ID: ${info.id}, Usuário: ${
      os.userInfo().username
    }`
  );
});
console.log("Comandos: adicionar <URL> | listar | remover <id> | sair");
rl.prompt();

rl.on("line", (line) => {
  const [cmd, ...args] = line.trim().split(" ");
  const dados = JSON.parse(fs.readFileSync(arquivoJSON, "utf8"));
  switch (cmd) {
    case "adicionar":
      const novaUrl = args[0];
      if (!novaUrl) {
        console.log("Uso: adicionar <URL>");
        break;
      }
      const id = dados.length + 1;
      dados.push({ id, url: novaUrl });
      fs.writeFileSync(arquivoJSON, JSON.stringify(dados, null, 2), "utf8");
      emitter.emit("urlModificada", { id });
      console.log("URL adicionada!");
      break;

    case "listar":
      if (dados.length === 0) console.log("Nenhuma URL cadastrada.");
      else dados.forEach((u) => console.log(`${u.id} - ${u.url}`));
      break;

    case "remover":
      const idRemover = parseInt(args[0]);
      const index = dados.findIndex((u) => u.id === idRemover);
      if (index === -1) {
        console.log("ID não encontrado.");
        break;
      }
      dados.splice(index, 1);
      fs.writeFileSync(arquivoJSON, JSON.stringify(dados, null, 2), "utf8");
      emitter.emit("urlModificada", { id: idRemover });
      console.log("URL removida!");
      break;

    case "sair":
    case "exit":
      rl.close();
      return;

    default:
      console.log("Comando não reconhecido.");
  }

  rl.prompt();
});
rl.on("close", () => {
  console.log("Encerrando...");
  process.exit(0);
});
