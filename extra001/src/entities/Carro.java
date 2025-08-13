package entities;

public class Carro {
	private String modelo;
	private int ano;
	private double velocidade;
	
	public Carro() {}
	
	public Carro(String modelo, int ano, double velocidade) {
		
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar(double incremento) {
		this.velocidade += incremento;
	}
	
	public void frear(double incremento) {
		this.velocidade -= incremento;
	}
	
	public void mostrarVel() {
		System.out.println("A velocidade do carro eh: " + velocidade + "Km/h");
	}
}
