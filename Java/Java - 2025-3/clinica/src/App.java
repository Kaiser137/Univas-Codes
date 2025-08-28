package modelo;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente p = new Paciente();
        p.idPaciente = 1;
        p.nome = "Aluno de POO"; 
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy"); 
        p.dataNascimento = df.parse("01/01/2000");
        p.telefone = "3599999999"; 
        p.email = "teste@email.com";
        System.out.println(p.idPaciente);
        System.out.println(p.nome);
        System.out.println(df.format(p.dataNascimento));
        System.out.println(p.telefone);
        System.out.println(p.email);
        p.atualizarContato("358888888888", "teste2@email.com");
        System.out.println(p.idPaciente);
        System.out.println(p.nome);
        System.out.println(df.format(p.dataNascimento));
        System.out.println(p.telefone);
        System.out.println(p.email);
    }
}
