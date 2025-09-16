package utilidades;

import java.util.ArrayList;
import java.util.List;

import util.ManipuladorArquivos;

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

    public boolean atualizarStatusEmprestimo(int idEmprestimo, String novoStatus){
        List<Emprestimo> emprestimos = ManipuladorArquivos.lerEmprestimos();
        Emprestimo encontrou = null;

        for (Emprestimo ag : emprestimos) {
            if (ag.getIdEmprestimo() == idEmprestimo && ag.getIdLivro() == this.idLivro) {
                ag.setStatus("Cancelado");
                encontrou = ag;
                break;
            }
        }

        if (encontrou!=null) {
            ManipuladorArquivos.atualizarObjeto("Emprestimo", encontrou.getIdEmprestimo(), encontrou, 6);
            return true;
        }else{
            return false;
        }
    }

    public List<Emprestimo> listarEmprestimo(){
        List<Emprestimo> todos = ManipuladorArquivos.lerEmprestimos();
        List<Emprestimo> meus = new ArrayList<>();
        for (Emprestimo ag : todos) {
            if (ag.getIdLivro() == this.idLivro) {
                meus.add(ag);
            }
        }
        return meus;
    }

     public String toCSV() {
        return String.join(";", Integer.toString(idLivro), nome, tema);
    }

    public String toString() {
        return "Informações do livro " + nome + " são: " + idLivro + " - " + tema;
    }
}
