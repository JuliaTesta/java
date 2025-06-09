package entities;

public class CurrencyConverter {

	public double dollar, buy;
	
	public double result() {
		double bought = dollar*buy;
		double tax = bought*0.06;
		double result = tax + bought;
		
		return result;
	}
}
