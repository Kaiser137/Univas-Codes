package controle;

import utilidades.Livro;
import util.ManipuladorArquivos;
import visao.menus.MenuBiblioteca;

import java.util.List;

import javax.swing.*;

public class LivroControle {

    public static void cadastrarLivro(String nome, String tema, String autor, String isbn, JFrame tela) {
        if (nome.isEmpty() || tema.isEmpty() || autor.isEmpty() || isbn.isEmpty()) {
            JOptionPane.showMessageDialog(tela, "Preencha todos os campos.");
            return;
        }

        int id = ManipuladorArquivos.proximoId("Livro");
        Livro l = new Livro(id, nome, tema, autor, isbn);
        BibliotecaControle.obterBiblioteca().cadastrarLivro(l);

        JOptionPane.showMessageDialog(tela, "Livro cadastrado com sucesso!");
        tela.dispose();
        new MenuBiblioteca();
    }

    public static Livro obterLivro(int idLivro){
        List<Livro> livros = ManipuladorArquivos.lerLivros();
        Livro livro = livros.stream()
            .filter(p -> p.getIdLivro() == idLivro)
            .findFirst()
            .orElse(null);
        return livro;
    }

}
