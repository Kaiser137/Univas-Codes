/* 1. Crie duas variáveis chamadas nome e idade. Atribua valores a elas e exiba no console a
frase: "Meu nome é <nome> e tenho <idade> anos.". */

let nome = "Cezar";
let idade = 19;

console.log("Meu nome é " + nome + " e tenho " + idade + " anos.");

/* 2. Crie uma função chamada saudacao que recebe um nome como parâmetro e retorna a
mensagem "Olá, <nome>! Seja bem-vindo.". */

function saudacao(nome) {
    console.log("Olá, " + nome + "! Seja bem-vindo.");
}

saudacao(nome);

/* 3. Crie uma função chamada soma que recebe dois números como parâmetros e retorna o
resultado da soma. */

function soma(num1, num2) {
    let somaTotal = num1 + num2;
    return somaTotal;
}

console.log("O resultado da soma eh: " + soma(4, 8));

/* 4. Crie uma função chamada dobro que recebe um número e retorna o dobro desse
número. */

function dobro(num) {
    return num + num;
}

console.log("O dobro do numero eh: " + dobro(4));

/* 5. Crie um array chamado numeros contendo cinco números. Utilize uma função para
calcular e retornar a soma de todos os valores do array. */

let arrayNum = [1, 2, 3, 4, 5];

function calcularArray(arrayNum) {
    let somaArray = 0;
    for (let i = 0; i < arrayNum.length; i++) {
        somaArray = somaArray + arrayNum[i];
    }

    return somaArray;
}

console.log("A soma dos numeros do Array eh: " + calcularArray(arrayNum));

/* 6. Crie um array com cinco nomes. Crie uma função chamada mostrarNomes que
percorre o array e exibe cada nome no console. */

let arrayNomes = ["Rogério Ceni", "Danilo", "Lugano", "Cicinho", "Josué"];

function mostrarNomes(arrayNomes) {
    for (let i = 0; i < arrayNomes.length; i++) {
        console.log(arrayNomes[i]);
    }
}

mostrarNomes(arrayNomes);

/* 7. Crie uma função chamada media que recebe três números como parâmetros e retorna a
média deles. */
function media(num1, num2, num3) {
    let mediaFunction = 0;
    let somaMedia = num1 + num2 + num3;
    mediaFunction = somaMedia / 3;
    return mediaFunction;
}

console.log("A media dos numeros eh: " + media(10, 20, 30));

/* 8. Crie um objeto chamado aluno contendo as propriedades: nome, idade e curso. Exiba
no console uma frase utilizando essas informações. */

/* 9. Crie uma função chamada apresentarAluno que recebe um objeto aluno e retorna a
frase: "O aluno <nome> tem <idade> anos e estuda <curso>.". */

let aluno = {
    nome: "Cezar",
    idade: 19,
    curso: "Sistemas de Informação",

    apresentarAluno() {
        console.log("O aluno " + this.nome + ", tem " + this.idade + " anos e cursa: " + this.curso);
    },
};

function apresentarAlunoPergunta9(aluno) {
    return "O aluno " + aluno.nome + " tem " + aluno.idade + " anos e estuda: " + aluno.curso;
}

aluno.apresentarAluno();
console.log(apresentarAlunoPergunta9(aluno));

/* 10. Crie um array de objetos chamado produtos. Cada objeto deve ter nome e preco. Crie
uma função que percorre esse array e exibe o nome de cada produto. */

let produto1 = {
    nome: "Escova",
    preco: 6.90
};

let produto2 = {
    nome: "Fio Dental",
    preco: 3.90
};

let produto3 = {
    nome: "Enxaguante bucal",
    preco: 16.90
};

let produtos = [produto1, produto2, produto3];

function listaProdutos(produtos) {
    for (let i = 0; i < produtos.length; i++) {
        console.log("O produto do indice " + i + " eh: " + produtos[i].nome);
    }
}

listaProdutos(produtos);

/* 11. Crie uma função chamada verificarIdade que recebe uma idade e retorna "Maior de
idade" ou "Menor de idade". */

function verificarIdade(idade) {
    if (idade < 18) {
        return "Menor de idade!";
    } else {
        return "Maior de idade!";
    }
}

console.log(verificarIdade(17));

/* 12. Crie uma função chamada calcularAreaRetangulo que recebe largura e altura e
retorna a área. */

function calcularAreaRetangulo(largura, altura) {
    let area = (largura * altura);
    return area;
}

console.log("A area do retangulo eh: " + calcularAreaRetangulo(4, 2));

/* 13. Crie um array com números e uma função que retorna o maior número presente nesse
array. */

let arrayNum2 = [10, 20, 30, 50, 60, 20, 30];

function maiorArray(arrayNum2) {
    let maiorNum = 0;
    for (let i = 0; i < arrayNum2.length; i++) {
        if (maiorNum < arrayNum2[i]) {
            maiorNum = arrayNum2[i];
        }
    }

    return maiorNum;
}

console.log("O maior número desse array eh: " + maiorArray(arrayNum2));

/* 14. Crie um objeto chamado carro com as propriedades marca, modelo e ano. Crie uma
função que recebe esse objeto e retorna uma frase descrevendo o carro */

let carro = {
    marca: "Fiat",
    modelo: "Uno Fire",
    ano: 1996
};

function descreveCarro(carro) {
    return "O carro eh da marca " + carro.marca + ", modelo " + carro.modelo + " e ano " + carro.ano;
}

console.log(descreveCarro(carro));

/* 15. Analise o código abaixo e mostre o resultado exibido no console:
let x = 10;
function teste(){
 let x = 5;
 console.log(x);
}
teste();
console.log(x); */

let x = 10;
function teste() {
    let x = 5;
    console.log(x);
}
teste();
console.log(x);

/* 16. Corrija o erro no código abaixo para que a função funcione corretamente:
function soma(){
 return a + b;
}
console.log(soma(2,3)); */

function soma16(a, b) {
    return a + b;
}
console.log(soma16(2, 3));

/* 17. Crie uma função chamada contarElementos que recebe um array e retorna a
quantidade de elementos dentro dele. */

let arrayContarElementos = [1, 2, 3, 4, 5, 6];

function contarElementos(arrayContarElementos) {
    let contar = arrayContarElementos.length;
    return contar;
}

console.log("A quantidade total de elementos do array eh: " + contarElementos(arrayContarElementos));

/* 18. Crie uma função chamada filtrarPares que recebe um array de números e retorna um
novo array contendo apenas os números pares. */
let arrayNum3 = [1, 2, 3, 4, 5, 6, 7, 8, 9];

function filtrarPares(arrayNum3) {
    let arrayNum3Par = [];
    for (let i = 0; i < arrayNum3.length; i++) {
        if (arrayNum3[i] % 2 == 0) {
            arrayNum3Par.push(arrayNum3[i]);
        }
    }

    return arrayNum3Par;
}

console.log("Os numeros pares são: " + filtrarPares(arrayNum3) + ".");

/* 19. Crie um objeto chamado pokemon com as propriedades nome, tipo e hp. Crie uma
função que recebe esse objeto e retorna uma frase apresentando o Pokémon. */

let pokemon = {
    nome: "Squirtle",
    tipo: "Água",
    hp: 200
}

function apresentarPokemon(pokemon) {
    return "O pokemon " + pokemon.nome + " eh do tipo " + pokemon.tipo + " e tem " + pokemon.hp + " de hp.";
}

console.log(apresentarPokemon(pokemon));

/* 20. Crie uma função chamada calcularTotal que recebe um array de objetos
representando produtos (com nome e preco) e retorna a soma total dos preços. */

function calcularTotal(produtos) {
    let somaProdutos = 0;
    for (let i = 0; i < produtos.length; i++) {
        somaProdutos = somaProdutos + produtos[i].preco;
    }

    return somaProdutos;
}

console.log("A soma total dos precos dos produtos eh: " + calcularTotal(produtos));