package entities;

public class BusinessAccount extends Account{
		private double loanLimit;
		
		public BusinessAccount() { //constructor
			super();
		}

		public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
			super(number, holder, balance); //chamando constructor da super class
			this.loanLimit = loanLimit;
		}

		public double getLoanLimit() {
			return loanLimit;
		}

		public void setLoanLimit(double loanLimit) {
			this.loanLimit = loanLimit;
		}
		
		public void loan (double amount){ //vou emprestar dinheiro
			if(amount <= loanLimit) {
				balance += amount -10.0;
			}	
		}		
}
