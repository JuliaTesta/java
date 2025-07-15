package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		double maiorN=0, maiorP=0; 
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
			
			if(vect[i]>maiorN) {
				maiorN = vect[i];
				maiorP = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f", maiorN);
		
		System.out.println();
		
		System.out.printf("POSICAO DO MAIOR VALOR = %.1f", maiorP+1);
		
		sc.close();
	}

}
