package visao.telas;

import controle.PacienteControle;
import modelo.Agendamento;
import util.ManipuladorArquivos;
import visao.menus.MenuPaciente;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaCancelarAgendamentoPaciente extends JFrame {

    public TelaCancelarAgendamentoPaciente(int idPaciente) {
        setTitle("Cancelar Agendamento");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        List<Agendamento> agendamentos = ManipuladorArquivos.lerAgendamentos();
        JComboBox<Agendamento> cmbAgendamentos = new JComboBox<>();

        for (Agendamento a : agendamentos) {
            if (a.getPaciente().getIdPaciente() == idPaciente && a.getStatus().equalsIgnoreCase("Pendente")) {
                cmbAgendamentos.addItem(a);
            }
        }

        JPanel painel = new JPanel(new GridLayout(3, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        painel.add(new JLabel("Selecione o agendamento a cancelar:"));
        painel.add(cmbAgendamentos);

        JButton btnCancelar = new JButton("Cancelar Agendamento");
        btnCancelar.addActionListener(e -> {
            if (cmbAgendamentos.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Nenhum agendamento selecionado.");
                return;
            }
            String selecionado = cmbAgendamentos.getSelectedItem().toString();
            int idAgendamento = Integer.parseInt(selecionado.split(" - ")[0]);
            PacienteControle.cancelarAgendamentoPorPaciente(idAgendamento, idPaciente, this);
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new MenuPaciente(idPaciente);
        });

        JPanel botoes = new JPanel(new FlowLayout());
        botoes.add(btnVoltar);
        botoes.add(btnCancelar);

        add(painel, BorderLayout.CENTER);
        add(botoes, BorderLayout.SOUTH);
        setVisible(true);
    }
}
