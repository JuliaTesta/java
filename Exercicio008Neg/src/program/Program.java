package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		while(n>10) {
			System.out.println("Limite de números é 10! Digite novamente.");
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			if(vect[i]<0) {
			System.out.println(vect[i]);
		}
		}
		
		sc.close();

} 
}
