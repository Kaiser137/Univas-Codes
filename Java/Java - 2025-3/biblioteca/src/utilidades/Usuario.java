package utilidades;
import java.sql.Date;
import java.sql.Time;
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
        return idUsuario + ";" + nome + ";" + sdf.format(dataNascimento) + ";" + telefone + ";" + email;
    }

    public String toString() {
        return idUsuario+" - "+ nome + " - " + dataNascimento + " - " + telefone + " - " + email ;
    }
}
