package visao.telas;

import modelo.Paciente;

import javax.swing.*;
import java.awt.*;


public class TelaAtualizarContatoPacienteSecretaria extends JFrame {
    public TelaAtualizarContatoPacienteSecretaria(int idSecretaria, int idPaciente) {
        setTitle("Atualizar Contato do Paciente");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Paciente paciente = controle.PacienteControle.obterPaciente(idPaciente);

        JTextField txtTelefone = new JTextField(paciente.getTelefone());
        JTextField txtEmail = new JTextField(paciente.getEmail());

        JPanel painel = new JPanel(new GridLayout(3, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        painel.add(new JLabel("Telefone:"));
        painel.add(txtTelefone);

        painel.add(new JLabel("Email:"));
        painel.add(txtEmail);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> {
            controle.PacienteControle.atualizarContato(
                paciente.getIdPaciente(), 
                txtTelefone.getText().trim(), 
                txtEmail.getText().trim(), 
                this,
                idSecretaria
            );
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new visao.menus.MenuSecretaria(idSecretaria);
        });

        painel.add(btnVoltar);
        painel.add(btnSalvar);

        add(painel);
        setVisible(true);
    }
}