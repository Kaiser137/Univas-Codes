public class GerenciadorImpressao {
    private FilaDinamica fila;
    
    public GerenciadorImpressao(){
        this.fila = new FilaDinamica();
    }


    public void enviarDocumento(int idDoc){
        fila.enfileirar(idDoc);
        System.out.println("Enviô!");
    }

    public void processarImpressao(){
        if (fila.isEmpty()) {
            System.out.println("A fila de impressão está vazia. Não há nada para imprimir.");
        } else {
            int idImpresso = fila.desenfileirar();
            System.out.println("Imprimindo documento: " + idImpresso);
        }
    }

    public void exibirFilaPendente(){
        fila.imprimir();
    }
}
