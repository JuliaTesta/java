package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		sc.nextLine();
		
		String nomes[] = new String[n];
		double nota1[]= new double[n];
		double nota2[] = new double[n];
		double medias[]= new double[n];
		
		double media=0;
		for(int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda  nota do %do aluno: ", i+1);
			System.out.println();
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			 sc.nextLine();
			 
			 medias[i] = (nota1[i] + nota2[i])/2;
		}
		
		
		
		System.out.println("ALUNOS APROVADOS: ");
		for(int i=0; i<n; i++) {
			if(medias[i] >= 6.00) {
				System.out.printf("%s", nomes[i]);
				System.out.println();
			}
		}
		sc.close();
		

	}

}
