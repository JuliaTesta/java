package Package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("How many employees will be registered? ");
		n = sc.nextInt();	
		sc.nextLine();
		
		int[] id = new int [n];
		String[] name = new String[n];
		double[] salary = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Employee #%i: \n", i+1);
			
			System.out.print("Id: ");
			id[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			name[i] = sc.nextLine();
			
			System.out.print("Salary: ");
			salary[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double perc, newSalary;
		int idS;
		
		System.out.print("Enter the employee id that will have salary  increase: ");
		idS = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the percentage");
		perc = sc.nextDouble();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			if (idS == id[i] ) {
				newSalary= salary[i] * perc;
				newSalary += salary[i];
			}
		}
		
		System.out.print("List of employess: \n");
		for(int i =0; i<n; i++) {
			System.out.printf("%d, %s, %.2f", id[i], name[i], salary[i]);
		}
		
		sc.close();

	}

}