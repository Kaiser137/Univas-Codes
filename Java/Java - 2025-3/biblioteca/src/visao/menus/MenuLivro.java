package visao.menus;

import javax.swing.*;

import java.awt.*;

public class MenuLivro extends JFrame {
    private int idLivro;

    public MenuLivro(int idLivro) {
        this.idLivro = idLivro;

        setTitle("Menu Livro - " + this.idLivro);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(3, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnEmprestimos = new JButton("Emprestimos");

        JButton btnRegistrar = new JButton("Atualizar Emprestimos");

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            dispose();
            new MenuInicial(); 
        });

        painel.add(btnRegistrar);
        painel.add(btnEmprestimos);
        painel.add(btnSair);

        add(painel);
        setVisible(true);
    }
}
