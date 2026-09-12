const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function perguntar() {
  rl.question('Digite algo (ou "sair" para encerrar): ', (resposta) => {
    if (resposta.toLowerCase() === "sair") {
      console.log("Encerrando...");
      rl.close();
    } else {
      console.log(`Você digitou: ${resposta}`);
      perguntar(); // chama novamente para continuar o loop
    }
  });
}
perguntar();
