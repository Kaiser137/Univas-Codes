package visao.menus;

import javax.swing.*;

import visao.telas.TelaCadastroBiblioteca;
import visao.telas.TelaCadastroLivro;
import visao.telas.TelaCadastroSecretaria;

import java.awt.*;

public class MenuBiblioteca extends JFrame {

    public MenuBiblioteca() {
        setTitle("Menu Biblioteca");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(5, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnBiblioteca = new JButton("Cadastrar/Atualizar Biblioteca");
        btnBiblioteca.addActionListener(e -> {
            dispose();
            new TelaCadastroBiblioteca();
        });

        JButton btnCadastrarLivro = new JButton("Cadastrar Livro");
        btnCadastrarLivro.addActionListener(e -> {
            dispose();
            new TelaCadastroLivro();
        });

        JButton btnSecretaria = new JButton("Cadastrar Secretaria");
        btnSecretaria.addActionListener(e -> {
            dispose();
            new TelaCadastroSecretaria();
        });

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            dispose();
            new MenuInicial(); 
        });
        painel.add(btnBiblioteca);
        painel.add(btnCadastrarLivro);
        painel.add(btnSecretaria);

        painel.add(btnSair);

        add(painel);
        setVisible(true);
    }
}
