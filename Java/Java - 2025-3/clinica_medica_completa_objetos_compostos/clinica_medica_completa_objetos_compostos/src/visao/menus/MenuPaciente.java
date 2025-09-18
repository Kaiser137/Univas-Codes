package visao.menus;

import visao.telas.TelaAtualizarPaciente;
import visao.telas.TelaCancelarAgendamentoPaciente;
import visao.telas.TelaListaAgendamentosPaciente;

import javax.swing.*;
import java.awt.*;

public class MenuPaciente extends JFrame {
    private int idPaciente;

    public MenuPaciente(int idPaciente) {
        this.idPaciente = idPaciente;

        setTitle("Menu Paciente - "+this.idPaciente);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(4, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnAtualizar = new JButton("Atualizar Contato");
        btnAtualizar.addActionListener(e -> {
            dispose();
            new TelaAtualizarPaciente(this.idPaciente);
        });

        JButton btnAgendamentos = new JButton("Agendamentos");
        btnAgendamentos.addActionListener(e -> {
            dispose();
            new TelaListaAgendamentosPaciente(this.idPaciente);
        });

        JButton btnCancelaAgendamento = new JButton("Cancela Agendamento");
        btnCancelaAgendamento.addActionListener(e -> {
            dispose();
            new TelaCancelarAgendamentoPaciente(this.idPaciente);
        });

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            dispose();
            new MenuInicial(); 
        });

        painel.add(btnAtualizar);
        painel.add(btnAgendamentos);
        painel.add(btnCancelaAgendamento);
        painel.add(btnSair);

        add(painel);
        setVisible(true);
    }
}
