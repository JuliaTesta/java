package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		int n;
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		  
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: ", i+1);
			System.out.println();
			
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int maiorIdade = 0;
		int posicaoMaior = 0;
		
		System.out.print("PESSOA MAIS VELHA: ");
		for(int i=0; i<n; i++) {
			
			if(idades[i]>maiorIdade) {
			 maiorIdade=idades[i];
			 posicaoMaior = i;
			 
		}
		}
		System.out.print(nomes[posicaoMaior]);
		
		sc.close();

	}

}
