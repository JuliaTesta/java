package entities;

public class Student {
	
	public String name;
	public double g1, g2, g3;
	
	public double finalGrade() {
		return g1+g2+g3;
	}
	
	public double missingPoints() {
		return 60.00-finalGrade();
	}
}
