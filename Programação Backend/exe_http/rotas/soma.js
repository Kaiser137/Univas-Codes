const querystring = require('querystring');

// Rota POST /soma
function soma(req, res) {
  res.setHeader('Content-Type', 'text/plain; charset=utf-8');

  if (req.method !== 'POST') {
    res.statusCode = 405;
    res.end('Método não permitido. Use POST.');
    return;
  }

  let body = '';

  req.on('data', (chunk) => {
    body += chunk;
  });

  req.on('end', () => {
    const dados = querystring.parse(body);
    const a = Number(dados.a);
    const b = Number(dados.b);

    if (isNaN(a) || isNaN(b)) {
      res.statusCode = 400;
      res.end('Informe os números "a" e "b" corretamente.');
      return;
    }

    res.statusCode = 200;
    res.end(`A soma de ${a} + ${b} é ${a + b}.`);
  });
}

module.exports = soma;
