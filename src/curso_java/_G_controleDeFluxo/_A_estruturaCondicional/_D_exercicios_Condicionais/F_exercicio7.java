package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class F_exercicio7 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 7) Escolha de Bebida: O usuário escolhe entre café, chá ou suco, e o programa
		 * retorna a bebida escolhida.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("=======================================");
		System.out.println("==  Seja Bem-vindo ao QUERUBIM-BAR!  ==");
		System.out.println("=======================================");
		System.out.println();
		System.out.println("Escolha sua bebida: \nCafé -----> 1; \nChá ------> 2; ou \nSuco -----> 3.");
		int bebida = sc.nextInt();
		System.out.println();

		switch (bebida) {
		case 1:
			System.out.println("Aqui está o seu CAFÉ.");
			break;
		case 2:
			System.out.println("Aqui está o seu CHÁ.");
			break;
		case 3:
			System.out.println("Aqui está o seu SUCO.");
			break;
		default:
			System.out.println("Opção inválida! Você é burro?");
		}

		System.out.println();
		System.out.println("Obrigado por participar!");
		sc.close();

	}

}
