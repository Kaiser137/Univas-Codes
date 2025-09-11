package utilidades;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import util.ManipuladorArquivos;

public class Secretaria {
   private int idSecretaria;
   private String nome;
   private String turno;

    public Secretaria(int idSecretaria, String nome, String turno) {
        this.idSecretaria = idSecretaria;
        this.nome = nome;
        this.turno = turno;
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void cadastrarUsuario(Usuario usuario){

    }

    public void atualizarContatoUsuario(int idUsuario, String telefone, String email){

    }

    public void cadastrarEmprestimo(Emprestimo emprestimo){
        ManipuladorArquivos.salvarObjeto("agendamento",emprestimo,6);
    }

    public List<Emprestimo> listarEmprestimos(){
        List<Emprestimo> todos = ManipuladorArquivos.lerEmprestimos();
        return todos;
    }

    public String toCSV() {
        return String.join(";", Integer.toString(idSecretaria), nome, turno);
    }

    public String toString() {
        return "As informações da Secretaria " + nome + " são: " + idSecretaria + " - " + turno;
    }
}
