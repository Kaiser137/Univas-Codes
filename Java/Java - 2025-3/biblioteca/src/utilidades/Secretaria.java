package utilidades;

import java.util.List;
import util.ManipuladorArquivos;
import controle.UsuarioControle;

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
        ManipuladorArquivos.salvarObjeto("Usuario", usuario,5);
    }

    public void atualizarContatoUsuario(int idUsuario, String telefone, String email){
        Usuario usuario = UsuarioControle.obterUsuario(idUsuario);
        usuario.atualizarContato(telefone, email);
        ManipuladorArquivos.atualizarObjeto("Usuario",idUsuario,usuario,5);
    }

    public void cadastrarEmprestimo(Emprestimo emprestimo){
        ManipuladorArquivos.salvarObjeto("Emprestimo",emprestimo,6);
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
