package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class CadastroAlunos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<>();

		int opcao;

		do {
			System.out.println("1- Cadastrar aluno\n");
			System.out.println("2- Listar todos os alunos cadastrados\n");
			System.out.println("3- Buscar alunos por nome\n");
			System.out.println("0- Parar programa\n");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do aluno: ");
				String nome = sc.nextLine();

				System.out.println("Digite a idade do aluno: ");
				int idade = sc.nextInt();
				sc.nextLine();

				System.out.println("Digite a matricula do aluno: ");
				int matricula = sc.nextInt();
				sc.nextLine();

				Aluno novoAluno = new Aluno(nome, idade, matricula);
				alunos.add(novoAluno);

				System.out.println("Aluno cadastrado com sucesso!\n");

				break;

			case 2:
				if (alunos.isEmpty()) {
					System.out.println("Nao ha nenhum aluno cadastrado.\n");
				} else {
					System.out.println("Alunos cadastrados:\n");
					for (int i = 0; i < alunos.size(); i++) {

						Aluno aluno = alunos.get(i); // variavel do tipo aluno, chamada aluno, que vai
						// apontar para o objeto ja existente na lista.

						System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade() + " Matrícula: "
								+ aluno.getMatricula());
					}
				}

				break;

			case 3:
				if (alunos.isEmpty()) {
					System.out.println("Nao ha alunos cadastrados.\n");
				} else {
					System.out.println("Digite o nome do aluno para buscar: \n");
					String buscarNome = sc.nextLine().toLowerCase();

					boolean encontrado = false;
					for (int i = 0; i < alunos.size(); i++) {
						Aluno aluno = alunos.get(i);
						if (aluno.getNome().toLowerCase().equals(buscarNome)) {
							System.out.println("Aluno encontrado: \n");
							System.out.println("Nome: " + aluno.getNome() + "Idade: " + aluno.getIdade() + "Matricula: "
									+ aluno.getMatricula());
							encontrado = true;
						}

					}
					if (!encontrado) {
						System.out.println("Aluno nao encontrado.\n");
					}

				}
				break;

			case 0:
				System.out.println("Encerrando programa...");
				break;

			default:
				System.out.println("Opcao invalida!\n");
			}

		} while (opcao != 0);

		sc.close();

	}

}
