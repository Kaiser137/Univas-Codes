package utilidades;

public class Livro {
    private int idLivro;
    private String nome;
    private String tema;

    public Livro(int idLivro, String nome, String tema) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.tema = tema;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void atualizarStatusEmprestimo(int idEmprestimo, String novoStatus){

    }

    public void listarEmprestimo(){

    }

     public String toCSV() {
        return String.join(";", Integer.toString(idLivro), nome, tema);
    }

    public String toString() {
        return "Informações do livro " + nome + " são: " + idLivro + " - " + tema;
    }
}
