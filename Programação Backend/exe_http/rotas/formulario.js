const querystring = require('querystring');

// Taxas fixas de conversão para BRL
const TAXAS = {
  USD: 5,
  EUR: 5.5,
};

// Rota POST /formulario - conversor de moedas
function formulario(req, res) {
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
    const valor = Number(dados.valor);
    const moeda = dados.moeda;

    if (isNaN(valor) || !TAXAS[moeda]) {
      res.statusCode = 400;
      res.end('Dados inválidos. Informe "valor" numérico e "moeda" (USD ou EUR).');
      return;
    }

    const valorConvertido = (valor * TAXAS[moeda]).toFixed(2);

    res.statusCode = 200;
    res.end(`${valor} ${moeda} equivalem a R$ ${valorConvertido}`);
  });
}

module.exports = formulario;
