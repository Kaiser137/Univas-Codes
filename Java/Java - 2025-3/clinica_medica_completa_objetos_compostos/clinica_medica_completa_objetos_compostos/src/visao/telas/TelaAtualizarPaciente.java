package visao.telas;

import controle.PacienteControle;
import modelo.Paciente;
import visao.menus.MenuPaciente;

import javax.swing.*;
import java.awt.*;

public class TelaAtualizarPaciente extends JFrame {

    public TelaAtualizarPaciente(int idPaciente) {
        setTitle("Atualizar meu Contato");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Paciente paciente = PacienteControle.obterPaciente(idPaciente);
        
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
            PacienteControle.atualizarContato(idPaciente, txtTelefone.getText().trim(), txtEmail.getText().trim(), this,0);
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new MenuPaciente(idPaciente);
        });

        painel.add(btnVoltar);
        painel.add(btnSalvar);

        add(painel);
        setVisible(true);
    }
}
