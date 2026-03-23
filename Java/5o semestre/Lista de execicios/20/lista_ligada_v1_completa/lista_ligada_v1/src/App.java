public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- INICIANDO TESTES: LISTA DINÂMICA (HEAP) ---");
        
        // 1. Criando a lista (Head aponta para null)
        ListaLigadaDinamica lista = new ListaLigadaDinamica();

        lista.inserirNoInicio(0);
        lista.inserirNoInicio(30);
        lista.inserirNoInicio(0);
        lista.inserirNoInicio(0);
        lista.inserirNoInicio(20);
        lista.inserirNoInicio(0);

        System.out.print("Estado atual da lista: ");
        lista.imprimir(); 

        lista.removerZeros();

        lista.imprimir();
        
        System.out.println("\n--- FIM DOS TESTES ---");
    }
}
