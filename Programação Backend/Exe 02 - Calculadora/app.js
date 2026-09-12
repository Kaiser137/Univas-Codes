const readline = require("readline");

const moduloFuncoesMatematicas = require("./funcoesMatematicas");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

var resultado = 0;
console.log("Operações disponíveis: soma, subtracao, divisao, multiplicacao.");

function calculadora() {
  rl.question(
    "Digite qual operação matemática você deseja fazer ou sair para encerrar: ",
    (resposta) => {
      if (resposta.toLowerCase() === "sair") {
        console.log("Valeu fio!");
        rl.close();
      } else if (resposta.toLowerCase() != "sair" || resposta.toLowerCase() != "soma" || resposta.toLowerCase() != "subtracao" || resposta.toLowerCase() != "divisao"){
        console.log("Digitou errado, vai dá não!");
        rl.close();
      } else if (resposta.toLowerCase() === "soma") {
        console.log(`Opcao escolhida: ${resposta}`);
        rl.question("primeiro numero: ", (resposta1) => {
          rl.question("segundo numero: ", (resposta2) => {
            resultado = moduloFuncoesMatematicas.somar(resposta1, resposta2);
            console.log("O resultado da soma eh: " + resultado);
            calculadora();
          });
        });
      } else if (resposta.toLowerCase() === "subtracao") {
        console.log(`Opcao escolhida: ${resposta}`);
        rl.question("primeiro numero: ", (resposta1) => {
          rl.question("segundo numero: ", (resposta2) => {
            resultado = moduloFuncoesMatematicas.subtrair(resposta1, resposta2);
            console.log("O resultado da subtracao eh: " + resultado);
            calculadora();
          });
        });
      } else if (resposta.toLowerCase() === "multiplicacao") {
        console.log(`Opcao escolhida: ${resposta}`);
        rl.question("primeiro numero: ", (resposta1) => {
          rl.question("segundo numero: ", (resposta2) => {
            resultado = moduloFuncoesMatematicas.multiplicacao(resposta1, resposta2);
            console.log("O resultado da multiplicacao eh: " + resultado);
            calculadora();
          });
        });
      } else if (resposta.toLowerCase() === "divisao") {
        console.log(`Opcao escolhida: ${resposta}`);
        rl.question("primeiro numero: ", (resposta1) => {
          rl.question("segundo numero: ", (resposta2) => {
            resultado = moduloFuncoesMatematicas.divisao(resposta1, resposta2);
            console.log("O resultado da divisao eh: " + resultado);
            calculadora();
          });
        });
      }
    },
  );
}
calculadora();
