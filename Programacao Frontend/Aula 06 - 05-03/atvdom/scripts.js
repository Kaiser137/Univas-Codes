var Lista = document.getElementsByTagName("ul");
var segundaLista = Lista[1];
var itensSegundaLista = segundaLista.getElementsByTagName("li");

document.write("<p>Há " + itensSegundaLista.length + " elementos na segunda lista</p>");

document.write("<p>Texto dentro dos elementos da segunda lista: </p>");

for (let i = 0; i < itensSegundaLista.length; i++) {
    document.write("<p>" + itensSegundaLista[i].innerHTML + "</p>");
}