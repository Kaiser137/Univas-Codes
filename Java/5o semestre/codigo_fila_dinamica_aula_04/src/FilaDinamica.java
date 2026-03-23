public class FilaDinamica {
    private NoFila inicio; // Quem será atendido primeiro (onde fazemos o Dequeue)
    private NoFila fim;    // O último da fila (onde fazemos o Enqueue)

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
    }

    // Verifica se a fila está vazia. O(1)
    public boolean isEmpty() {
        return inicio == null;
    }

    // ENQUEUE: Entrar na fila (Sempre no final). O(1)
    public void enfileirar(int valor) {
        NoFila novoNo = new NoFila(valor);

        if (isEmpty()) {
            // Se a fila está vazia, o primeiro a chegar é simultaneamente o início e o fim
            inicio = novoNo;
            fim = novoNo;
        } else {
            // O último atual passa a apontar para o novato
            fim.proximo = novoNo;
            // O novato se torna o novo fim da fila
            fim = novoNo;
        }
    }

    // DEQUEUE: Sair da fila (Sempre do início). O(1)
    public int desenfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Erro: A fila está vazia! Não há ninguém para atender.");
        }

        int valorRemovido = inicio.dado; // Guarda o dado do primeiro
        inicio = inicio.proximo;         // O início pula para o segundo da fila

        // Detalhe crucial: se a fila esvaziou após essa remoção, precisamos zerar o 'fim' também
        if (inicio == null) {
            fim = null;
        }

        return valorRemovido; // O antigo primeiro da fila é levado pelo Garbage Collector
    }

    // PEEK / FRONT: Apenas olha quem é o próximo a ser atendido. O(1)
    public int observar() {
        if (isEmpty()) {
            throw new RuntimeException("Erro: A fila está vazia!");
        }
        return inicio.dado;
    }

    // Método auxiliar didático para o console. O(n)
    public void imprimir() {
        if (isEmpty()) {
            System.out.println("Fila: [ Vazia ]");
            return;
        }

        System.out.print("Fila (Início -> Fim): [ ");
        NoFila atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado);
            atual = atual.proximo;
            if (atual != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" ]");
    }
}