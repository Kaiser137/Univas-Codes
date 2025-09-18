package visao.telas;

import controle.LivroControle;

import javax.swing.*;
import java.awt.*;

public class TelaCadastroLivro extends JFrame {

    public TelaCadastroLivro() {
        setTitle("Cadastrar Livro");
        setSize(400, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(5, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblTema = new JLabel("Tema:");
        JTextField txtTema = new JTextField();

        JLabel lblAutor = new JLabel("Autor:");
        JTextField txtAutor = new JTextField();

        JLabel lblIsbn = new JLabel("ISBN:");
        JTextField txtIsbn = new JTextField();

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText().trim();
            String tema = txtTema.getText().trim();
            String autor = txtAutor.getText().trim();
            String isbn = txtIsbn.getText().trim();

            LivroControle.cadastrarLivro(nome, tema, autor, isbn, this);
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new visao.menus.MenuBiblioteca();
        });

        painel.add(lblNome);
        painel.add(txtNome);

        painel.add(lblTema);
        painel.add(txtTema);

        painel.add(lblAutor);
        painel.add(txtAutor);

        painel.add(lblIsbn);
        painel.add(txtIsbn);

        painel.add(btnVoltar);
        painel.add(btnSalvar);

        add(painel);
        setVisible(true);
    }
}
