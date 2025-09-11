package utilidades;

import java.util.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class Emprestimo {
    private int idEmprestimo;
    private int idUsuario;
    private int idLivro;
    private Date data;
    private Time hora;
    private String status;

    // Agora o construtor recebe os 6 parâmetros
    public Emprestimo(int idEmprestimo, int idUsuario, int idLivro, Date data, Time hora, String status) {
        this.idEmprestimo = idEmprestimo;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.data = data;
        this.hora = hora;
        this.status = status;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
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

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String toCSV() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.join(";", 
            String.valueOf(idEmprestimo), 
            String.valueOf(idUsuario), 
            String.valueOf(idLivro),
            sdf.format(data), 
            hora.toString(), 
            status
        );
    }

    @Override
    
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return idEmprestimo + " - " + sdf.format(data) + " " + hora + " (" + status + ")";
    }
}
