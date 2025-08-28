package modelo;

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

    public String toCSV() {
        return String.join(";", Integer.toString(idMedico), nome, especialidade, crm);
    }

    public String toString() {
        return idMedico+" - "+nome;
    }
}