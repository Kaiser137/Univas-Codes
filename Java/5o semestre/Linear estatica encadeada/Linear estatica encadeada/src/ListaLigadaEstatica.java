public class ListaLigadaEstatica {
    // Array que armazena os nós (estrutura estática).
    private final Elemento[] vetorDeNos;
    // Índice do primeiro elemento lógico da lista.
    private int inicio;
    // Índice do primeiro espaço livre na lista de disponíveis.
    private int disponivel;

    ListaLigadaEstatica(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva.");
        }
        // Cria o array de nós com a capacidade definida.
        this.vetorDeNos = new Elemento[capacidade];
        this.inicio = -1; // Lista começa vazia
        // Prepara a lista de espaços livres.
        inicializarListaLivre();
    }

    private void inicializarListaLivre() {
        for (int i = 0; i < vetorDeNos.length; i++) {
            int proximo;
            
            // Se for o último índice, aponta para -1 (fim da lista)
            if (i == vetorDeNos.length - 1) {
                proximo = -1;
            } else {
                // Caso contrário, aponta para a próxima posição do array
                proximo = i + 1;
            }
            
            vetorDeNos[i] = new Elemento(0, proximo);
        }
        disponivel = 0; // O primeiro espaço livre é o índice 0
    }

    // Remove o primeiro índice da lista de disponíveis.
    private int obterNoLivre() {
        if (disponivel == -1) {
            throw new IllegalStateException("Lista cheia.");
        }
        // Retira o primeiro índice disponível.
        int indice = disponivel;
        // Atualiza a cabeça da lista de disponíveis.
        disponivel = vetorDeNos[indice].proximo;
        return indice;
    }

    // Devolve um índice para a lista de disponíveis.
    private void devolverNoLivre(int indice) {
        // Encadeia o índice devolvido no início da lista de disponíveis.
        vetorDeNos[indice].proximo = disponivel;
        disponivel = indice;
    }

    public boolean estaVazia() {
        // Lista vazia quando não há cabeça definida.
        return inicio == -1;
    }

    // Insere no fim da lista (ordem lógica).
    public void adicionar(int dado) {
        // Pega um espaço livre e grava o valor.
        int novo = obterNoLivre();
        vetorDeNos[novo].dado = dado;
        vetorDeNos[novo].proximo = -1;

        if (inicio == -1) {
            // Se a lista estava vazia, o novo vira a cabeça.
            inicio = novo;
            return;
        }

        int atual = inicio;
        // Percorre até o último nó lógico.
        while (vetorDeNos[atual].proximo != -1) {
            atual = vetorDeNos[atual].proximo;
        }
        // Encadeia o novo no fim.
        vetorDeNos[atual].proximo = novo;
    }

    // Remove a primeira ocorrência do dado.
    public boolean excluir(int dado) {
        int anterior = -1;
        int atual = inicio;
        // Procura o nó e guarda o anterior para religar.
        while (atual != -1 && vetorDeNos[atual].dado != dado) {
            anterior = atual;
            atual = vetorDeNos[atual].proximo;
        }
        if (atual == -1) {
            // Não encontrou.
            return false;
        }
        if (anterior == -1) {
            // Remoção do primeiro nó.
            inicio = vetorDeNos[atual].proximo;
        } else {
            // Religa o anterior ao próximo do removido.
            vetorDeNos[anterior].proximo = vetorDeNos[atual].proximo;
        }
        // Devolve o nó removido para a lista de disponíveis.
        devolverNoLivre(atual);
        return true;
    }

    // Atualiza a primeira ocorrência do valor antigo.
    public boolean alterar(int antigo, int novo) {
        // Procura o valor antigo para atualizar.
        int indice = buscar(antigo);
        if (indice == -1) {
            return false;
        }
        // Troca o dado no nó encontrado.
        vetorDeNos[indice].dado = novo;
        return true;
    }

    // Retorna o índice do nó encontrado ou -1 se não existir.
    public int buscar(int dado) {
        int atual = inicio;
        // Varre a lista até achar o valor.
        while (atual != -1) {
            if (vetorDeNos[atual].dado == dado) {
                return atual;
            }
            atual = vetorDeNos[atual].proximo;
        }
        return -1;
    }

    // Conta quantos nós estão na lista.
    public int tamanho() {
        int count = 0;
        int atual = inicio;
        // Conta nós até o fim da lista.
        while (atual != -1) {
            count++;
            atual = vetorDeNos[atual].proximo;
        }
        return count;
    }

    // Exibe a lista no formato [a, b, c].
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int atual = inicio;
        // Monta a saída na ordem lógica.
        while (atual != -1) {
            sb.append(vetorDeNos[atual].dado);
            atual = vetorDeNos[atual].proximo;
            if (atual != -1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}

