package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class E_exercicio2 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios2-estrutura-condicional.pdf
		/*
		 * 2) Fazer um programa para ler um número inteiro e dizer se este número é par
		 * ou ímpar.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("|=====    POSITIVO ou NEGATIVO?    =====|");
		System.out.println("|_______________________________________|");
		System.out.println();
		
		System.out.println("Digite um número INTEIRO: ");
		int numero = sc.nextInt();
		sc.close();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		} 
		else {
			System.out.println("O número " + numero + " é impar.");
		}
		
		System.out.println();
		System.out.println("=========================================");
		System.out.println("====     OBRIGADO POR PARTICIPAR!    ====");
		System.out.println("=========================================");

	}

}
