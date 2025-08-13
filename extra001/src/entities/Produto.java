package entities;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeDisp;
	
	public Produto() {}
	
	public Produto(String nome, double preco, int quantidadeDisp) {
	
		this.nome = nome;
		this.preco = preco;
		this.quantidadeDisp = quantidadeDisp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidadeDisp;
	}

	public void setQuantidade(int quantidadeDisp) {
		this.quantidadeDisp = quantidadeDisp;
	}
	
	public void adicionarProduto(int qnt) {
		this.quantidadeDisp += qnt;
	}
	
	public void removerProduto(int qnt) {
		
		if(this.quantidadeDisp >= qnt) {
			this.quantidadeDisp -= qnt; 
		} else {
			System.out.println("Não há estoque suficiente para remover.");
		}	
	}
	
	public double calcTotal() {
		return preco * quantidadeDisp;
	}
}
