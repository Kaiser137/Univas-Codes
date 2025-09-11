package controle;

import utilidades.Biblioteca;
import util.ManipuladorArquivos;

import java.util.List;

import javax.swing.*;

public class BibliotecaControle {

    public static void cadastrarBiblioteca(String nome, String endereco, String telefone, JFrame tela) {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(tela, "Preencha todos os campos.");
            return;
        }

        int id = ManipuladorArquivos.proximoId("Biblioteca");
        Biblioteca b = new Biblioteca(id, nome, endereco, telefone);
        ManipuladorArquivos.salvar("Biblioteca", b.toCSV(),4);

        JOptionPane.showMessageDialog(tela, "Biblioteca cadastrada com sucesso!");
        tela.dispose();
        new visao.menus.MenuBiblioteca();
    }

    public static Biblioteca obterBiblioteca() {
        List<Biblioteca> lista = ManipuladorArquivos.lerBiblioteca();
        return lista.isEmpty() ? null : lista.get(0);
    }
}
