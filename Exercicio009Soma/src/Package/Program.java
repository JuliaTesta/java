package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		
		while(n<=0) {
			System.out.println("Numero invalido. Digite novamente.");
			n = sc.nextInt();
		}
		
		double[] vect = new double [n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();		
			}
		
		System.out.print("VALORES: ");
		
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f ", vect[i]);
			
		}
		System.out.println();
		double soma=0, media=0;
		
		for(int i=0; i<n; i++) {
			soma += vect [i];
		}
		
		System.out.printf("SOMA = %.2f", soma);
		System.out.println();
		
		for(int i=0; i<n; i++) {
			media = soma/n;
		}
		System.out.printf("MEDIA = %.2f", media);
		
		
		sc.close();

	}

}
