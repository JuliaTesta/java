package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Bank bank;
		
		System.out.println("Enter account number:");
		int number = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter account holder:");
		String holder = sc.nextLine();
		
		
		
		System.out.println("Is there na initial deposit (y/n)?");
		char option = sc.next().charAt(0);
		
		if(option == 'y') {
			System.out.println("Enter a deposit value:");
			double deposit = sc.nextDouble();
			
			bank = new Bank(number, holder, deposit);
			
			System.out.println("Account data: ");
			System.out.println(bank);
			
		} else {
			bank = new Bank(number, holder);
			System.out.println(bank);
		}
		
		System.out.println("Enter a deposit  value: ");
		double depositValue = sc.nextDouble();
		
		System.out.println("Update account data: ");
		bank.deposit(depositValue);
	    System.out.println(bank);
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		
		System.out.println("Update account data: ");
		bank.withdraw(withdrawValue);
		System.out.println(bank);
		
		sc.close();
		
	}
}
