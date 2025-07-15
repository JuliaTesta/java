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
		
		double vect[] = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double media=0, soma=0;
		
		for(int i=0; i<n; i++) {
			soma+= vect[i];
		}
		
		media= soma/n;
		
		System.out.printf("MEDIA DO VETOR = %.2f ", media);
		System.out.println();
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i=0; i<n; i++) {
			if(vect[i]<media) {
				System.out.printf("%.2f", vect[i]);
				System.out.println();
			}
		}
		
		sc.close();
		

	}

}
