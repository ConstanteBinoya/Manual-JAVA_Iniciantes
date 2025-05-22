package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class E_exercicio5 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios2-estrutura-condicional.pdf
		/*
		 * 5) Com base na tabela abaixo, escreva um programa que leia o código de um
		 * item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a
		 * pagar.
		 */

		Scanner sc = new Scanner(System.in);

		double valor, total;

		System.out.println("===============================================");
		System.out.println("|=====             CARDÁPIO              =====|");
		System.out.println("|_____________________________________________|");
		System.out.println("| 1           Cachorro-Quente          R$4.00 |");
		System.out.println("| 2           X-Salada                 R$4.50 |");
		System.out.println("| 3           X-Bacon                  R$5.00 |");
		System.out.println("| 4           Torrada Simples          R$2.00 |");
		System.out.println("| 5           Refrigerante             R$1.50 |");
		System.out.println("===============================================");
		System.out.println();

		System.out.println("Digite o código do produto [1, 2, 3, 4 ou 5]: ");
		int codigo = sc.nextInt();

		System.out.println("Digite a quatidade: ");
		double quantidade = sc.nextDouble();

		sc.close();

		if (codigo == 1) {
			valor = 4.00;
			total = valor * quantidade;
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.printf("%.0f unidades de Cachorro-Quente custam R$%.2f%n", quantidade, total);
			System.out.println("-----------------------------------------------");
		} else if (codigo == 2) {
			valor = 4.50;
			total = valor * quantidade;
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.printf("%.0f unidades de X-Salada custam R$%.2f%n", quantidade, total);
			System.out.println("-----------------------------------------------");
		} else if (codigo == 3) {
			valor = 5.00;
			total = valor * quantidade;
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.printf("%.0f unidades de X-Bacon custam R$%.2f%n", quantidade, total);
			System.out.println("-----------------------------------------------");
		} else if (codigo == 4) {
			valor = 2.00;
			total = valor * quantidade;
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.printf("%.0f unidades de Torradas Simples custam R$%.2f%n", quantidade, total);
			System.out.println("-----------------------------------------------");
		} else {
			valor = 1.50;
			total = valor * quantidade;
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.printf("%.0f unidades de Refrigerante custam R$%.2f%n", quantidade, total);
			System.out.println("-----------------------------------------------");
		}

		System.out.println();
		System.out.println("=========================================");
		System.out.println("====     OBRIGADO POR PARTICIPAR!    ====");
		System.out.println("=========================================");

	}

}
