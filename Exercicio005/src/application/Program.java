package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//informations---------------------------------------------------
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.printf("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.printf("Is there na initial deposit (y/n)?");
		char option = sc.nextLine().charAt(0); //char
		//---------------------------------------------------------------
		
		
		//IF ELSE--------------------------------------------------------
		double initialDeposit;
		Bank bank;
		
		if(option == 'n') {
			 bank = new Bank(accountNumber, name);
		}
		else {
			System.out.printf("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			 bank = new Bank(accountNumber, name, initialDeposit);
		}
		
		//-----------------------------------------------------------------
		
		
		//Prints-----------------------------------------------------------
		System.out.println();		
		
		System.out.println("Account Data: ");
		System.out.println(bank); //toString
		
		System.out.println();
			
		System.out.printf("Enter a deposit value: ");
		double money = sc.nextDouble();
		
		System.out.println();		
		
		System.out.println("Update account data: ");
		bank.deposit(money);
		System.out.println(bank);
		
		System.out.println();		
		
		System.out.printf("Enter a withdraw value: ");
		money = sc.nextDouble();
		bank.withdraw(money);
		System.out.println(bank);
		
		
		//-------------------------------------------------------------------------------
		sc.close();
	}

}
