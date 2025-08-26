package entities;

public class Gerente extends Funcionario {
	private String departamento;
	public void gerenciarEquipe() {
			System.out.println(getNome() + "esta gerenciando a equipe de " + departamento);
	}
	
	public Gerente() {}
	
	public Gerente(String nome, String departamento, double salario) {
		super(nome,salario);
		this.departamento = departamento;
	}
	
	
	
}
