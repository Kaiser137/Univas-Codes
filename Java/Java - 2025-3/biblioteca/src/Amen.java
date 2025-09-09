import utilidades.*;
import java.sql.Date;
import java.sql.Time;

public class Amen {

    public static void main(String[] args) {
    System.out.println("-----Instanciando a biblioteca-----\n");

    Biblioteca biblioteca = new Biblioteca(1, "Boa leitura", "Rua dos bobos, 0", "35 98873-9452");
    System.out.println(biblioteca);

    System.out.println("\n-----Instanciando o Livro-----\n");

    Livro livro = new Livro(1, "O Pequeno Princeso", "Fantasia");
    System.out.println(livro);

    System.out.println("\n-----Instanciando o Usuário-----\n");

    Date dataNascimento = Date.valueOf("1998-08-10");
    Usuario usuario = new Usuario(1, "Neymar", dataNascimento, "(35) 99826-8502", "neymar@gmail.com");
    System.out.println(usuario);

    System.out.println("\n-----Instanciando a Secretaria-----\n");

    Secretaria secretaria = new Secretaria(1, "Amanda", "Vespertino");
    System.out.println(secretaria);
    
    System.out.println("\n---Instanciando o emprestimo---\n");

    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    Time horaEmprestimo = new Time(System.currentTimeMillis());
    Emprestimo emprestimo = new Emprestimo(1, usuario.getIdUsuario(), livro.getIdLivro(), sqlDate, horaEmprestimo, "Ativo");

    System.out.println(emprestimo);
    }
}