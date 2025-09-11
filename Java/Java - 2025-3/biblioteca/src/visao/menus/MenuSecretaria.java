package visao.menus;

import javax.swing.*;

import visao.telas.TelaEmprestimoLivro;
import visao.telas.TelaCadastroUsuario;


import java.awt.*;

public class MenuSecretaria extends JFrame {
    private int idSecretaria;

    public MenuSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
        setTitle("Menu - Secretaria: "+this.idSecretaria);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(5, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnCadastro = new JButton("Cadastrar Usuario");
        btnCadastro.addActionListener(e -> {
            dispose(); // Fecha o menu
            new TelaCadastroUsuario(idSecretaria);
        });

        JButton btnAtualizar = new JButton("Atualizar Contato do Usuario");


        JButton btnAgendar = new JButton("Agendar Emprestimo");
        btnAgendar.addActionListener(e -> {
            dispose(); // Fecha o menu
            new TelaEmprestimoLivro(this.idSecretaria);
        });

        JButton btnListarEmprestimos = new JButton("Lista de Emprestimos");

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            dispose();
            new MenuInicial();
        });

        painel.add(btnCadastro);
        painel.add(btnAtualizar);
        painel.add(btnAgendar);
        painel.add(btnListarEmprestimos);
        painel.add(btnSair);

        add(painel);
        setVisible(true);
    }
}
