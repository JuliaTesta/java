package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10]; //criando um vetor do tipo rent com 10 posicoes 
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.printf("Rent #%d\n", i);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			sc.nextLine();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			Rent rent = new Rent(name, email); //isso é para criar o obejto real, com nome e email
			
			vect[roomNumber] = rent; //vai guardar um rent no vetor do numero tal do quarto
		}
		
		System.out.println("Busy rooms:\n ");
		for(int i=0; i<10; i++) {
			if(vect[i]!= null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}
