package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int []vect= new int[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.print("NUMEROS PARES: ");
		System.out.println();
		
		int contPares=0;
		
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				contPares++;
			}
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", contPares);
		
		sc.close();
	}

}
