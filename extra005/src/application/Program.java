package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Animal;
import entities.Elefante;
import entities.Leao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Animal> animais = new ArrayList<>();
		
		//upcasting
		Animal l1 = new Leao("Alex", 13);
		Animal l2 = new Leao("Jubs", 10);
		Animal e1 = new Elefante("Rosa", 9);
		Animal e2 = new Elefante("Tito", 14);
		
		animais.add(l1);
		animais.add(l2);
		animais.add(e1);
		animais.add(e2);
		
		//downcasting
		for(Animal a: animais) {
			a.exibirInformacoes();
			
			if(a instanceof Leao) {
				Leao leao = (Leao) a;
				leao.rugir();
			} else if(a instanceof Elefante){
				Elefante elefante = (Elefante) a;
				elefante.tocarTromba();
			}
			
			System.out.println();
		}
	}

}
