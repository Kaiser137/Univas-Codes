package controle;

import modelo.Medico;
import util.ManipuladorArquivos;
import visao.telas.TelaAtualizarStatusConsulta;
import visao.menus.MenuClinica;

import java.util.List;

import javax.swing.*;

public class MedicoControle {

    public static void cadastrarMedico(String nome, String especialidade, String crm, JFrame tela) {
        if (nome.isEmpty() || especialidade.isEmpty() || crm.isEmpty()) {
            JOptionPane.showMessageDialog(tela, "Preencha todos os campos.");
            return;
        }

        int id = ManipuladorArquivos.proximoId("Medico");
        Medico m = new Medico(id, nome, especialidade, crm);
        ClinicaControle.obterClinica().cadastrarMedico(m);

        JOptionPane.showMessageDialog(tela, "Médico cadastrado com sucesso!");
        tela.dispose();
        new MenuClinica();
    }

    public static Medico obterMedico(int idMedico){
        List<Medico> medicos = ManipuladorArquivos.lerMedicos();
        Medico medico = medicos.stream()
            .filter(p -> p.getIdMedico() == idMedico)
            .findFirst()
            .orElse(null);
        return medico;
    }

    public static void atualizarStatusAgendamento(int idAgendamento, String novoStatus, int idMedico, JFrame tela) {
        Medico medico = obterMedico(idMedico);
        boolean atualizar = medico.atualizarStatusAgendamento(idAgendamento, novoStatus);

        if(atualizar){
            JOptionPane.showMessageDialog(tela, "Status atualizado com sucesso.");
            tela.dispose();
            new TelaAtualizarStatusConsulta(idMedico);
        }else{
            JOptionPane.showMessageDialog(tela, "Erro ao atualizar status.");
        }
    }
}
