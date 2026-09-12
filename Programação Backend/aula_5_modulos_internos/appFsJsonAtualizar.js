const fs = require("fs");
const path = require("path");
const arquivo = path.join(__dirname, "dados.json");
// 1. Ler o arquivo e converter para objeto
const conteudo = fs.readFileSync(arquivo, "utf8");
const json = JSON.parse(conteudo);
// 2. Alterar o e-mail do usuário com id 2
const usuario = json.usuarios.find((u) => u.id === 2);
if (usuario) {
  usuario.email = "novoemail@dominio.com";
  console.log(`Email do usuário ${usuario.nome} atualizado!`);
} else {
  console.log("Usuário não encontrado.");
}
// 3. Salvar o JSON atualizado
fs.writeFileSync(arquivo, JSON.stringify(json, null, 2), "utf8");
// 4. Verificar
const atualizado = JSON.parse(fs.readFileSync(arquivo, "utf8"));
console.log("Conteúdo atualizado:", atualizado);
