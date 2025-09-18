package modelo;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    private int idAgendamento;
    private Paciente paciente; // Substituído por objeto
    private Medico medico;     // Substituído por objeto
    private Date data;
    private Time hora;
    private String status; // Supondo que você tenha ou queira um status

    // Construtor atualizado
    public Agendamento(int idAgendamento, Paciente paciente, Medico medico, Date data, Time hora, String status) {
        this.idAgendamento = idAgendamento;
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.status = status;
    }

    // Getters e Setters atualizados
    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toCSV() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.join(";", String.valueOf(idAgendamento), String.valueOf(this.getPaciente().getIdPaciente()), String.valueOf(this.getMedico().getIdMedico()),
                sdf.format(data), hora.toString(), status);
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return idAgendamento + " - " + sdf.format(data) + " " + hora + " (" + status + ")";
    }
}
