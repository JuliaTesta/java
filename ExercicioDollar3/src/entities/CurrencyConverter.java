package entities;

public class CurrencyConverter {
	
	public static double imp = 0.06;
	
	
	public static double calculator( double dollar, double buy) {
		double total = dollar*buy;
		return total+(imp*total);
	}
}
