package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int vect[] = new int[n];
		double media = 0,soma=0;
		int contPar=0;
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i]= sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				contPar++;
				soma+=vect[i];
			} 
		}
		
		if(contPar==0) {
			System.out.println("NENHUM NUMERO PAR");
			
		} else {
			media = soma / contPar;
			System.out.printf("MEDIA DOS PARES: %.2f", media);
		}
	
		
		sc.close();

	}

}
