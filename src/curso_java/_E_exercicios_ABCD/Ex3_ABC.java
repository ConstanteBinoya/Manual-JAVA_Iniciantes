package curso_java._E_exercicios_ABCD;

import java.util.Locale;
import java.util.Scanner;

public class Ex3_ABC {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios1-estrutura-sequencial.pdf
		/*
		 * 2) Faça um programa para ler o valor do raio de um círculo, e depois mostrar
		 * o valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * 
		 * # Fórmula da área: area = π . raio2
		 * # Considere o valor de π = 3.14159
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double areaCirculo; 
		
		System.out.println("==============================================");
		System.out.println("|=====          CALCULATOR AREA         =====|");
		System.out.println("     |==================================|");
		System.out.println("      |    Área do Circulo: π * r²     |");
		System.out.println("      ==================================");
		System.out.println();
		
		System.out.println("Digite o valor do raio de uma circunferência: ");
		double raio = sc.nextDouble();		
		sc.close();
		
		areaCirculo = pi * Math.pow(raio, 2.0);
		
		System.out.println("ooooooooooooooooooooooooooooooooooo");
		System.out.println("O circulo tem " + raio + " de raio.");
		System.out.println("ooooooooooooooooooooooooooooooooooo");
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("E sua área é de: " + areaCirculo + ".");	
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();
		System.out.println("==============================================");
		System.out.println("======     OBRIGADO POR PARTICIPAR!     ======");
		System.out.println("==============================================");

	}
}
