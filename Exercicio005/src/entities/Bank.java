package entities;

public class Bank {

	private int accountNumber;
	private String name;
	private double balance;

	// constructors-----------------------------------------------
	public Bank(int accountNumber, String name, double inicialDeposit) {

		this.accountNumber = accountNumber;
		this.name = name;
		deposit(inicialDeposit); //protect constructor of changes in the future
	}

	public Bank(int accountNumber, String name) {

		this.accountNumber = accountNumber;
		this.name = name;
	}
	// ---------------------------------------------------------

	public int getAccountNumber() {
		return accountNumber;
	} //don't change the number of account

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	} //change balance only + or -

	//-------------------------------------------------------
	
	public double deposit (double amount) {
		return balance+=amount; 
	}
	
	public double withdraw(double amount) {
		return balance -= (amount + 5.00); // => balance = balance - (amount - 5)
	}
	
	
	public String toString() {
		return String.format("Account: %d, Holder: %s, Balance: $ %.2f",accountNumber, name, balance);
	}
}
