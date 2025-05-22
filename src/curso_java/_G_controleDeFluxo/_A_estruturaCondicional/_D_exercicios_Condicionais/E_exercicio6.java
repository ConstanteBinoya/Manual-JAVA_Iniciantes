package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Locale;
import java.util.Random;

public class E_exercicio6 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios2-estrutura-condicional.pdf
		/*
		 * 6) Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */

		Locale.setDefault(Locale.US);
		Random rdm = new Random();

		System.out.println("==============================================");
		System.out.println("|=====            INTERVALOS            =====|");
		System.out.println("|____________________________________________|");
		System.out.println("|               1º    [00 à 25]              |");
		System.out.println("|               2º    [25 à 50]              |");
		System.out.println("|               3º    [50 à 75]              |");
		System.out.println("|               4º    [75 à 100]             |");
		System.out.println("==============================================");
		System.out.println();

		Double aleatorio = rdm.nextDouble() * 101;
		System.out.println("O sistema sorteou o número " + aleatorio);
		System.out.println();

		if (aleatorio < 0 || aleatorio > 100) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("O número sorteado é: %.2f e está fora dos intervalos.%n", aleatorio);
			System.out.println("---------------------------------------------------------------");
		} 
		else if (aleatorio <= 25) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("O número sorteado é: %.2f e está no 1º intervalo [00 à 25].%n", aleatorio);
			System.out.println("---------------------------------------------------------------");
		} 
		else if (aleatorio > 25 && aleatorio <= 50) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("O número sorteado é: %.2f e está no 2º intervalo [25 à 50].%n", aleatorio);
			System.out.println("---------------------------------------------------------------");
		} 
		else if (aleatorio > 50 && aleatorio <= 75) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("O número sorteado é: %.2f e está no 3º intervalo [50 à 75].%n", aleatorio);
			System.out.println("---------------------------------------------------------------");
		} 
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("O número sorteado é: %.2f e está no 4º intervalo [75 à 100].%n", aleatorio);
			System.out.println("---------------------------------------------------------------");			
		}

		System.out.println();
		System.out.println("=========================================");
		System.out.println("====     OBRIGADO POR PARTICIPAR!    ====");
		System.out.println("=========================================");

	}

}
