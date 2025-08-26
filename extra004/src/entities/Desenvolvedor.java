package entities;

public class Desenvolvedor extends Funcionario{
	private String linguagem;
	public void codarProjeto() {
			System.out.println(getNome() + " esta codando em " + linguagem);
	}
	
	public Desenvolvedor() {}
	
	public Desenvolvedor(String nome, String linguagem, double salario) {
		super(nome, salario);
		this.linguagem = linguagem;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	
}
