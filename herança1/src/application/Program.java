package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
			
			Account acc = new Account(10001, "Alex", 0.0);
			BusinessAccount bacc = new BusinessAccount(1002	, "Maria", 0.0, 500.0);
			
			//upcasting
			
			Account acc1 = bacc; //atribuindo um objeto do tipo empresarial para obj do tipo account
			Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
			Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
			
			//downcasting
			BusinessAccount acc4 = (BusinessAccount)acc2;
			acc4.loan(100.0);
			//acc2.loan(100.0) é errado, pois cast muda o tipo da variavel, nao o tipo da referencia original
			
			//BusinessAccount acc5 = (BusinessAccount)acc3;
			if(acc3 instanceof BusinessAccount) {
				BusinessAccount acc5 = (BusinessAccount)acc3;
				acc5.loan(200.0);
				System.out.println("Loan!");
			}
			
			if(acc3 instanceof SavingsAccount) {
				SavingsAccount acc5 = (SavingsAccount)acc3;
				acc5.updateBalance();
				System.out.println("Update!");
			}
	}

	
}
