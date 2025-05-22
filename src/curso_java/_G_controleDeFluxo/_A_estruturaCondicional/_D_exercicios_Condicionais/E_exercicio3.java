package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class E_exercicio3 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios2-estrutura-condicional.pdf
		/*
		 * 3) Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
		 * mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
		 * lidos são múltiplos entre si. Atenção: os números devem poder ser digitados
		 * em ordem crescente ou decrescente.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("|=====          MULTIPLOS          =====|");
		System.out.println("|_______________________________________|");
		System.out.println();

		System.out.println("Digite um número INTEIRO: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite outro número INTEIRO: ");
		int numero2 = sc.nextInt();
		
		sc.close();

		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println(numero1 + " e " + numero2 + " são multiplos entre si.");
		} 
		else {
			System.out.println(numero1 + " e " + numero2 + " não são multiplos.");
		}

		System.out.println();
		System.out.println("=========================================");
		System.out.println("====     OBRIGADO POR PARTICIPAR!    ====");
		System.out.println("=========================================");

	}

}
