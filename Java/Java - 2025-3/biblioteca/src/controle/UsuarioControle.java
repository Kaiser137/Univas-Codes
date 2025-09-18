package controle;

import utilidades.Usuario;
import util.ManipuladorArquivos;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UsuarioControle {

    public static void cadastrarUsuario(String nome, String dataNascimentoStr, String telefone, String email, JFrame tela, int idSecretaria) {
        if (nome.isEmpty() || dataNascimentoStr.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(tela, "Preencha todos os campos.");
            return;
        }

        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(tela, "Email inválido.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento;
        try {
            dataNascimento = sdf.parse(dataNascimentoStr);
            if (dataNascimento.after(new Date())) {
                JOptionPane.showMessageDialog(tela, "Data de nascimento não pode ser futura.");
                return;
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(tela, "Data inválida. Use dd/MM/yyyy.");
            return;
        }
        int id = ManipuladorArquivos.proximoId("usuario");
        Usuario u = new Usuario(id, nome, dataNascimento, telefone, email);
        SecretariaControle.obterSecretaria(idSecretaria).cadastrarUsuario(u);

        JOptionPane.showMessageDialog(tela, "Usuário cadastrado com sucesso!");
        tela.dispose();
        new visao.menus.MenuSecretaria(idSecretaria);
    }

    public static Usuario obterUsuario(int idUsuario){
        List<Usuario> usuarios = ManipuladorArquivos.lerUsuarios();
        Usuario usuario = usuarios.stream()
            .filter(u -> u.getIdUsuario() == idUsuario)
            .findFirst()
            .orElse(null);
        return usuario;
    }

}
