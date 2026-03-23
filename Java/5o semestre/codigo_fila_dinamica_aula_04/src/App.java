public class App {
    public static void main(String[] args) throws Exception {
        
        // =======================================================
        // TESTES: GERENCIADOR DE IMPRESSÃO
        // =======================================================
        System.out.println("=== INICIANDO O GERENCIADOR DE IMPRESSÃO ===\n");

        GerenciadorImpressao impressora = new GerenciadorImpressao();

        System.out.println("1. Enviando documentos para a impressora (IDs: 101, 102)...");
        impressora.enviarDocumento(101); // Imprime: Enviô!
        impressora.enviarDocumento(102); // Imprime: Enviô!

        System.out.println("\n2. Verificando a fila de impressão:");
        impressora.exibirFilaPendente(); // Esperado: Fila: [ 101 -> 102 ]

        System.out.println("\n3. A impressora processou o primeiro documento...");
        impressora.processarImpressao(); // Imprime: Dsinfilerô!

        System.out.println("\n4. Fila de impressão restante:");
        impressora.exibirFilaPendente(); // Esperado: Fila: [ 102 ]


        System.out.println("\n--------------------------------------------------\n");


        // =======================================================
        // TESTES: GERENCIADOR DE ATENDIMENTO
        // =======================================================
        System.out.println("=== INICIANDO O GERENCIADOR DE ATENDIMENTO ===\n");

        GerenciadorAtendimento suporte = new GerenciadorAtendimento();

        System.out.println("1. Abrindo chamados no sistema (IDs: 500, 501, 502)...");
        suporte.abrirChamado(500); // Imprime: Enviô!
        suporte.abrirChamado(501); // Imprime: Enviô!
        suporte.abrirChamado(502); // Imprime: Enviô!

        System.out.println("\n2. Exibindo o painel de chamados:");
        suporte.exibirPainel(); // Esperado: Fila: [ 500 -> 501 -> 502 ]

        System.out.println("\n3. Verificando quem será o próximo a ser atendido:");
        suporte.verificarProximoChamado(); // Esperado: O próximo chamado eh: 500

        System.out.println("\n4. Atendente pegou o primeiro chamado...");
        suporte.atenderChamado(); // Imprime: Desinfilerô!

        System.out.println("\n5. Exibindo o painel atualizado:");
        suporte.exibirPainel(); // Esperado: Fila: [ 501 -> 502 ]

        System.out.println("\n=== FIM DOS TESTES DE GERENCIAMENTO ===");
    }
}