const fs = require("fs");
const path = require("path");
const arquivo = path.join(__dirname, "dados.json");
// 1. Criar um objeto JavaScript
const dados = {
  usuarios: [
    { id: 1, nome: "Alice", email: "alice@email.com" },
    { id: 2, nome: "Bob", email: "bob@email.com" },
  ],
  criadoEm: new Date(),
};
// 2. Escrever o objeto JSON no arquivo
fs.writeFileSync(arquivo, JSON.stringify(dados, null, 2), "utf8");
console.log("Arquivo JSON criado:", arquivo);
// 3. Ler o arquivo e converter de volta para objeto
const conteudo = fs.readFileSync(arquivo, "utf8");
const jsonLido = JSON.parse(conteudo);
console.log("Conteúdo lido do JSON:", jsonLido);
// 4. Modificar o objeto e salvar novamente
jsonLido.usuarios.push({ id: 3, nome: "Carol", email: "carol@email.com" });
fs.writeFileSync(arquivo, JSON.stringify(jsonLido, null, 2), "utf8");
console.log("Novo usuário adicionado e salvo no JSON.");
// 5. Ler novamente para verificar
const atualizado = JSON.parse(fs.readFileSync(arquivo, "utf8"));
console.log("Conteúdo atualizado:", atualizado);
