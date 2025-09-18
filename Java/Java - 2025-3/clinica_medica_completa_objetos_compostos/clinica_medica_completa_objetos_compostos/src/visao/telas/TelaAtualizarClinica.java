package visao.telas;

import controle.ClinicaControle;
import modelo.Clinica;

import javax.swing.*;
import java.awt.*;

public class TelaAtualizarClinica extends JFrame {

    public TelaAtualizarClinica(Clinica clinica) {
        setTitle("Atualizar Clínica");
        setSize(350, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(4, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(clinica.getNomeClinica());

        JLabel lblEndereco = new JLabel("Endereço:");
        JTextField txtEndereco = new JTextField(clinica.getEndereco());

        JLabel lblTelefone = new JLabel("Telefone:");
        JTextField txtTelefone = new JTextField(clinica.getTelefone());

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> {
            ClinicaControle.atualizarClinica(
                clinica.getIdClinica(),
                txtNome.getText().trim(),
                txtEndereco.getText().trim(),
                txtTelefone.getText().trim(),
                this
            );
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> dispose());

        painel.add(lblNome);
        painel.add(txtNome);
        painel.add(lblEndereco);
        painel.add(txtEndereco);
        painel.add(lblTelefone);
        painel.add(txtTelefone);
        painel.add(btnVoltar);
        painel.add(btnSalvar);

        add(painel);
        setVisible(true);
    }
}
