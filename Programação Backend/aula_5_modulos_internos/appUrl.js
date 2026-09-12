const { URL, URLSearchParams } = require("url");
// 1. Criando uma URL
const minhaUrl = new URL(
  "https://www.exemplo.com:8080/caminho/pagina.html?produto=123&categoria=books#secao1"
);
console.log("--- Exemplos com módulo url ---\n");
// 2. Propriedades principais
console.log("href:", minhaUrl.href);
console.log("origin:", minhaUrl.origin);
console.log("protocol:", minhaUrl.protocol);
console.log("host:", minhaUrl.host);
console.log("hostname:", minhaUrl.hostname);
console.log("port:", minhaUrl.port);
console.log("pathname:", minhaUrl.pathname);
console.log("search:", minhaUrl.search);
console.log("hash:", minhaUrl.hash);
// 3. Trabalhando com query parameters
console.log("\n--- Query Parameters ---");
console.log("Produto:", minhaUrl.searchParams.get("produto"));
console.log("Categoria:", minhaUrl.searchParams.get("categoria"));
// 4. Adicionando e removendo parâmetros
minhaUrl.searchParams.append("cor", "azul");
minhaUrl.searchParams.set("produto", "456"); // altera existente
console.log("URL atualizada:", minhaUrl.href);
// 5. Iterando sobre os parâmetros
console.log("\nTodos os parâmetros:");
for (const [chave, valor] of minhaUrl.searchParams) {
  console.log(chave, "=", valor);
}
