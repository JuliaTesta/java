package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Employee #%d: \n", i+1);
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			
			Employee emp = new Employee(id, name, salary); //I want put this in list
			list.add(emp);
		}
			
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		sc.nextLine();
		
		Integer hasId = hasId(list, idSalary);
		if(hasId == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(hasId).increaseSalary(percentage);
		}
	
		System.out.println("");
		System.out.println("List of employees:\n ");
		for(Employee emp : list) {
			System.out.println(emp); //toString
		}
		
		sc.close();

	}
	
	public static Integer hasId(List<Employee> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
