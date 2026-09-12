// Rota GET /saudacao?nome=Joao
function saudacao(req, res, query) {
  res.setHeader('Content-Type', 'text/plain; charset=utf-8');

  const nome = query.nome;

  if (!nome) {
    res.statusCode = 400;
    res.end('Informe o parâmetro "nome" na URL. Exemplo: /saudacao?nome=Joao');
    return;
  }

  res.statusCode = 200;
  res.end(`Olá, ${nome}! Seja bem-vindo.`);
}

module.exports = saudacao;
