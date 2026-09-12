const http = require('http');
const fs = require('fs');
const path = require('path');
const url = require('url');

const saudacao = require('./rotas/saudacao');
const dobro = require('./rotas/dobro');
const formulario = require('./rotas/formulario');
const soma = require('./rotas/soma');

const port = 3000;

function handleHome(res) {
  const filePath = path.join(__dirname, 'index.html');

  fs.readFile(filePath, (err, data) => {
    if (err) {
      res.statusCode = 500;
      res.setHeader('Content-Type', 'text/plain; charset=utf-8');
      res.end('Erro ao carregar a página inicial.');
      return;
    }

    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/html; charset=utf-8');
    res.end(data);
  });
}

function handleNotFound(res) {
  res.statusCode = 404;
  res.setHeader('Content-Type', 'text/plain; charset=utf-8');
  res.end('404 - Página não encontrada');
}

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const pathname = parsedUrl.pathname;

  switch (pathname) {
    case '/':
      handleHome(res);
      break;
    case '/saudacao':
      saudacao(req, res, parsedUrl.query);
      break;
    case '/dobro':
      dobro(req, res, parsedUrl.query);
      break;
    case '/formulario':
      formulario(req, res);
      break;
    case '/soma':
      soma(req, res);
      break;
    default:
      handleNotFound(res);
  }
});

server.listen(port, () => {
  console.log(`Servidor rodando em http://localhost:${port}`);
});
