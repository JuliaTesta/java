package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		Products[] vect = new Products[n];
		
		for(int i=0; i<n; i++) {
		String name = sc.nextLine();
		float price = sc.nextFloat();
		}
		
		
		
		
		sc.close();
	}

}
