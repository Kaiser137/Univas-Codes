public class ListaLigadaDinamica {
    private No inicio; // O famoso "Head". É a nossa única porta de entrada para a lista.

    public ListaLigadaDinamica() {
        this.inicio = null; // A lista começa vazia
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void inserirNoInicio(int valor){
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }
    public void imprimir(){
        System.out.print("[");
        No atual = inicio;
        while(atual != null){
            System.out.print(atual.dado);
            atual = atual.proximo;
            if(atual != null){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    public void excluir(int valor){
        if(estaVazia()) return;

        if(inicio.dado==valor){
            inicio = inicio.proximo;
            return;
        }
        No atual = inicio;
        No anterior = null;

        while(atual != null && atual.dado!=valor){
            anterior = atual;
            atual = atual.proximo;
        }
        if(atual !=null){
            anterior.proximo = atual.proximo;
        }

    }

    public boolean buscar(int valor){
        No atual = inicio;
        while (atual != null) {
            if(atual.dado == valor){
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void removerZeros() {
        while (inicio != null && inicio.dado == 0) {
            inicio = inicio.proximo;
        }

        if (estaVazia());

        No atual = inicio;

        while (atual.proximo != null) {
            
            if (atual.proximo.dado == 0) {
                atual.proximo = atual.proximo.proximo;
            } else {
                atual = atual.proximo;
            }
        }
    }
}
