package visao.menus;

import javax.swing.*;
import java.awt.*;

public class MenuUsuario extends JFrame {
    private int idUsuario;

    public MenuUsuario(int idUsuario) {
        this.idUsuario = idUsuario;

        setTitle("Menu Usuario - "+this.idUsuario);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(4, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnAtualizar = new JButton("Atualizar Contato");

        JButton btnEmprestimos = new JButton("Emprestimos");

        JButton btnCancelaEmprestimos = new JButton("Cancela Emprestimos");

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            dispose();
            new MenuInicial(); 
        });

        painel.add(btnAtualizar);
        painel.add(btnEmprestimos);
        painel.add(btnCancelaEmprestimos);
        painel.add(btnSair);

        add(painel);
        setVisible(true);
    }
}
