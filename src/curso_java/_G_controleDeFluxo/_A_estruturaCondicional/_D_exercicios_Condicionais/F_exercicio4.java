package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class F_exercicio4 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 4) Operações Matemáticas: 
		 * Peça dois números e uma operação (+, -, *, /) e retorne o resultado. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para ser o numerador: ");
		int numerador = sc.nextInt();
		System.out.println();
		
		System.out.println("Digite outro número para ser o denominador: ");
		int denominador = sc.nextInt();
		System.out.println();
		
		System.out.println("Seleciona a operação desejada [1 = +], [2 = -], [3 = *] e [4 = /]: ");
		int operador = sc.nextInt();
		System.out.println();
		
		switch (operador) {
		case 1:
			operador = numerador + denominador;
			System.out.println(numerador + " + " + denominador + "= " + operador);
			break;
		case 2:
			operador = numerador - denominador;
			System.out.println(numerador + " - " + denominador + "= " + operador);
			break;
		case 3:
			operador = numerador * denominador;
			System.out.println(numerador + " x " + denominador + "= " + operador);
			break;
		case 4:
			operador = numerador / denominador;
			System.out.println(numerador + " / " + denominador + "= " + operador);
			break;
		default:
			System.out.println("Oparação inválida!");	
		}
		
		System.out.println();
		System.out.println("Obrigado por participar!");
		
		sc.close();

	}

}
