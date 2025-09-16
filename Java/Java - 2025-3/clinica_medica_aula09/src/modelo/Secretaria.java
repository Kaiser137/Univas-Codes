package modelo;

import util.ManipuladorArquivos;
import controle.PacienteControle;

import java.util.List;

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
    public void cadastrarPaciente(Paciente paciente) {
        ManipuladorArquivos.salvarObjeto("paciente",paciente,5);
    }

    public void atualizarContatoPaciente(int idPaciente, String novoTelefone, String novoEmail) {
        Paciente paciente = PacienteControle.obterPaciente(idPaciente);
        paciente.atualizarContato(novoTelefone, novoEmail);
        ManipuladorArquivos.atualizarObjeto("paciente",idPaciente,paciente,5);
    }

    public void cadastrarAgendamento(Agendamento agendamento) {
        ManipuladorArquivos.salvarObjeto("agendamento",agendamento,6);
    }

    public List<Agendamento> listarAgendamentos() {
        List<Agendamento> todos = ManipuladorArquivos.lerAgendamentos();
        return todos;
    }

    public String toCSV() {
        return String.join(";", Integer.toString(idSecretaria), nome, turno);
    }
}