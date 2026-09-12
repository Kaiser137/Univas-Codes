// exemplo-events.js
const EventEmitter = require("events");
// Criando um emissor de eventos
const meuEmissor = new EventEmitter();
// 1. Registrando ouvintes (listeners)
meuEmissor.on("mensagem", (msg) => {
  console.log("Evento mensagem recebido:", msg);
});
// 2. Ouvinte que só é chamado uma vez
meuEmissor.once("unico", () => {
  console.log("Este evento aparece apenas uma vez");
});
// 3. Emitindo eventos
meuEmissor.emit("mensagem", "Olá mundo!");
meuEmissor.emit("mensagem", "Segunda mensagem!");
meuEmissor.emit("unico");
meuEmissor.emit("unico"); // não dispara de novo
// 4. Removendo ouvintes
const handler = () => console.log("Vou ser removido...");
meuEmissor.on("remover", handler);
meuEmissor.emit("remover");
meuEmissor.removeListener("remover", handler);
meuEmissor.emit("remover"); // nada acontece
// 5. Contando ouvintes
meuEmissor.on("contagem", () => {});
meuEmissor.on("contagem", () => {});
console.log(
  "Número de ouvintes em contagem:",
  meuEmissor.listenerCount("contagem")
);
// 6. Listando eventos
console.log("Eventos registrados:", meuEmissor.eventNames());
