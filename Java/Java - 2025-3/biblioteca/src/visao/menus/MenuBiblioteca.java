package visao.menus;

import javax.swing.*;

import visao.telas.TelaAtualizaBiblioteca;
import visao.telas.TelaCadastroBiblioteca;
import visao.telas.TelaCadastroLivro;
import visao.telas.TelaCadastroSecretaria;

import java.awt.*;

public class MenuBiblioteca extends JFrame {
    private int idBiblioteca;

    public MenuBiblioteca(int id) {
        this.idBiblioteca = id;

        setTitle("Menu da biblioteca (ID: " + this.idBiblioteca + ")");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(5, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnCadastrarBiblioteca = new JButton("Cadastrar/Atualizar Biblioteca");
        btnCadastrarBiblioteca.addActionListener(e -> {
            dispose();
            new TelaCadastroBiblioteca(this.idBiblioteca);
        });

        JButton btnAtualizarBiblioteca = new JButton("Cadastrar/Atualizar Biblioteca");
        btnAtualizarBiblioteca.addActionListener(e -> {
            dispose();
            new TelaAtualizaBiblioteca(this.idBiblioteca);
        });

        JButton btnCadastrarLivro = new JButton("Cadastrar Livro");
        btnCadastrarLivro.addActionListener(e -> {
            dispose();
            new TelaCadastroLivro(this.idBiblioteca);
        });

        JButton btnSecretaria = new JButton("Cadastrar Secretaria");
        btnSecretaria.addActionListener(e -> {
            dispose();
            new TelaCadastroSecretaria(this.idBiblioteca);
        });

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            dispose();
            new MenuInicial(); 
        });
        painel.add(btnCadastrarBiblioteca);
        painel.add(btnAtualizarBiblioteca);
        painel.add(btnCadastrarLivro);
        painel.add(btnSecretaria);

        painel.add(btnSair);

        add(painel);
        setVisible(true);
    }
}
