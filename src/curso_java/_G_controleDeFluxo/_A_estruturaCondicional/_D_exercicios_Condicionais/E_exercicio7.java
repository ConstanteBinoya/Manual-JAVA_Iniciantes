package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class E_exercicio7 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios2-estrutura-condicional.pdf
		/*
		 * 6) Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0).
		 * 
		 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
		 * 
		 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme
		 * for a situação.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("|=====         PLANO CARTESIANO         =====|");
		System.out.println("|____________________________________________|");
		System.out.println("|                 Q2  |y Q1                  |");
		System.out.println("|                _____|_____x                |");
		System.out.println("|                     |                      |");
		System.out.println("|                 Q3  |  Q4                  |");
		System.out.println("==============================================");
		System.out.println();
	
		System.out.println("Digite um número com ponto flutuante. Ex: [3.5]");
		Double x = sc.nextDouble();
		System.out.println();
		
		System.out.println("Digite mai um número com ponto flutuante. Ex: [5.3]");
		Double y = sc.nextDouble();
		System.out.println();

		if (x == 0.0 && y == 0.0) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("Suas coordenadas: %.1f e %.1f localizam-se na Origem do gráfico.%n", x, y);
			System.out.println("---------------------------------------------------------------");
		} else if (x ==0.0) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("Suas coordenadas: %.1f e %.1f localizam-se no Eixo \"Y\" do gráfico.%n", x, y);
			System.out.println("---------------------------------------------------------------");
		} else if (y == 0.0) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("Suas coordenadas: %.1f e %.1f localizam-se no Eixo \"X\" do gráfico.%n", x, y);
			System.out.println("---------------------------------------------------------------");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("Suas coordenadas: %.1f e %.1f localizam-se no Quadrante - Q1 do gráfico.%n", x, y);
			System.out.println("---------------------------------------------------------------");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("Suas coordenadas: %.1f e %.1f localizam-se no Quadrante - Q2 do gráfico.%n", x, y);
			System.out.println("---------------------------------------------------------------");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("Suas coordenadas: %.1f e %.1f localizam-se no Quadrante - Q3 do gráfico.%n", x, y);
			System.out.println("---------------------------------------------------------------");
		} else {
			System.out.println("---------------------------------------------------------------");
			System.out.printf("Suas coordenadas: %.1f e %.1f localizam-se no Quadrante - Q4 do gráfico.%n", x, y);
			System.out.println("---------------------------------------------------------------");
		}

		System.out.println();
		System.out.println("=========================================");
		System.out.println("====     OBRIGADO POR PARTICIPAR!    ====");
		System.out.println("=========================================");
		
		sc.close();

	}

}
