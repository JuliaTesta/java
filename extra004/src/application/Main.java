package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Desenvolvedor;
import entities.Funcionario;
import entities.Gerente;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		//UPCASTING
		Funcionario f1 = new Gerente("Alice ", "RH", 7000.0);
		Funcionario f2 = new Desenvolvedor("Bruno", "Java", 6000.0);
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		
		//DOWNCASTING
		for(Funcionario f: funcionarios) { //esta percorrendo a lista de funcionarios(todos armazenados 
			//como funcionarios).
			f.exibirInformacoes();
			
			if(f instanceof Gerente) {
				Gerente g = (Gerente) f; //downcasting
				g.gerenciarEquipe();
			} else if(f instanceof Desenvolvedor) {
				Desenvolvedor d = (Desenvolvedor) f;
				d.codarProjeto();
			}
			
			System.out.println();
		}
		sc.close();
	}

}
