package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.ContaBancaria;
import entities.Livro;
import entities.Pessoa;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa("Dona Clara", 72, 1.62);
		System.out.println();
		
		Produto arroz = new Produto ("Arroz",5.50, 10);
		arroz.adicionarProduto(5); //qnt = 5
		arroz.removerProduto(3); //fica com 12 pacotes no total
		
		ContaBancaria conta = new ContaBancaria("Júlia", 486721, 3978.00);
		conta.depositar(500.00);
		conta.sacar(250.00);
		
		
		Carro carro = new Carro("Fusca", 1995, 0);
		carro.acelerar(40);
		carro.frear(10);
	
		
		Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 800); //construtor é chamado quando cria um new.
		
		
		
		//Menu
		int opcao =0;
		
		while(opcao != 6) {
			System.out.println("\n======Menu=====");
			System.out.println("1 - Ver dados da Dona Clara");
			System.out.println("2 - Ver ou movimentar conta bancaria");
			System.out.println("3 - Comprar arroz");
			System.out.println("4 - Acelerar ou frear carro");
			System.out.println("5 - Ver livro atual");
			System.out.println("6 - Sair");
			System.out.println("Escolha uma opcao: ");
			opcao=sc.nextInt();
			
			switch(opcao) {
			case 1:
				pessoa1.exibirDados();
				break;
				
			case 2:
				System.out.println("Saldo Atual: ");
				conta.exibirSaldo();
				System.out.println("1 - Depositar");
				System.out.println("2 - Sacar");
				int opConta = sc.nextInt();
				
				if(opConta == 1) {
					System.out.println("Quanto deseja depositar? ");
					double dep = sc.nextDouble();
					conta.depositar(dep);
					System.out.println("Deposito realizado.");
				} else if (opConta ==2) {
					System.out.println("Quanto deseja sacar? ");
					double sac = sc.nextDouble();
					conta.sacar(sac);
					System.out.println("Saque realizado.");
				} else {
					System.out.println("Opcao invalida.");
				}
				
				conta.exibirSaldo();
				break;
				
			case 3:
				System.out.println("Estoque de arroz: " + arroz.getQuantidade());
				System.out.println("Quantos pacotes deseja comprar? ");
				int pac = sc.nextInt();
				
				if(pac <= arroz.getQuantidade()) {
					arroz.removerProduto(pac);
					System.out.println("Compra realizada!");
					System.out.printf("Total no estoque R$%.2f%n", pac * arroz.getPreco());
					System.out.println("Novo estoque: " + arroz.getQuantidade());

				} else {
					System.out.println("Nao ha estoque suficiente para essa compra.");
				}
				break;
				
			case 4:
				System.out.println("Velocidade atual: " + carro.getVelocidade());
				System.out.println("Deseja acelerar ou frear o carro? ");
				System.out.println("1 - Acelerar");
				System.out.println("2 - Frear");
				int opCarro = sc.nextInt();
				
				System.out.println("Quanto em Km/h? ");
				double vel =sc.nextDouble();
				
				if(opCarro == 1) {
					carro.acelerar(vel);
				} else if (opCarro == 2) {
					carro.frear(vel);
				} else { 
					System.out.println("Opcao Invalida.");
				}
				
				carro.mostrarVel();
				break;
				
			case 5: 
				livro.exibirDetalhes();
				break;
				
			case 6: 
				System.out.println("Saindo do simulador. Até logo!");
				break;
				
			default:
				System.out.println("Opcao invalida");
				break;
			}
		}
		
		sc.close();
	}

}
