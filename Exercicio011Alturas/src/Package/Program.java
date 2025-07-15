package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		sc.nextLine();
		
		String []nomes = new String[n];
		int []idades = new int[n];
		double []alturas = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: ", i+1);
			System.out.println();
			
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double mediaAltura = 0;
		double porcentagem=0;
		double soma = 0;
		String nomeMenorD;
		
		for(int i=0; i<n; i++) {
			
			soma += alturas[i];
		}
		mediaAltura = soma/n;
		
		System.out.printf("Altura Media: %.2f", mediaAltura);
		System.out.println();
		
		int contIdade=0;
		for(int i=0; i<n; i++) {
			if(idades[i]<16) {
				contIdade++;
				porcentagem = ((double)contIdade/n) * 100;
			}
		}
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", porcentagem);
		System.out.println();
		
		for(int i=0; i<n; i++) {
			if(idades[i]<16) {
				System.out.print(nomes[i]);
				System.out.println();
			}
		}
		
		sc.close();

	}

}
