 package utilidades;

public class Biblioteca {
   private int idBiblioteca;
   private String nomeBiblioteca;
   private String endereco;
   private String telefone;

    public Biblioteca(int idBiblioteca, String nomeBiblioteca, String endereco, String telefone) {
        this.idBiblioteca = idBiblioteca;
        this.nomeBiblioteca = nomeBiblioteca;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
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

    public void atualizarBiblioteca(Biblioteca biblioteca){

    }

    public void cadastrarLivro(Livro livro){

    }

    public void cadastrarSecretaria(Secretaria secretaria){

    }

    public String toCSV() {
        return String.join(";", Integer.toString(idBiblioteca), nomeBiblioteca, endereco, telefone);
    }

    public String toString() {
        return "As informações da biblioteca " + nomeBiblioteca + " são: " + endereco + " - " + telefone;
    }
}

