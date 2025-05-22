package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class F_exercicio2 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 2) Classificação de Idade: O usuário informa sua idade, e o programa exibe se
		 * ele é "Criança", "Adolescente", "Adulto" ou "Idoso".
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua Idade:");
		int idade = sc.nextInt();
		System.out.println();

		// Como o Switch-Case não deve ser usado com raciocínios que envolvam
		// interválos, para resolver a questão foi feita uma "gambiarra" envolvendo a
		// estrutura ternária.
		
		// leia o arquivo README.md do pacote Switch-Case.
		
		int faixaEtaria = (idade < 0) ? -1 : (idade <= 12) ? 0 : (idade <= 17) ? 1 : (idade <= 59) ? 2 : 3;

		switch (faixaEtaria) {
		case 0:
			System.out.println("De acordo com sua idade (" + idade + "), você é uma Criança.");
			break;
		case 1:
			System.out.println("De acordo com sua idade (" + idade + "), você é um Adolescente.");
			break;
		case 2:
			System.out.println("De acordo com sua idade (" + idade + "), você é um Adulto.");
			break;
		case 3:
			System.out.println("De acordo com sua idade (" + idade + "), você é um Idoso.");
			break;
		default:
			System.out.println("Idade inválida!");
		}

		System.out.println();
		System.out.println("Obrigado por participar!");

		sc.close();

	}

}
