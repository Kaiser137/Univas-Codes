package visao.telas;

import modelo.Paciente;
import util.ManipuladorArquivos;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaSelecionarPacienteParaAtualizarContato extends JFrame {

    public TelaSelecionarPacienteParaAtualizarContato(int idSecretaria) {
        setTitle("Selecionar Paciente");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        List<Paciente> pacientes = ManipuladorArquivos.lerPacientes();
        JComboBox<Paciente> cmbPacientes = new JComboBox<>();

        for (Paciente p : pacientes) {
            cmbPacientes.addItem(p);
        }

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        painel.add(new JLabel("Selecione um paciente:"));
        painel.add(cmbPacientes);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnAvancar = new JButton("Avançar");
        btnAvancar.addActionListener(e -> {
            Paciente selecionado = (Paciente) cmbPacientes.getSelectedItem();
            if (selecionado != null) {
                dispose();
                new TelaAtualizarContatoPacienteSecretaria(idSecretaria, selecionado.getIdPaciente());
            }
        });

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> {
            dispose();
            new visao.menus.MenuSecretaria(idSecretaria);
        });

        painelBotoes.add(btnCancelar);
        painelBotoes.add(btnAvancar);

        add(painel, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
        setVisible(true);
    }
}
