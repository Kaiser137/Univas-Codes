/* Exercício 1 – Criando Arrays
Crie um array chamado 'filmes' contendo 5 filmes favoritos.
- Mostre o primeiro filme.
- Mostre o último filme. */

let filmes = ["Carros", "Jhon Wick", "Matrix", "Star Wars", "Player N°1"];

console.log("Esse é o Primeiro filme: " + filmes[0] + " e esse é o último filme: " + filmes[filmes.length - 1] + "!");

/* Exercício 2 – Alterando valores
Dado o array:
let cores = ['azul', 'verde', 'vermelho'];
1. Altere 'verde' para 'amarelo'.
2. Mostre o array atualizado. */

let cores = ["azul", "verde", "vermelho"];

cores[1] = "amarelo";

for(let i = 0; i < cores.length; i++){
    console.log("A cor do indice " + i + " é: " + cores[i]);
}

/* Exercício 3 – Tamanho do Array
Crie um array com nomes de 4 cidades.
- Mostre quantos elementos existem usando .length. */

let cidades = ["Pouso Alegre", "Santa Rita do Sapucaí", "Congonhal", "Estiva"];

console.log("Existem " + cidades.length + " elementos no vetor cidades[]!");

/* Exercício 4 – push e pop
Crie um array 'numeros' vazio.
1. Adicione os números 10, 20 e 30 usando push.
2. Remova o último elemento.
3. Mostre o array final. */

let numeros = [];

numeros.push(10, 20, 30);
numeros.pop();

for(let i = 0; i < numeros.length; i++){
    console.log(numeros[i]);
}

/* Exercício 5 – unshift e shift
Dado:
let fila = ['João', 'Maria', 'Pedro'];
1. Adicione 'Ana' no início.
2. Remova o primeiro elemento.
3. Mostre quem ficou na primeira posição. */

let fila = ['João', 'Maria', 'Pedro'];

fila.unshift("Ana");
fila.shift();

console.log(fila[0]);

/*Exercício 6 – slice
Crie um array com 6 frutas.
- Gere um novo array contendo apenas as frutas da posição 2 até 4 usando slice.*/

let frutas = ["maçã", "banana", "laranja", "uva", "abacaxi", "pera"];

let frutasCortado = frutas.slice(2, 5);

for (i = 0; i < frutasCortado.length; i++){
    console.log(frutasCortado[i]);
}

/* Exercício 7 – includes e indexOf
Dado:
let linguagens = ['JavaScript', 'Python', 'Java', 'C'];
1. Verifique se 'Python' existe no array.
2. Descubra a posição de 'Java'. */

let linguagens = ['JavaScript', 'Python', 'Java', 'C'];

console.log(linguagens.includes("Python"));
console.log(linguagens.indexOf("Java"));

/* Exercício 8 – sort e reverse
Crie o array [5, 2, 9, 1, 7].
1. Ordene o array.
2. Inverta a ordem. */

let arraySort = [5, 2, 9, 1, 7];
console.log(arraySort.sort());
console.log(arraySort.reverse());
// Descobri que pode dar um console log sem for num array rsrsrs

/* Exercício 9 – Criando um objeto
Crie um objeto 'aluno' com:
- nome
- idade
- curso
Mostre cada propriedade no console. */

/* Exercício 10 – Adicionando método
Adicione ao objeto 'aluno' um método chamado apresentar() que mostre:
Olá, meu nome é X e faço o curso Y. */

let aluno1 = {
    nome: "Cezar",
    idade: 19,
    curso: "Sistemas de informação",

    apresentar(){
        console.log("Olá, meu nome é " + this.nome + " e faço o curso: " + this.curso);
    }
};

console.log(aluno1.nome);
console.log(aluno1.idade);
console.log(aluno1.curso);
aluno1.apresentar();

/* Exercício 11 – Atualizando propriedades
Altere a idade do aluno e exiba o objeto atualizado. */

aluno1.idade = 20;

console.log(aluno1);

/* Exercício 12 – Lista de objetos
Crie um array 'alunos' contendo 3 objetos com:
- nome
- nota
Mostre apenas os nomes dos alunos. */

let alunos1 = {
    nome: "Cezar",
    nota: 10,
};

let alunos2 = {
    nome: "Igor",
    nota: 9,
};

let alunos3 = {
    nome: "Rodrigo",
    nota: 8,
};

let alunos = [alunos1, alunos2, alunos3];

for (i = 0; i < alunos.length; i++){
    console.log(alunos[i].nome);
}

/* Exercício 13 – Média das notas
Usando o array anterior, calcule a média das notas. */

let somaNota = alunos1.nota + alunos2.nota + alunos3.nota;
let mediaNota = somaNota / alunos.length;

console.log(mediaNota);

/* Exercício 14 – Criando uma classe
Crie uma classe Pessoa com:
- nome
- idade
Use um constructor para definir os valores e crie dois objetos. */

/*Exercício 15 – Método da classe
Adicione um método falar() que mostre:
Olá, eu sou [nome].*/

class Pessoa {
    nome;
    idade;

    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }

    falar(){
        console.log("Olá, eu sou " + this.nome);
    }
}

let Neymar = new Pessoa("Neymar", 34);
let Ganso = new Pessoa("PH Ganso", 36);

console.log(Neymar);
console.log(Ganso);

Neymar.falar();

/* Exercício 16 – Uso do this
Explique em comentário no código por que usamos this.nome dentro do método. */

// Usamos o this.nome para garantir a referenciação do atributo nome dentro da classe

/* Exercício 17 – Mini Pokédex
Crie uma classe Pokemon com:
- nome
- tipo
- hp
Crie um método atacar() que mostre '[nome] atacou!'.
Depois:
1. Crie 3 pokémons.
2. Coloque-os dentro de um array.
3. Mostre o nome de todos os pokémons. */

class Pokedex {
    nome;
    tipo;
    hp;

    constructor(nome, tipo, hp){
        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
    }

    atacar(){
        console.log(this.nome + " atacou!");
    }
};

let pokemon1 = new Pokedex("Rony rustico", "bicicleta", 2);
let pokemon2 = new Pokedex("Nicollas", "atacante do momento", 0);
let pokemon3 = new Pokedex("Dadá Maravilha", "nervoso", 10);

let pokemons = [pokemon1, pokemon2, pokemon3];

for(i = 0; i < pokemons.length; i++){
    console.log(pokemons[i].nome);
};