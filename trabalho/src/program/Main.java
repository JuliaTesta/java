package program;

import entities.Paciente;
import ui.PacienteUi;

public class Main {

	public static void main(String[] args) {
		Paciente paciente = PacienteUi.cadastrarPaciente();
		PacienteUi.exibirPaciente(paciente);

	}

}
