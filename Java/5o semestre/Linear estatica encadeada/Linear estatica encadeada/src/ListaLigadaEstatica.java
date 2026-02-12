import java.util.Scanner;

public class ListaLigadaEstatica {
    private final Dado[] vetorDeNos;
    private int inicio;
    private int disponivel;

    ListaLigadaEstatica(int capacidade){
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva.");
        }
        this.vetorDeNos = new Dado[capacidade];
        this.inicio = -1;
        inicializarListaLivre();
    }

    private void inicializarListaLivre() {
        for (int i = 0; i < vetorDeNos.length; i++) {
            int proximo;
            
            if (i == vetorDeNos.length - 1) {
                proximo = -1;
            } else {
                proximo = i + 1;
            }
            
            vetorDeNos[i] = new Dado(0, proximo);
        }
        disponivel = 0; 
    }

    private void inserirListaLivre() {
        for (int i = 0; i < vetorDeNos.length; i++){
            if (disponivel == 0) {
                throw new IllegalArgumentException("Não há nenhum número disponível!");
            }
            System.out.print("Di")
        }
    }
}
