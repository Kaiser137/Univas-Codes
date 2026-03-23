public class ListaLigadaDinamica {
    private No inicio; // O famoso "Head". É a nossa única porta de entrada para a lista.

    public ListaLigadaDinamica() {
        this.inicio = null; // A lista começa vazia
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    // TODO: Implementar public void inserirNoInicio(int valor)
    public void inserirNoInicio(int valor){
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    // TODO: Implementar public void imprimir()
    public void imprimir(){
        No atual = inicio;
        while(atual != null){
            System.out.println(atual.dado + " --> ");
            atual = atual.proximo;
        }
        if (atual == null){
            System.out.println("Vai dá não!");
        }
    }

    // TODO: Implementar public void excluir(int valor)
    public void excluir(int valor){
        if (inicio == null) {
            System.out.println("Vai dá não!");
            return;
        }

        No atual = inicio;
        No anterior = null;
        while (atual != null && valor != atual.dado){
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null){
            System.out.println("Vai dá não!");
            return;
        }

        // remover o primeiro elemento
        if (anterior == null){
            inicio = atual.proximo;
        } else {
            // remover elemento do meio/final
            anterior.proximo = atual.proximo;
        }
    }
    // TODO: Implementar public boolean buscar(int valor)
}
