package ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import entities.Paciente;

public class PacienteUi {

	public static Paciente cadastrarPaciente() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Paciente paciente = new Paciente();
		
		//Preencher dados do paciente com JOption pane;
		
		String nome = JOptionPane.showInputDialog("Digite o nome paciente: ");
		paciente.setNome(nome);
		
		String email = JOptionPane.showInputDialog("Digite o email do paciente: ");
		paciente.setEmail(email);
		
		String cpf = JOptionPane.showInputDialog("Digite o CPF do paciente: ");
		paciente.setCpf(cpf);
		
		String telefone = JOptionPane.showInputDialog("Digite o telefone do paciente: ");
		paciente.setTelefone(telefone);
		
		String dataNascimentoStr = JOptionPane.showInputDialog("Digite a data de nascimento (dd/MM/yyyy): ");
		LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
		paciente.setDataNascimento(dataNascimento);
		
		String convenio= JOptionPane.showInputDialog("Digite o nome do convênio (ou deixe em branco): ");
		paciente.setConvenio(convenio);
		
		String numeroConvenio = JOptionPane.showInputDialog("Digite o número da carteira do convênio: ");
		paciente.setNumeroCarteiraConvenio(numeroConvenio);
		
		String historico = JOptionPane.showInputDialog("Digite o histórico médico: ");
		paciente.setHistoricoMedico(historico);
		
		return paciente;
	}
	
	public static void exibirPaciente(Paciente paciente) {
		JOptionPane.showMessageDialog(null, "Paciente cadastrado: \n\n" + paciente.toString());
	}
}
