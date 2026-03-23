public class GerenciadorAtendimento {
    private FilaDinamica fila;
    
    public GerenciadorAtendimento(){
        this.fila = new FilaDinamica();
    }

    public void abrirChamado(int idChamado){
        fila.enfileirar(idChamado);
        System.out.println("Chamado " + idChamado + " aberto com sucesso!");
    }

    public void verificarProximoChamado(){
        if(fila.isEmpty()){
            System.out.println("Nenhum chamado na fila no momento.");
        } else {
            System.out.println("O próximo chamado eh: " + fila.observar());
        }
    }

    public void atenderChamado(){
        if(fila.isEmpty()){
            System.out.println("Vai dá não!");
        } else {
            int idAtendido = fila.desenfileirar();
            System.out.println("O técnico começou a trabalhar no chamado ID: " + idAtendido);
        }
    }

    public void exibirPainel(){
        fila.imprimir();
    }
}