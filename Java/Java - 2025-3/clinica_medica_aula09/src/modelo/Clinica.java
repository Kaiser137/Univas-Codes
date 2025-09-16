package modelo;

import util.ManipuladorArquivos;

public class Clinica {
    private int idClinica;
    private String nomeClinica;
    private String endereco;
    private String telefone;

    public Clinica(int idClinica, String nomeClinica, String endereco, String telefone) {
        this.idClinica = idClinica;
        this.nomeClinica = nomeClinica;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void atualizarClinica(String novoNome, String novoTelefone, String novoEndereco) {
        this.nomeClinica = novoNome;
        this.telefone = novoTelefone;
        this.endereco = novoEndereco;
    }

    public void cadastrarMedico(Medico novoMedico) {
        ManipuladorArquivos.salvarObjeto("medicos",novoMedico,4);
    }

    public void cadastrarSecretaria(Secretaria novaSecretaria) {
        ManipuladorArquivos.salvarObjeto("secretaria",novaSecretaria,3);
    }

    public String toCSV() {
        return String.join(";", Integer.toString(idClinica), nomeClinica, endereco, telefone);
    }
}