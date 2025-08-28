import utilidades.*;
import java.sql.Date;
import java.sql.Time;

public class Main {

    public static void main(String[] args) {
    System.out.println("-----Instanciando a biblioteca-----");

    Biblioteca biblioteca = new Biblioteca(1, "Biblioteca Bem Legal", "Rua dos bobos, 0", "35 98873-9452");
    System.out.println("Nome da biblioteca: " + biblioteca.getNomeBiblioteca());
    System.out.println("Endereço: " + biblioteca.getEndereco());
    System.out.println("Telefone: " + biblioteca.getTelefone());
    System.out.println(biblioteca);
    
    System.out.println("---dados do emprestimo---");
    Date dataEmprestimo = Date.valueOf("10.08.2025");
    Emprestimo emprestimo = new Emprestimo(data "",hora"", status "");

    System.out.println("-----Instanciando o Livro-----");

    Livro livro = new Livro(1, "O Pequeno Princeso", "Fantasia");
    
    System.out.println("Nome do livro: " + livro.getNome());
    System.out.println("Tema do livro: " + livro.getTema());
    System.out.println(livro);

    }
}
