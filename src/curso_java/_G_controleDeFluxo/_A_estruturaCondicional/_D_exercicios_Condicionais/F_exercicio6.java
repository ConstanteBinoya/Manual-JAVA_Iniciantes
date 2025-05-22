package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class F_exercicio6 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 6) Jogo de Dados: Simule o lançamento de um dado (1 a 6) e exiba uma ação
		 * diferente para cada número.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos rolar os dados! digite um número de 1 a 6.");
		int dado = sc.nextInt();
		System.out.println();

		switch (dado) {
		case 1:
			System.out.println("Erro CRÍTICO no teste de habilidades!");
			break;
		case 2:
			System.out.println("Baiixo Desempenho no teste de habilidades!");
			break;
		case 3:
			System.out.println("Desempenho Mediana no teste de habilidades!");
			break;
		case 4:
			System.out.println("BOM Desempenho no teste de habilidades!");
			break;
		case 5:
			System.out.println("Demonstrou MAESTRIA no teste de habilidades!");
			break;
		case 6:
			System.out.println("DOMÍNIO SUPREMO no teste de habilidades!");
			break;
		default:
			System.out.println("Opção inválida!");
		}

		System.out.println();
		System.out.println("Obrigado por participar!");

		sc.close();

	}

}
