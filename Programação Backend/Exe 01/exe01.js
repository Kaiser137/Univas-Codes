// Exercicio 1
function somar(a, b) {
    return a + b;
}

function subtrair(a, b){
    return a - b;
}

function multiplicacao(a, b){
    return a * b;
}

function divisao(a, b){
    return a / b;
}

let num1 = 10;
let num2 = 5;
console.log("Soma:", somar(num1, num2));
console.log("Subtrair: ", subtrair(num1, num2));
console.log("Multiplicacao: ", multiplicacao(num1, num2));
console.log("Divisao: ", divisao(num1, num2));
console.log("-------------------------------------------------------------------------");
// Exercicio 2

let array = ["Neymar", "Neymara", "Neymaru", "Neyde", "Nilmar"];

for (i = 0; i < array.length; i++){
    console.log(array[i]);
}
console.log("-------------------------------------------------------------------------");
// Exercicio 3

let Numeros = [5, 12, 8, 130, 44];

let maiorque20 = Numeros.filter(n => n > 20);

for(i = 0; i < maiorque20.length; i++){
    console.log(maiorque20[i]);
}
console.log("-------------------------------------------------------------------------");

let triplo = Numeros.map(n => n * 3);

for(i = 0; i < triplo.length; i++){
    console.log(triplo[i]);
}
console.log("-------------------------------------------------------------------------");

// Exercicio 4

let Numero = 2;

if (Numero % 2 === 0){
    console.log("O número " + Numero + " é Par!");
} else {
    console.log("O número " + Numero + " é Impar!");
}

// Exercicio 5

let idade = 15;

function verificarIdade(idade) {
  if (idade < 0) {
    throw new Error("Idade inválida");
  }
  console.log("Idade registrada: " + idade);
}

try {
  verificarIdade(-5);
} catch (erro) {
  console.log("Erro: " + erro.message);
}