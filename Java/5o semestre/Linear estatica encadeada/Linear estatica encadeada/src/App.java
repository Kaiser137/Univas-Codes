public class App {
    public static void main(String[] args) {
        // Simulação de uso da lista ligada estática.
        ListaLigadaEstatica lista = new ListaLigadaEstatica(10);

        // Inserções
        lista.adicionar(8);
        lista.adicionar(3);
        lista.adicionar(10);
        lista.adicionar(1);
        lista.adicionar(6);
        System.out.print("Lista inicial: ");
        lista.imprimir();

        // Busca
        int indice = lista.buscar(10);
        System.out.println("Buscar 10 -> indice: " + indice);

        // Alteração
        boolean alterado = lista.alterar(3, 4);
        System.out.println("Alterar 3 para 4 -> " + alterado);
        System.out.print("Depois de alterar: ");
        lista.imprimir();

        // Exclusão
        boolean excluido = lista.excluir(8);
        System.out.println("Excluir 8 -> " + excluido);
        System.out.print("Depois de excluir: ");
        lista.imprimir();

    }
}
