package entities;

public class Elefante extends Animal{
	
	public Elefante(String nome, int idade) {
		super(nome, idade);
	}

	public void tocarTromba() {
		System.out.println("Elefante " + getNome() + "esta tocando a tromba!");
	}
}
