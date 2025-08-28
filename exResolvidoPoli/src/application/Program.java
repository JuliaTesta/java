package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Outsourced (y/n)? ");
			char out = sc.next().charAt(0); 
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(out == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				sc.nextLine();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour,additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name,hours,valuePerHour);
				list.add(emp);
			}	
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
		}
		sc.close();

	}

}
