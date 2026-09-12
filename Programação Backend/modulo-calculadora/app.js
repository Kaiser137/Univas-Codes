/* Aplicação de Testes (app.js) */

const moduloOperacoesMatematicas = require('./operacoesMatematicas');//Importando o módulo

//Fazendo o uso das funcionalidades do módulo:
console.log('Soma: ' + moduloOperacoesMatematicas.soma(14, 55));//Mostra na tela o resultado da soma
console.log('Subtração: ' + moduloOperacoesMatematicas.subtracao(8, 5));//Mostra na tela o resultado da subtração
console.log('Multiplicacao: ' + moduloOperacoesMatematicas.multiplicacao(33, 13));//Mostra na tela o resultado da multiplicação
console.log('Divisao: ' + moduloOperacoesMatematicas.divisao(10, 2));//Mostra na tela o resultado da divisão