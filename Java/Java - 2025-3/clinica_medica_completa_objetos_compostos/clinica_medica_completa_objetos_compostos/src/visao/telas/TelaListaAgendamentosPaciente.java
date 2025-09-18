package visao.telas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controle.MedicoControle;
import controle.PacienteControle;
import modelo.Agendamento;
import visao.menus.MenuPaciente;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;

public class TelaListaAgendamentosPaciente extends JFrame {

    public TelaListaAgendamentosPaciente(int idPaciente) {
        setTitle("Lista de Agendamentos do Paciente");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Código", "Médico", "Data", "Hora", "Status"});

        JTable tabela = new JTable(modelo);
        tabela.setAutoCreateRowSorter(true);

        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);

        // Preenche tabela apenas com agendamentos do paciente atual
        modelo.setRowCount(0);
        List<Agendamento> agendamentos = PacienteControle.obterPaciente(idPaciente).listarAgendamentos();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Agendamento a : agendamentos) {
                modelo.addRow(new Object[]{
                    a.getIdAgendamento(),
                    MedicoControle.obterMedico(a.getMedico().getIdMedico()).getNome(),
                    sdf.format(a.getData()),
                    a.getHora(),
                    a.getStatus()
                });
        }

        // Botão de voltar
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new MenuPaciente(idPaciente);
        });

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelBotoes.add(btnVoltar);
        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }
}
