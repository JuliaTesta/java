package entities;

public class ContaBancaria {
	private String titular;
	private int numero;
	private double saldo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(String titular, int numero, double saldo) {
		
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double dinheiro) {
		this.saldo += dinheiro;
	}
	
	public void sacar(double dinheiro) {
		if(dinheiro <= saldo) {
			this.saldo -= dinheiro;
		} else {
			System.out.println("Nao ha saldo suficiente.");
		}		
	}
	
	public void exibirSaldo() {
		System.out.println("O saldo da conta eh: " + saldo);
	}
}
