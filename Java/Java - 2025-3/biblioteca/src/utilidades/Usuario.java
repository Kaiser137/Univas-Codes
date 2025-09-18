package utilidades;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.ManipuladorArquivos;

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

    public List<Emprestimo> listarEmprestimo(){
        List<Emprestimo> todos = ManipuladorArquivos.lerEmprestimos();
        List<Emprestimo> meus = new ArrayList<>();
        for (Emprestimo ag : todos) {
            if (ag.getIdUsuario() == this.idUsuario) {
                meus.add(ag);
            }
        }
        return meus;
    }

    public boolean cancelarEmprestimo(int idEmprestimo){
        List<Emprestimo> emprestimos = ManipuladorArquivos.lerEmprestimos();
        Emprestimo encontrou = null;

        for (Emprestimo ag : emprestimos) {
            if (ag.getIdEmprestimo() == idEmprestimo && ag.getIdUsuario() == this.idUsuario) {
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

    public String toCSV() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return idUsuario + ";" + nome + ";" + sdf.format(dataNascimento) + ";" + telefone + ";" + email;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return nome;
    }
}
