public class No {
    int dado;
    int anterior;
    No proximo; // Aponta para o próximo objeto No no Heap (ou null se for o último)

    public No(int dado) {
        this.dado = dado;
        this.anterior = -1;
        this.proximo = null; // Por padrão, um novo nó não aponta para ninguém
    }
}
