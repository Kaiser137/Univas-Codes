package modelo;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    private int idAgendamento;
    private int idPaciente;
    private int idMedico;
    private Date data;
    private Time hora;
    private String status;

    public Agendamento(int idAgendamento, int idPaciente, int idMedico, Date data, Time hora, String status) {
        this.idAgendamento = idAgendamento;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.data = data;
        this.hora = hora;
        this.status = status;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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
        return String.join(";", String.valueOf(idAgendamento), String.valueOf(idPaciente), String.valueOf(idMedico),
                sdf.format(data), hora.toString(), status);
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return idAgendamento + " - " + sdf.format(data) + " " + hora + " (" + status + ")";
    }
}
