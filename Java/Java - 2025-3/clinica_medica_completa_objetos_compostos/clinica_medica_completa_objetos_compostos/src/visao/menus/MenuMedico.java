package visao.menus;

import javax.swing.*;

import visao.telas.TelaAtualizarStatusConsulta;
import visao.telas.TelaListaAgendamentosMedico;

import java.awt.*;

public class MenuMedico extends JFrame {
    private int idMedico;

    public MenuMedico(int idMedico) {
        this.idMedico = idMedico;

        setTitle("Menu Médico - "+this.idMedico);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(3, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnAgendamentos = new JButton("Agendamentos");
        btnAgendamentos.addActionListener(e -> {
            dispose();
            new TelaListaAgendamentosMedico(this.idMedico);
        });

        JButton btnRegistrar = new JButton("Atualizar Agendamento");
        btnRegistrar.addActionListener(e -> {
            dispose();
            new TelaAtualizarStatusConsulta(this.idMedico);
        });

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            dispose();
            new MenuInicial(); 
        });

        painel.add(btnRegistrar);
        painel.add(btnAgendamentos);
        painel.add(btnSair);

        add(painel);
        setVisible(true);
    }
}
