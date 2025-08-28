import modelo.*;
import java.sql.Date;
import java.sql.Time;

public class Main {
    public static void main(String[] args) {

        // 1. Instanciando e atribuindo valores para a Clínica
        System.out.println("--- Dados da Clínica ---");
        Clinica clinica = new Clinica(1, "Clínica Saúde & Vida", "Av. Brasil, 1500", "(35) 3471-1000");
        System.out.println("Nome: " + clinica.getNomeClinica());
        System.out.println("Endereço: " + clinica.getEndereco());
        System.out.println("Telefone: " + clinica.getTelefone());

        // 2. Instanciando e atribuindo valores para o Paciente
        System.out.println("\n--- Dados do Paciente ---");
        // Para criar uma data, usamos o método valueOf da classe java.sql.Date
        Date dataNascimento = Date.valueOf("1985-08-22");
        Paciente paciente = new Paciente(101, "Fernanda Lima", dataNascimento, "(35) 99876-5432", "fernanda.lima@email.com");
        // O método toString() do Paciente será chamado automaticamente pelo println
        System.out.println(paciente); 
        System.out.println("Email: " + paciente.getEmail());

        // 3. Instanciando e atribuindo valores para o Médico
        System.out.println("\n--- Dados do Médico ---");
        Medico medico = new Medico(201, "Dr. Ricardo Mendes", "Ortopedia", "CRM/MG 45678");
        // O método toString() do Médico também será chamado
        System.out.println(medico);
        System.out.println("Especialidade: " + medico.getEspecialidade());

        // 4. Instanciando e atribuindo valores para a Secretária
        System.out.println("\n--- Dados da Secretária ---");
        Secretaria secretaria = new Secretaria(301, "Juliana Alves", "Tarde");
        // A classe Secretaria não tem toString(), então usamos os getters
        System.out.println("ID: " + secretaria.getIdSecretaria() + " - Nome: " + secretaria.getNome());
        System.out.println("Turno: " + secretaria.getTurno());

        // 5. Instanciando e atribuindo valores para o Agendamento
        System.out.println("\n--- Dados do Agendamento ---");
        // Para criar uma hora, usamos o método valueOf da classe java.sql.Time
        Time horaAgendamento = Time.valueOf("10:30:00");
        // Usamos o id do paciente e do médico que já criamos
        Agendamento agendamento = new Agendamento(501, paciente.getIdPaciente(), medico.getIdMedico(), new java.util.Date(), horaAgendamento, "Confirmado");
        // O método toString() do Agendamento será chamado
        System.out.println(agendamento);

        // --- DEMONSTRANDO O USO DE SETTERS ---
        System.out.println("\n--- Atualizando Dados com Setters ---");
        
        // Usando o método específico para atualizar o contato do paciente
        System.out.println("Atualizando contato do paciente...");
        paciente.atualizarContato("(35) 99876-9999", "f.lima.novo@email.com");
        System.out.println("Novo Telefone do Paciente: " + paciente.getTelefone());

        // Usando um setter padrão para mudar a especialidade do médico
        System.out.println("Atualizando especialidade do médico...");
        medico.setEspecialidade("Ortopedia e Traumatologia");
        System.out.println("Nova Especialidade do Médico: " + medico.getEspecialidade());
    }
}