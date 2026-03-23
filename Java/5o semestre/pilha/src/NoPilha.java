public class NoPilha {
    public int dado;
    public NoPilha proximo; // Aponta para o nó que está "embaixo" dele na pilha

    public NoPilha(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}
