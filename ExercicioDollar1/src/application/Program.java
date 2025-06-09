package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double buy = sc.nextDouble();
		
		
		double bought = dollar * buy;
		double tax = bought*0.06;
		double result = bought + tax;
		
		System.out.printf("Amount to be paid in reais = %.2f", result);
		
		sc.close();
	}

}
