public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("🔄 --- INICIANDO O DESAFIO SUPREMO: INVERTER LISTA --- 🔄\n");

        // 1. Criando a nossa lista (o trem)
        ListaLigadaDinamica trem = new ListaLigadaDinamica();

        // 2. Adicionando os vagões. 
        // Lembre-se: como o seu método é 'inserirNoInicio', o último a entrar fica na frente!
        // Inserindo nesta ordem, a lista final será: [1, 2, 3, 4, 5]
        System.out.println("Engatando os vagões na lista...");
        trem.inserirNoInicio(5);
        trem.inserirNoInicio(4);
        trem.inserirNoInicio(3);
        trem.inserirNoInicio(2);
        trem.inserirNoInicio(1);

        // 3. Mostrando o estado original
        System.out.print("\nLista ORIGINAL: ");
        trem.imprimir(); // O esperado é imprimir: [1, 2, 3, 4, 5]

        // 4. A Mágica dos 3 Ponteiros!
        System.out.println("\n\n>>> Executando o inverterLista()... <<<");
        trem.inverterLista();

        // 5. O Resultado Final
        System.out.print("\nLista INVERTIDA: ");
        trem.imprimir(); // O esperado é imprimir: [5, 4, 3, 2, 1]

        System.out.println("\n\n🎉 --- FIM DA LISTA DE EXERCÍCIOS! VOCÊ VENCEU! --- 🎉");
    }
}
