package modelo;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Paciente {
    private int idPaciente;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;

    public Paciente(int id, String nome, Date dataNascimento, String telefone, String email) {
        this.idPaciente = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }
    public Paciente(){
        
    }
    public int getIdPaciente() {
        return idPaciente;
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

    public void atualizarContato(String novoTelefone, String novoEmail) {
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }


    public String toCSV() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return idPaciente + ";" + nome + ";" + sdf.format(dataNascimento) + ";" + telefone + ";" + email;
    }

    public String toString() {
        return idPaciente+" - "+nome;
    }
}