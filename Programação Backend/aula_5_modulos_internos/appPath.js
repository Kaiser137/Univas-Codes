// exemplo-path.js
const path = require("path");
// Exemplo de caminho
const arquivo = "/home/usuario/projetos/app/index.js";
console.log("--- Exemplos com módulo path ---");
// 1. Extensão do arquivo
console.log("extname:", path.extname(arquivo)); // .js
// 2. Diretório do arquivo
console.log("dirname:", path.dirname(arquivo)); // /home/usuario/projetos/app
// 3. Normalização (ajuste de barras e "..")
console.log(
  "normalize:",
  path.normalize("/home//usuario/../usuario/projetos//app")
); // /home/usuario/projetos/app
// 4. Caminho absoluto?
console.log("isAbsolute:", path.isAbsolute(arquivo)); // true
// 5. Caminho relativo
console.log(
  "relative:",
  path.relative("/home/usuario", "/home/usuario/projetos/app")
); // projetos/app
// 6. Separador de diretórios
console.log("sep:", path.sep); // "/" (Linux/Mac) ou "\" (Windows)
// 7. Delimitador de variáveis de ambiente (PATH)
console.log("delimiter:", path.delimiter); // ":" (Linux/Mac) ou ";" (Windows)
// 8. Nome base do arquivo
console.log("basename:", path.basename(arquivo)); // index.js
console.log("basename sem extensão:", path.basename(arquivo, ".js")); // index
// 9. Resolve (gera caminho absoluto)
console.log("resolve:", path.resolve("projetos", "app", "index.js"));
// /home/usuario/.../projetos/app/index.js (depende de onde o script é executado)
// 10. Join (une caminhos de forma correta)
console.log(
  "join:",
  path.join("/home", "usuario", "projetos", "app", "index.js")
); // /home/usuario/projetos/app/index.js
console.log("--- Fim dos exemplos ---");
