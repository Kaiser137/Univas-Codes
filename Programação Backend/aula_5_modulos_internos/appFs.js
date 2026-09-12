const fs = require("fs");
const path = require("path");
const arquivo = path.join(__dirname, "exemplo.txt");
const pasta = path.join(__dirname, "minha_pasta");
console.log("--- Exemplos com módulo fs ---\n");
// 1. Criar arquivo e escrever conteúdo
fs.writeFileSync(arquivo, "Olá Node.js!\n", "utf8");
console.log("Arquivo criado:", arquivo);
// 2. Ler arquivo
const conteudo = fs.readFileSync(arquivo, "utf8");
console.log("Conteúdo do arquivo:", conteudo);
// 3. Adicionar conteúdo ao arquivo
fs.appendFileSync(arquivo, "Mais uma linha.\n");
console.log("Conteúdo adicionado.");
// 4. Ler novamente
console.log("Conteúdo atualizado:\n", fs.readFileSync(arquivo, "utf8"));
// 5. Criar uma pasta
if (!fs.existsSync(pasta)) {
  fs.mkdirSync(pasta);
  console.log("Pasta criada:", pasta);
}
// 6. Listar arquivos da pasta atual
console.log("Arquivos na pasta atual:", fs.readdirSync(__dirname));
// 7. Renomear arquivo
const arquivoNovo = path.join(__dirname, "exemplo-renomeado.txt");
fs.renameSync(arquivo, arquivoNovo);
console.log("Arquivo renomeado para:", arquivoNovo);
// 8. Deletar arquivo
fs.unlinkSync(arquivoNovo);
console.log("Arquivo deletado.");
// 9. Deletar pasta
fs.rmdirSync(pasta);
console.log("Pasta deletada.");
console.log("\n--- Fim dos exemplos ---");
