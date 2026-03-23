public class PilhaDinamica {
    private NoPilha topo; // A única porta de entrada e saída da nossa estrutura

    public PilhaDinamica() {
        this.topo = null; // A pilha nasce vazia
    }

    // Verifica se a pilha está vazia. O(1)
    public boolean isEmpty() {
        return topo == null;
    }

    // PUSH: Empilha um novo elemento no topo. O(1)
    public void push(int valor) {
        NoPilha novoNo = new NoPilha(valor); // Cria o objeto no Heap
        novoNo.proximo = topo; // O novo nó "pisa" em cima do topo atual
        topo = novoNo; // Atualizamos a referência do topo
    }

    // POP: Remove e retorna o elemento do topo. O(1)
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Erro: A pilha está vazia! Não há o que desempilhar.");
        }

        int valorRemovido = topo.dado; // Guarda o valor antes de perder a referência
        topo = topo.proximo; // O topo desce para o nó de baixo. O antigo fica sem referência (Garbage
                             // Collector limpa!)

        return valorRemovido;
    }

    // PEEK / TOP: Apenas espia quem está no topo sem remover. O(1)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Erro: A pilha está vazia!");
        }
        return topo.dado;
    }

    // Método auxiliar didático para visualizar a pilha no console. O(n)
    public void imprimir() {
        if (isEmpty()) {
            System.out.println("Pilha: [ Vazia ]");
            return;
        }

        System.out.println("--- TOPO ---");
        NoPilha atual = topo;
        while (atual != null) {
            System.out.println("    " + atual.dado);
            atual = atual.proximo;
        }
        System.out.println("--- BASE ---");
    }

    public static String converter(int numero) {
        NoPilha topo = null;
        String resultado = "";

        if (numero == 0)
            return "0";

        while (numero > 0) {
            int resto = numero % 2;
            NoPilha novoNo = new NoPilha(resto);

            novoNo.proximo = topo;
            topo = novoNo;

            numero = numero / 2;
        }

        while (topo != null) {
            resultado += topo.dado;
            topo = topo.proximo;
        }

        return resultado;
    }
}