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
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Employee #%d", i+1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			Employee emp = new Employee();
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary incrase: ");
		int idSalary = sc.nextInt();
		sc.nextLine();
		
		Integer hasId = hasId(list, idSalary); //passando oq a funcao retornou para hasId
			if(hasId == null) {
				System.out.print("This id does not exist\n");
			} else {
				System.out.printf("Enter the percentage: ");
				double percentage = sc.nextDouble();
				list.get(hasId).increaseSalary(percentage); //acessa a posicao hasId
			}
		
		System.out.print("List of employees: ");
		for(Employee emp : list ) {
			System.out.println(emp); //toString
		}
		
		sc.close();
		
	}
	
	public static Integer hasId(List<Employee>list, int id) { //recebendo esses parametros
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
		
	
