package controle;

import utilidades.Emprestimo;
import util.ManipuladorArquivos;
import visao.menus.MenuSecretaria;

import javax.swing.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgendamentoControle {

    public static void agendarEmprestimo(int idUsuario, int idLivro, String dataStr, String horaStr, JFrame tela, int idSecretaria) {
        try {
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);
            if (data.before(new Date())) {
                JOptionPane.showMessageDialog(tela, "A data do empréstimo não pode ser anterior a hoje.");
                return;
            }

            Time hora = Time.valueOf(horaStr + ":00"); // ex: 14:30 -> 14:30:00

            Emprestimo e = new Emprestimo(ManipuladorArquivos.proximoId("Emprestimo"), idUsuario, idLivro, data, hora, "Pendente");
            SecretariaControle.obterSecretaria(idSecretaria).cadastrarEmprestimo(e);
            JOptionPane.showMessageDialog(tela, "Empréstimo agendado com sucesso.");
            tela.dispose();
            new MenuSecretaria(idSecretaria);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(tela, "Erro ao agendar: verifique a data e hora.");
        }
    }
}

