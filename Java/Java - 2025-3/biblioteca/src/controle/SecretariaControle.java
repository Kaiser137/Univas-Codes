package controle;

import utilidades.Secretaria;
import util.ManipuladorArquivos;

import java.util.List;

import javax.swing.*;

public class SecretariaControle {

    public static void cadastrarSecretaria(String nome, String turno, JFrame tela) {
        if (nome.isEmpty() || turno.isEmpty()) {
            JOptionPane.showMessageDialog(tela, "Preencha todos os campos.");
            return;
        }

        int id = ManipuladorArquivos.proximoId("Secretaria");
        Secretaria s = new Secretaria(id, nome, turno);
        BibliotecaControle.obterBiblioteca().cadastrarSecretaria(s);

        JOptionPane.showMessageDialog(tela, "Secretaria cadastrada com sucesso!");
        tela.dispose();
        new visao.menus.MenuBiblioteca();
    }

    public static Secretaria obterSecretaria(int idSecretaria){
        List<Secretaria> secretarias = ManipuladorArquivos.lerSecretarias();
        Secretaria secretaria = secretarias.stream()
            .filter(p -> p.getIdSecretaria() == idSecretaria)
            .findFirst()
            .orElse(null);
        return secretaria;
    }
}

