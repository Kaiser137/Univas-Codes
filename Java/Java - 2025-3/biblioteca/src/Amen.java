import utilidades.*;
import util.ManipuladorArquivos;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Amen {
    public static void main(String[] args) {
        System.out.println("--- Gerenciamento de Usuario ---");
        List<Usuario> usuario = new ArrayList<>();
        usuario = ManipuladorArquivos.lerUsuarios();
        System.out.println("Usuario carregados do arquivo: " + usuario.size());
        int novoId = ManipuladorArquivos.proximoId("Usuario");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        try {
            dataNascimento = sdf.parse("15/05/1990");
        } catch (java.text.ParseException e) {
            System.out.println("Erro ao converter data de nascimento: " + e.getMessage());
            return;
        }
        Usuario novoUsuario = new Usuario(novoId, "Pedro Silva", dataNascimento, "(35) 99123-4567", "pedro.s@email.com");
        ManipuladorArquivos.salvarObjeto("Usuario", novoUsuario, 5);
        System.out.println("Novo usuario salvo: " + novoUsuario.getNome());
        usuario.add(novoUsuario);
        System.out.println("\n--- Lista Completa de Usuario ---");
        for (Usuario u : usuario) {
            System.out.println(u.toString());
        }
    }
}


