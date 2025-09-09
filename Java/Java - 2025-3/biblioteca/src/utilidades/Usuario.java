package utilidades;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Usuario {
    private int idUsuario;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;

    public Usuario(int idUsuario, String nome, Date dataNascimento, String telefone, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void atualizarContato(String novoTelefone, String novoEmail){
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }

    public void listarEmprestimo(){

    }

    public void cancelarEmprestimo(int idEmprestimo){

    }

    public String toCSV() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return idUsuario + ";" + nome + ";" + sdf.format(dataNascimento) + ";" + telefone + ";" + email;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "As informações do Usuário " + nome + " são: " + idUsuario + " - " + sdf.format(dataNascimento) + " - " + telefone + " - " + email;
    }
}
