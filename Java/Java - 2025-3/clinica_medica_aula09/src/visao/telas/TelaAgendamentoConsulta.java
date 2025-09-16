package visao.telas;

import controle.AgendamentoControle;
import modelo.Paciente;
import modelo.Medico;
import util.ManipuladorArquivos;
import visao.menus.MenuSecretaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaAgendamentoConsulta extends JFrame {

    public TelaAgendamentoConsulta(int idSecretaria) {
        setTitle("Agendar Consulta");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        List<Paciente> pacientes = ManipuladorArquivos.lerPacientes();
        List<Medico> medicos = ManipuladorArquivos.lerMedicos();
        JComboBox<Paciente> cmbPaciente = new JComboBox<>();
        for (Paciente p : pacientes) {
            cmbPaciente.addItem(p);
        }
        JComboBox<Medico> cmbMedico = new JComboBox<>();
        for (Medico m : medicos) {
            cmbMedico.addItem(m);
        }
        JTextField txtData = new JTextField();
        JTextField txtHora = new JTextField();

        JPanel painel = new JPanel(new GridLayout(5, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        painel.add(new JLabel("Paciente:"));
        painel.add(cmbPaciente);

        painel.add(new JLabel("Médico:"));
        painel.add(cmbMedico);

        painel.add(new JLabel("Data (dd/MM/yyyy):"));
        painel.add(txtData);

        painel.add(new JLabel("Hora (HH:mm):"));
        painel.add(txtHora);

        JButton btnAgendar = new JButton("Agendar");
        btnAgendar.addActionListener(e -> {
            int idPaciente = Integer.parseInt(cmbPaciente.getSelectedItem().toString().split(" - ")[0]);
            int idMedico = Integer.parseInt(cmbMedico.getSelectedItem().toString().split(" - ")[0]);
            String data = txtData.getText().trim();
            String hora = txtHora.getText().trim();

            AgendamentoControle.agendarConsulta(idPaciente, idMedico, data, hora, this,idSecretaria);
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new MenuSecretaria(idSecretaria);
        });

        painel.add(btnVoltar);
        painel.add(btnAgendar);

        add(painel);
        setVisible(true);
    }
}