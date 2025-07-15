package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i<n; i++) {
		sc.nextLine();
		
		String name = sc.nextLine();
		float price = sc.nextFloat();
		
		vect[i]=new Product(name,price);
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum +=vect[i].getPrice(); //get only the price, and not the name
		}
		
		double avg = sum / n;
		
		System.out.printf("AVARAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
