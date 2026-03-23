alert("Eae, mundo!");

var x;

x = 50;
alert("X é igual: " + x);

x = "Alan Turing";
alert("X é igual: "+ x);

let a = 2, b = "2";
alert(a+b);

let nome = prompt("Digite um nome: ");
alert("Olá " + nome + "!");

console.log("Olá " + nome);
document.write("Olá " + nome);

let aa, bb, cc;

aa = Number(prompt("Digite o primeiro valor: "));
bb = Number(prompt("Digite o segundo valor: "));
cc = aa + bb;

alert("A soma dos dois valores é: " + cc);

let numero = Number(prompt("Digite um número: "));
if (numero > 10){
    alert("O numero que voce digitou é maior que 10!")
} else {
    alert("O numero é menor ou igual a 10!")
}

let opcao = prompt("Digite uma opção: ");
switch(opcao){
    case "+":
        alert("Some!");
        break;
    case "-":
        alert("Subtraia!");
        break;
    default:
        alert("Opção Inválida!");
        break;
}