package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número que deseja encontrar o pai: ");
		int n = sc.nextInt();
		
		int parent = findParent(n);
		System.out.printf("O pai desse número é %d", parent);
		sc.close();
	}
	
	public static int findParent(int n) {
			int parent = 1;
			int next = 2;
			
			while(n > next + parent - 1) {
				next += parent; //proximo filho 
				parent++; //vai para o proximo pai
			}
			return parent;
	}
}