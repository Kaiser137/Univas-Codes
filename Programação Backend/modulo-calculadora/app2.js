const readline = require("readline");
const calculos = require("./operacoesMatematicas");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const msgBoasVindas = "Bem-vindo à calculadora simples em Node.js!";
const msgMenu = `
Escolha uma operação:
1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão
0 - Sair
`;

console.log(msgBoasVindas);

function perguntarOperacao() {
  rl.question(msgMenu + "\nDigite a opção: ", (opcao) => {
    const op = parseInt(opcao);

    if (op === 0) {
      console.log("Encerrando a calculadora. Até mais!");
      rl.close();
      return;
    }

    if (![1, 2, 3, 4].includes(op)) {
      console.log("Opção inválida! Tente novamente.");
      perguntarOperacao();
      return;
    }

    rl.question("Digite o primeiro número: ", (num1Str) => {
      const num1 = parseFloat(num1Str);
      if (isNaN(num1)) {
        console.log("Número inválido! Tente novamente.");
        perguntarOperacao();
        return;
      }

      rl.question("Digite o segundo número: ", (num2Str) => {
        const num2 = parseFloat(num2Str);
        if (isNaN(num2)) {
          console.log("Número inválido! Tente novamente.");
          perguntarOperacao();
          return;
        }

        try {
          let resultado;
          switch (op) {
            case 1:
              resultado = calculos.soma(num1, num2);
              break;
            case 2:
              resultado = calculos.subtrai(num1, num2);
              break;
            case 3:
              resultado = calculos.multiplica(num1, num2);
              break;
            case 4:
              resultado = calculos.divide(num1, num2);
              break;
          }
          console.log(`Resultado: ${resultado}`);
        } catch (err) {
          console.log("Erro: " + err.message);
        }
        perguntarOperacao();
      });
    });
  });
}

perguntarOperacao();
