public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- INICIANDO TESTE: CONCATENAR LISTAS ---");

        // 1. Criando a primeira lista
        ListaLigadaDinamica trem1 = new ListaLigadaDinamica();
        // Lembrando que inserir no início inverte a ordem de chegada.
        // Inserindo 3, depois 2, depois 1, a lista fica: [1, 2, 3]
        trem1.inserirNoInicio(3);
        trem1.inserirNoInicio(2);
        trem1.inserirNoInicio(1);

        // 2. Criando a segunda lista
        ListaLigadaDinamica trem2 = new ListaLigadaDinamica();
        // Inserindo 6, depois 5, depois 4, a lista fica: [4, 5, 6]
        trem2.inserirNoInicio(6);
        trem2.inserirNoInicio(5);
        trem2.inserirNoInicio(4);

        // 3. Mostrando o estado inicial das duas listas
        System.out.print("Trem 1 antes da união: ");
        trem1.imprimir(); 
        
        System.out.print("\nTrem 2 antes da união: ");
        trem2.imprimir();

        // 4. O Grande Momento: Concatenar!
        // Vamos chamar o método a partir do trem1 e passar o trem2 como parâmetro.
        System.out.println("\n\n>>> Realizando a concatenação... <<<");
        trem1.concatenar(trem2);

        // 5. Mostrando o resultado final
        System.out.print("\nTrem 1 após concatenar: ");
        trem1.imprimir(); // O esperado é imprimir: [1, 2, 3, 4, 5, 6]

        System.out.println("\n\n--- FIM DO TESTE ---");
    }
}
