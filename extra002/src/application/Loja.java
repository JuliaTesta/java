package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Loja {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto[] produtos = new Produto[5];
		int opcao;
		int contador = 0;
		
		do {
			System.out.println("1- Cadastrar Produto\n");
			System.out.println("2- Listar Produtos\n");
			System.out.println("3- Buscar produtos por codigo\n");
			System.out.println("4- Produto com maior preco\n");
			System.out.println("0- Sair");
			 opcao = sc.nextInt();
			sc.nextLine();
			

			switch(opcao) {
			
					case 1:
				if(contador < produtos.length) {
					System.out.println("Código: ");
					int cod = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Nome: ");
					String nome = sc.nextLine();
					
					System.out.println("Preço: ");
					double preco = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Quantidade em estoque: ");
					int qntEstoque = sc.nextInt();
					sc.nextLine();
					
					produtos[contador] = new Produto(cod,nome,preco,qntEstoque); //ex:produto[1]
					contador++;
				}
				break;
				
					case 2: 
				System.out.println("Produtos:\n");
				for(int i=0; i<contador; i++) { //usa contador pq pode ter só dois produtos, por ex
					
					System.out.println("Código: " + produtos[i].getCodigo()
								+ ", Nome: " + produtos[i].getNome()
								+ ", Preço: " + produtos[i].getPreco()
								+ ", Estoque: " + produtos[i].getQntEstoque());
					
				}
				
				break;
					case 3: 
						System.out.println("Digite o código que deseja buscar: ");
						int codBusca = sc.nextInt();
						
						boolean encontrado = false;
						for(int i=0; i<contador; i++) {
							if(codBusca == produtos[i].getCodigo()) {
								System.out.println("Produto encontrado: \n");
								System.out.println("Nome: " + produtos[i].getNome()
										+ ", preço: " + produtos[i].getPreco() 
										+ ", Estoque: " + produtos[i].getQntEstoque());
								encontrado = true;
								break;
							}
						}
						if(!encontrado) {
							System.out.println("Produto não encontrado.\n");	
						}
						break;
						
					case 4: 
						if(contador > 0) {
							Produto maisCaro = produtos[0];
							
							for(int i=1; i<contador; i++) {
								if(produtos[i].getPreco() > maisCaro.getPreco()) {
									maisCaro = produtos[i];
								}
							}
							System.out.println("Produto com maior preço: ");
							System.out.println("Código: " + maisCaro.getPreco()
									+ ", Nome: " + maisCaro.getNome()
									+ ", Preço: " + maisCaro.getPreco());
						} else {
							System.out.println("Nenhum produto cadastrado.");
						}
						break;
						
					case 0:
						System.out.println("Encerrando programa...");
						break;
						
					default: 
						System.out.println("Opção inválida!");
			}		
		} while (opcao != 0);
	
		sc.close();

	}
}
