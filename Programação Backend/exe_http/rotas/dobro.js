// Rota GET /dobro?numero=5
function dobro(req, res, query) {
  res.setHeader('Content-Type', 'text/plain; charset=utf-8');

  const numero = Number(query.numero);

  if (query.numero === undefined || isNaN(numero)) {
    res.statusCode = 400;
    res.end('Informe um número válido no parâmetro "numero". Exemplo: /dobro?numero=5');
    return;
  }

  res.statusCode = 200;
  res.end(`O dobro de ${numero} é ${numero * 2}.`);
}

module.exports = dobro;
