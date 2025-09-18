package visao.telas;

import controle.MedicoControle;
import modelo.Agendamento;
import visao.menus.MenuMedico;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

public class TelaAtualizarStatusConsulta extends JFrame {

    private JComboBox<Agendamento> comboAgendamentos;
    private JComboBox<String> comboStatus;

    public TelaAtualizarStatusConsulta(int idMedico) {
        setTitle("Atualizar Status de Consulta");
        setSize(500, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(3, 2, 10, 10));
        painel.setBorder(new EmptyBorder(20, 20, 20, 20));

        comboAgendamentos = new JComboBox<>();
        List<Agendamento> agendamentos = MedicoControle.obterMedico(idMedico).listarAgendamentos();
        for (Agendamento a : agendamentos) {
            comboAgendamentos.addItem(a);
        }

        comboStatus = new JComboBox<>(new String[]{"Consulta Realizada", "Paciente Ausente", "Cancelado", "Pendente"});

        painel.add(new JLabel("Agendamento:"));
        painel.add(comboAgendamentos);
        painel.add(new JLabel("Novo Status:"));
        painel.add(comboStatus);

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.addActionListener(e -> {
            Agendamento selecionado = (Agendamento) comboAgendamentos.getSelectedItem();
            String novoStatus = (String) comboStatus.getSelectedItem();

            if (selecionado != null && novoStatus != null) {
                MedicoControle.atualizarStatusAgendamento(selecionado.getIdAgendamento(), novoStatus, idMedico, this);
            }
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new MenuMedico(idMedico);
        });

        painel.add(btnVoltar);
        painel.add(btnAtualizar);

        add(painel);
        setVisible(true);
    }
}
