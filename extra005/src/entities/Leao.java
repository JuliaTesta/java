package entities;

public class Leao extends Animal{
	
	public Leao(String nome, int idade) {
		super(nome, idade);
	}

	public void rugir() {
		System.out.println("Leao " + getNome() + " esta rugindo!");
	} //esse get pega o valor vindo do construtor. 
	
	
}
