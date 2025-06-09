package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought: ");
		double buy = sc.nextDouble();
		
		double result = CurrencyConverter.calculator(dollar, buy);
		System.out.printf("Amoun to be paid in reais= %.2f", result);
		
		sc.close();

	}

}
