package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Products;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Products> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Product " + (i+1) + " data: ");
			System.out.print("Common, used or imported (c/u/i): ");
			char c = sc.nextLine().charAt(0);
			
			if(c == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				sc.nextLine();
				list.add(new ImportedProduct(name, price, fee));
				
			} else if(c == 'u'){
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateStr = sc.nextLine();
				list.add(new UsedProduct(name, price, dateStr));
			}
			else if (c == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price:");
				double price =sc.nextDouble();
				sc.nextLine();
				list.add(new Products(name, price));
			}
		}
		System.out.println("PRICE TAGS:");
		for(Products p: list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
