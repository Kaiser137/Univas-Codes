// 1
document.querySelector("#btnMensagem").addEventListener("click", function() {
  window.alert("Bem-vindo ao painel do treinador!");
});

// 2
document.querySelector("#btnAlterarTitulo").addEventListener("click", function() {
  const titulo = document.querySelector("#titulo");
  titulo.textContent = "Equipe Pokémon carregada!";
});

// 3
document.querySelector("#btnTema").addEventListener("click", function() {
  const body = document.querySelector("body");
  if (body.style.backgroundColor === "") {
    body.style.backgroundColor = "blanchedalmond";
  } else {
    body.style.backgroundColor = "";
  }
});

// 4
window.onload = function() {
    document.title = "Painel Pokémon - DOM";
};

/* 5. Ao clicar no botão 'Destacar primeiro', adicione a classe 'destaque' ao primeiro item da lista de Pokémon. */
document.querySelector("#btnDestacarPrimeiro").addEventListener("click", function() {
  const destaquePokemon = document.querySelector(".pokemon");
  destaquePokemon.classList.add("destaque");
})

/* 6. Ao clicar no botão 'Remover último', remova o último item (<li>) da lista de Pokémon. */
document.getElementById('btnRemoverUltimo').addEventListener('click', function() {
    const lista = document.getElementById('listaPokemons');
    if (lista.lastElementChild) {
        lista.removeChild(lista.lastElementChild);
    }
});

// 7. Quando um Pokémon da lista for clicado, altere o texto do elemento '#infoPokemon' para mostrar o nome do Pokémon clicado.
document.getElementById('listaPokemons').addEventListener('click', function(event) {
    if (event.target.tagName === 'LI') {
        document.getElementById('infoPokemon').textContent = 'Pokémon selecionado: ' + event.target.textContent;
    }
});

// 8. Quando um Pokémon da lista for clicado, adicione a classe 'selecionado' ao item clicado e remova essa classe dos demais.
document.getElementById('listaPokemons').addEventListener('click', function(event) {
    if (event.target.tagName === 'LI') {
        const todosPokemons = document.querySelectorAll('#listaPokemons li');
        todosPokemons.forEach(function(item) {
            item.classList.remove('selecionado');
        });
        event.target.classList.add('selecionado');
    }
});

// 9. Quando um Pokémon da lista for clicado, utilize getAttribute() para ler o atributo 'data-tipo' e mostre o tipo no texto de detalhes.
document.getElementById('listaPokemons').addEventListener('click', function(event) {
    if (event.target.tagName === 'LI') {
        const tipo = event.target.getAttribute('data-tipo');
        const info = document.getElementById('infoPokemon');
        info.textContent = info.textContent + ' | Tipo: ' + tipo;
    }
});

// 10. Ao clicar no botão 'Adicionar Pokémon', adicione um novo item na lista utilizando os valores digitados nos campos de entrada.
document.getElementById('btnAdicionar').addEventListener('click', function() {
    const nome = document.getElementById('inputPokemon').value;
    if (nome) {
        const novoLi = document.createElement('li');
        novoLi.textContent = nome;
        novoLi.className = 'pokemon';
        document.getElementById('listaPokemons').appendChild(novoLi);
    }
}); 

// 11. Implemente a adição do novo Pokémon utilizando o método insertAdjacentHTML().
document.getElementById('btnAdicionar').addEventListener('click', function() {
    const nome = document.getElementById('inputPokemon').value;
    const tipo = document.getElementById('inputTipo').value;
    if (nome) {
        const htmlNovoItem = `<li class="pokemon" data-tipo="${tipo}">${nome}</li>`;
        document.getElementById('listaPokemons').insertAdjacentHTML('beforeend', htmlNovoItem);
    }
});

// 12. Após adicionar um novo Pokémon, limpe os campos do formulário.
document.getElementById('btnAdicionar').addEventListener('click', function() {
    document.getElementById('inputPokemon').value = '';
    document.getElementById('inputTipo').value = '';
});

// 13. Garanta que os novos itens adicionados à lista também possam ser clicados para atualizar a área de detalhes.
document.getElementById('listaPokemons').addEventListener('click', function(event) {
    if (event.target.tagName === 'LI') {
        const todosPokemons = document.querySelectorAll('#listaPokemons li');
        todosPokemons.forEach(function(item) {
            item.classList.remove('selecionado');
        });
        
        event.target.classList.add('selecionado');
        const tipo = event.target.getAttribute('data-tipo');
        document.getElementById('infoPokemon').textContent = 'Pokémon selecionado: ' + event.target.textContent + "  | tipo: " + tipo;
    }
});

// 14. Ao passar o mouse sobre a área de eventos, altere o texto para 'Mouse dentro da área!'. Ao sair da área, volte para 'Passe o mouse aqui'.
const area = document.getElementById('areaMouse');

area.addEventListener('mouseenter', function() {
    area.textContent = 'Mouse dentro da área!';
});

area.addEventListener('mouseleave', function() {
    area.textContent = 'Passe o mouse aqui';
});

// 15. Quando qualquer tecla do teclado for pressionada, mostre no parágrafo correspondente qual tecla foi pressionada.
document.addEventListener('keydown', function(event) {
    const paragrafoTeclado = document.getElementById('textoTeclado');
    if (paragrafoTeclado) {
        paragrafoTeclado.textContent = 'Tecla pressionada: ' + event.key;
    }
});

// 16. Ao clicar no botão 'Alterar título', além de mudar o texto, altere também a cor, o tamanho da fonte e o alinhamento do título.
document.getElementById('btnAlterarTitulo').addEventListener('click', function() {
    const titulo = document.getElementById('titulo');
    titulo.textContent = 'Novo Título Customizado!';
    titulo.style.color = 'red';
    titulo.style.fontSize = '40px';
    titulo.style.textAlign = 'center';
});

// 17. Utilize setAttribute() para alterar o link da Pokédex para outro endereço e modificar o texto do link.
const link = document.getElementById('linkPokedex');
link.setAttribute('href', 'https://www.pokemon.com/br/');
link.textContent = 'Site Oficial de Pokémon';

// 18. Utilize getAttribute() para exibir no console o src da imagem, o alt da imagem e o href do link.
const imagem = document.getElementById('imagemPokemon');
const linkA = document.getElementById('linkPokedex');

console.log('SRC:', imagem.getAttribute('src'));
console.log('ALT:', imagem.getAttribute('alt'));
console.log('HREF:', linkA.getAttribute('href'));

// 19. Crie dinamicamente um botão chamado 'Ocultar descrição'. Ao clicar nele, o parágrafo de descrição deve desaparecer. Se clicar novamente, ele deve reaparecer.
const btnOcultar = document.createElement('button');
btnOcultar.textContent = 'Ocultar descrição';
document.body.insertBefore(btnOcultar, document.getElementById('descricao'));

btnOcultar.addEventListener('click', function() {
    const desc = document.getElementById('descricao');
    if (desc.style.display === 'none') {
        desc.style.display = 'block';
        btnOcultar.textContent = 'Ocultar descrição';
    } else {
        desc.style.display = 'none';
        btnOcultar.textContent = 'Mostrar descrição';
    }
});

// 20. Mostre no console quantos filhos existem na lista de Pokémon, qual é o primeiro elemento e qual é o último.
const lista = document.getElementById('listaPokemons');
console.log('Quantidade de filhos:', lista.children.length);
console.log('Primeiro elemento:', lista.firstElementChild.textContent);
console.log('Último elemento:', lista.lastElementChild.textContent);  

// 21. Crie um botão 'Remover selecionado'. Ao clicar nele, remova da lista o Pokémon que estiver com a classe 'selecionado'.
const btnRemoverSel = document.createElement('button');
btnRemoverSel.textContent = 'Remover selecionado';
document.getElementById('secao-lista').appendChild(btnRemoverSel);

btnRemoverSel.addEventListener('click', function() {
    const selecionado = document.querySelector('#listaPokemons li.selecionado');
    if (selecionado) {
        selecionado.remove();
    }
});

// 22. Se o usuário tentar adicionar um Pokémon sem preencher o nome, exiba um alerta informando que o nome é obrigatório.
document.getElementById('btnAdicionar').addEventListener('click', function() {
    const nome = document.getElementById('inputPokemon').value.trim();
    if (nome === '') {
        alert('O nome do Pokémon é obrigatório!');
    }
});

// 23. Ao clicar em um Pokémon da lista, altere também a imagem exibida na área de detalhes.
document.getElementById('listaPokemons').addEventListener('click', function(event) {
    if (event.target.tagName === 'LI') {
        document.getElementById('imagemPokemon').src = 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/items/poke-ball.png';
    }
});

// 24. Crie um contador que mostre quantos Pokémon existem atualmente na lista e atualize esse valor.
const contadorParagrafo = document.createElement('p');
contadorParagrafo.style.fontWeight = 'bold';
document.getElementById('secao-lista').insertBefore(contadorParagrafo, document.getElementById('listaPokemons'));

function atualizarContagem() {
    const quantidade = document.getElementById('listaPokemons').children.length;
    contadorParagrafo.textContent = 'Total de Pokémon: ' + quantidade;
}

atualizarContagem();

document.getElementById('btnAdicionar').addEventListener('click', function() {
    setTimeout(atualizarContagem, 50); 
});

document.getElementById('btnRemoverUltimo').addEventListener('click', function() {
    setTimeout(atualizarContagem, 50);
});