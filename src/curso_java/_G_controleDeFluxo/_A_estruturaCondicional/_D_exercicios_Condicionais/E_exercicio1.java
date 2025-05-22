package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class E_exercicio1 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios2-estrutura-condicional.pdf
		/*
		 * 1) Fazer um programa para ler um número inteiro, e depois dizer se este
		 * número é negativo ou não.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("=========================================");
		System.out.println("|=====    POSITIVO ou NEGATIVO?    =====|");
		System.out.println("|_______________________________________|");
		System.out.println();
		
		System.out.println("Digite um numero INTEIRO: ");
		numero = sc.nextInt();
		sc.close();
		System.out.println();		

		/*
		String result = (numero < 0 ) ? "Negativo" : "Positivo";
		System.out.println("O número " + numero + " é " + result);
		 */

		if(numero < 0) {
			System.out.println("O numero " + numero + " é negativo.");
		}
		else {
			System.out.println("O numero " + numero + " é positivo.");
		}
		
		System.out.println("=========================================");
		System.out.println("====     OBRIGADO POR PARTICIPAR!    ====");
		System.out.println("=========================================");
	}
}
