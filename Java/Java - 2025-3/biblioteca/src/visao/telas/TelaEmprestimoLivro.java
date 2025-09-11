package visao.telas;

import controle.AgendamentoControle;
import utilidades.Usuario;
import utilidades.Livro;
import util.ManipuladorArquivos;
import visao.menus.MenuSecretaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaEmprestimoLivro extends JFrame {

    public TelaEmprestimoLivro(int idSecretaria) {
        setTitle("Agendar Empréstimo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        List<Usuario> usuarios = ManipuladorArquivos.lerUsuarios();
        List<Livro> livros = ManipuladorArquivos.lerLivros();
        JComboBox<Usuario> cmbUsuario = new JComboBox<>();
        for (Usuario u : usuarios) {
            cmbUsuario.addItem(u);
        }
        JComboBox<Livro> cmbLivro = new JComboBox<>();
        for (Livro l : livros) {
            cmbLivro.addItem(l);
        }
        JTextField txtData = new JTextField();
        JTextField txtHora = new JTextField();

        JPanel painel = new JPanel(new GridLayout(5, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        painel.add(new JLabel("Usuário:"));
        painel.add(cmbUsuario);

        painel.add(new JLabel("Livro:"));
        painel.add(cmbLivro);

        painel.add(new JLabel("Data (dd/MM/yyyy):"));
        painel.add(txtData);

        painel.add(new JLabel("Hora (HH:mm):"));
        painel.add(txtHora);

        JButton btnAgendar = new JButton("Agendar");
        btnAgendar.addActionListener(e -> {
            int idUsuario = Integer.parseInt(cmbUsuario.getSelectedItem().toString().split(" - ")[0]);
            int idLivro = Integer.parseInt(cmbLivro.getSelectedItem().toString().split(" - ")[0]);
            String data = txtData.getText().trim();
            String hora = txtHora.getText().trim();

            AgendamentoControle.agendarEmprestimo(idUsuario, idLivro, data, hora, this, idSecretaria);
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