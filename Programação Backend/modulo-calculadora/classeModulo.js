class MinhaClasse{
 constructor(nome) {
 this.nome = nome;
 }

 saudacao() {
 console.log('Muito prazer, ${this.nome}!');
 }
}

module.exports = MinhaClasse;