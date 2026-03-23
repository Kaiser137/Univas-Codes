document.addEventListener('DOMContentLoaded', function() {
    const nodeH1 = document.querySelector('h1');
    nodeH1.addEventListener("click", alteraConteudoTitulo);
});



function alteraConteudoTitulo() {
  const nodesH1 = document.querySelectorAll('h1');
  for (let node of nodesH1) {
    node.textContent = "Títulos alterados!";
  }
}