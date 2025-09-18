package visao.telas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controle.MedicoControle;
import controle.PacienteControle;
import modelo.Agendamento;
import visao.menus.MenuMedico;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;

public class TelaListaAgendamentosMedico extends JFrame {

    public TelaListaAgendamentosMedico(int idMedico) {
        setTitle("Lista de Agendamentos do Médico");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Código", "Paciente", "Data", "Hora", "Status"});

        JTable tabela = new JTable(modelo);
        tabela.setAutoCreateRowSorter(true);

        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);

        modelo.setRowCount(0);
        List<Agendamento> agendamentos = MedicoControle.obterMedico(idMedico).listarAgendamentos();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Agendamento a : agendamentos) {
                String nomePaciente = PacienteControle.obterPaciente(a.getPaciente().getIdPaciente()).getNome();
                modelo.addRow(new Object[]{
                    a.getIdAgendamento(),
                    nomePaciente,
                    sdf.format(a.getData()),
                    a.getHora(),
                    a.getStatus()
                });
        }

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new MenuMedico(idMedico);
        });

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelBotoes.add(btnVoltar);
        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }
}
