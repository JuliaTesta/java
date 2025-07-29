package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int contMulher = 0, contH=0;
		double somaAl = 0, media=0;
		
		System.out.print("Quantas pessoas serão digitadas?");
		n= sc.nextInt();
		
		double[] altura = new double[n];
		char [] genero = new char[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa:", i+1);
			altura[i] = sc.nextDouble();
			sc.nextLine();
			
			System.out.printf("Genero da %da pessoa:", i+1);
			genero[i] = sc.next().charAt(0);
			
			if( genero[i] == 'F' || genero[i] == 'f') {
				contMulher++;
				somaAl += altura[i];
		}
		}
		
		media = somaAl/contMulher;
		
		double menorAL = altura[0];
		double maiorAL = altura[0];
		
		for(int i=0; i<n; i++) {
			if(altura[i] < menorAL) {
			menorAL = altura[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(altura[i] > maiorAL) {
				maiorAL = altura[i];
			}
		}
		
		
		System.out.printf("Menor altura: %.2f\n", menorAL);
		System.out.printf("Maior altura: %.2f\n", maiorAL);
		
		for(int i=0; i<n; i++) {
			
		}
		
		for(int i=0; i<n; i++) {
			if(genero[i] == 'M' || genero[i] == 'm') {
				contH++;
			}
		}
		
		System.out.printf("Media das alturas das mulheres: %.2f\n", media);
		System.out.printf("Numero de homens: %d\n", contH);
		
		sc.close();
		
	}

}
