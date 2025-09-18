package modelo;

import java.util.ArrayList;
import java.util.List;

import util.ManipuladorArquivos;

public class Medico {
    private int idMedico;
    private String nome;
    private String especialidade;
    private String crm;

    public Medico(int id, String nome, String especialidade, String crm) {
        this.idMedico = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public int getIdMedico() {
        return idMedico;
    }

        public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Agendamento> listarAgendamentos() {
        List<Agendamento> todos = ManipuladorArquivos.lerAgendamentos();
        List<Agendamento> meus = new ArrayList<>();
        for (Agendamento ag : todos) {
            if (ag.getMedico().getIdMedico() == this.idMedico) {
                meus.add(ag);
            }
        }
        return meus;
    }

    public boolean atualizarStatusAgendamento(int idAgendamento, String novoStatus) {
        List<Agendamento> agendamentos = ManipuladorArquivos.lerAgendamentos();
        Agendamento encontrou = null;

        for (Agendamento ag : agendamentos) {
            if (ag.getIdAgendamento() == idAgendamento && ag.getMedico().getIdMedico() == this.idMedico) {
                ag.setStatus(novoStatus);
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
        return String.join(";", Integer.toString(idMedico), nome, especialidade, crm);
    }

    public String toString() {
        return idMedico+" - "+nome;
    }
}