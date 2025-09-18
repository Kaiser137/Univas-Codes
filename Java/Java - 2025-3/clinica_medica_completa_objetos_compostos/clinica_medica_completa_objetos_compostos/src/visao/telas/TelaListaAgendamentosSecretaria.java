package visao.telas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controle.MedicoControle;
import controle.PacienteControle;
import controle.SecretariaControle;
import modelo.Agendamento;
import visao.menus.MenuSecretaria;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;

public class TelaListaAgendamentosSecretaria extends JFrame {

    public TelaListaAgendamentosSecretaria(int idSecretaria) {
        setTitle("Lista de Agendamentos - Secretaria");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Código", "Paciente", "Médico", "Data", "Hora", "Status"});

        JTable tabela = new JTable(modelo);
        tabela.setAutoCreateRowSorter(true);
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);

        modelo.setRowCount(0);
        List<Agendamento> agendamentos = SecretariaControle.obterSecretaria(idSecretaria).listarAgendamentos();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Agendamento a : agendamentos) {
            String nomeMedico = MedicoControle.obterMedico(a.getMedico().getIdMedico()).getNome();
            String nomePaciente = PacienteControle.obterPaciente(a.getPaciente().getIdPaciente()).getNome();

            modelo.addRow(new Object[]{
                a.getIdAgendamento(),
                nomePaciente,
                nomeMedico,
                sdf.format(a.getData()),
                a.getHora(),
                a.getStatus()
            });
        }

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new MenuSecretaria(idSecretaria);
        });

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelBotoes.add(btnVoltar);
        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }
}
