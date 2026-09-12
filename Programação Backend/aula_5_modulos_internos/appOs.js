const os = require("os");
console.log("--- Exemplos com módulo os ---\n");
console.log("Arquitetura (arch):", os.arch());
console.log("Plataforma (platform):", os.platform());
console.log("Tipo (type):", os.type());
console.log("Release:", os.release());
console.log("Versão (version):", os.version());
console.log("Hostname:", os.hostname());
const cpus = os.cpus();
console.log("Número de CPUs:", cpus.length);
console.log("Modelo da primeira CPU:", cpus[0].model);
console.log(
  "Total de memória (MB):",
  (os.totalmem() / (1024 * 1024)).toFixed(2)
);
console.log("Memória livre (MB):", (os.freemem() / (1024 * 1024)).toFixed(2));
console.log("Tempo de atividade (SS):", os.uptime());
console.log("Home directory:", os.homedir());
console.log("Usuário atual:", os.userInfo().username);
console.log("Interfaces de rede:", os.networkInterfaces());
console.log("EOL (end-of-line):", JSON.stringify(os.EOL));
console.log(
  "Constantes do sistema:",
  Object.keys(os.constants).slice(0, 5),
  "...(e mais)"
);
console.log("\n--- Fim dos exemplos ---");
