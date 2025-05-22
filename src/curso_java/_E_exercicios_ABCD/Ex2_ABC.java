package curso_java._E_exercicios_ABCD;

import java.util.Scanner;

public class Ex2_ABC {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios1-estrutura-sequencial.pdf
		/*
		 * 1) Faça um programa para ler dois valores inteiros, e depois mostrar na tela
		 * a soma desses números com uma mensagem explicativa, conforme exemplos. ;
		 */

		Scanner sc = new Scanner(System.in);

		int resultado;

		System.out.println("=====================================");
		System.out.println("=====    SOMADOR de INTEIROS    =====");
		System.out.println("=====================================");
		System.out.println();

		System.out.println("Digite o primeiro número inteiro: ");
		int numero1 = sc.nextInt();
		System.out.println();

		System.out.println("Digite o segundo número inteiro: ");
		int numero2 = sc.nextInt();
		System.out.println();

		sc.close();

		resultado = numero1 + numero2;

		System.out.println(".....................................");
		System.out.println("Os números digitados foram: " + numero1 + " e " + numero2);
		System.out.println(".....................................");
		System.out.println();

		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("O Resultado de " + numero1 + " + " + numero2 + " = " + resultado);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println();

		System.out.println("================================");
		System.out.println("=== OBRIGADO POR PARTICIPAR! ===");
		System.out.println("================================");

	}

}
