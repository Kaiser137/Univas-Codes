package controle;

import modelo.Clinica;
import util.ManipuladorArquivos;

import java.util.List;

import javax.swing.*;

public class ClinicaControle {

    public static void cadastrarClinica(String nome, String endereco, String telefone, JFrame tela) {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(tela, "Preencha todos os campos.");
            return;
        }

        int id = ManipuladorArquivos.proximoId("Clinica");
        Clinica c = new Clinica(id, nome, endereco, telefone);
        ManipuladorArquivos.salvar("Clinica", c.toCSV(),4);

        JOptionPane.showMessageDialog(tela, "Clínica cadastrada com sucesso!");
        tela.dispose();
        new visao.menus.MenuClinica();
    }

    public static Clinica obterClinica() {
        List<Clinica> lista = ManipuladorArquivos.lerClinicas();
        return lista.isEmpty() ? null : lista.get(0);
    }

    public static void atualizarClinica(int id, String nome, String endereco, String telefone, JFrame tela) {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(tela, "Preencha todos os campos.");
            return;
        }
        Clinica c = obterClinica();
        c.atualizarClinica(nome,endereco,telefone);
        JOptionPane.showMessageDialog(tela, "Clínica atualizada com sucesso!");
        tela.dispose();
        new visao.menus.MenuClinica();
    }
}
