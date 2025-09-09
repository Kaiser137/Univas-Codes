package utilidades;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Usuario {
    private int idUsuario;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;

    public Usuario(int idUsuario, String nome, java.util.Date dataNascimento2, String telefone, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        String dataFormatada = (dataNascimento != null) ? sdf.format(dataNascimento) : "";
        return String.join(";", String.valueOf(idUsuario), nome, dataFormatada, telefone, email);
    }
    

    public String toString() {
        return "As informações do Usuário " + nome + " são: " + idUsuario + " - " + dataNascimento + " - " + telefone + " - " + email;
    }
}
