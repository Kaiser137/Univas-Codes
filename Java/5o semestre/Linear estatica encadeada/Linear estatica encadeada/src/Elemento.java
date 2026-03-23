public class Elemento {
    // Valor armazenado no nó.
    int dado;
    // Índice do próximo nó no array (-1 indica fim da lista).
    int proximo;

    Elemento(int dado, int proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }
}


