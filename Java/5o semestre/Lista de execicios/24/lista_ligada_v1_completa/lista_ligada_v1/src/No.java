public class No {
    int dado;
    No proximo; // Aponta para o próximo objeto No no Heap (ou null se for o último)

    public No(int dado) {
        this.dado = dado;
        this.proximo = null; // Por padrão, um novo nó não aponta para ninguém
    }
}
