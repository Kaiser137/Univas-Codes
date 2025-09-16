package modelo;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.ManipuladorArquivos;

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
        ManipuladorArquivos.atualizarObjeto("Paciente",idPaciente,this,5);
    }

    public List<Agendamento> listarAgendamentos() {
        List<Agendamento> todos = ManipuladorArquivos.lerAgendamentos();
        List<Agendamento> meus = new ArrayList<>();
        for (Agendamento ag : todos) {
            if (ag.getIdPaciente() == this.idPaciente) {
                meus.add(ag);
            }
        }
        return meus;
    }

    public boolean cancelarAgendamento(int idAgendamento) {
        List<Agendamento> agendamentos = ManipuladorArquivos.lerAgendamentos();
        Agendamento encontrou = null;

        for (Agendamento ag : agendamentos) {
            if (ag.getIdAgendamento() == idAgendamento && ag.getIdPaciente() == this.idPaciente) {
                ag.setStatus("Cancelado");
                encontrou = ag;
                break;
            }
        }

        if (encontrou!=null) {
            ManipuladorArquivos.atualizarObjeto("Agendamento", encontrou.getIdAgendamento(), encontrou, 6);
            return true;
        }else{
            return false;
        }
    }

    public String toCSV() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return idPaciente + ";" + nome + ";" + sdf.format(dataNascimento) + ";" + telefone + ";" + email;
    }

    public String toString() {
        return idPaciente+" - "+nome;
    }
}