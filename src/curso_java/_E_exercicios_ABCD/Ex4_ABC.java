package curso_java._E_exercicios_ABCD;

import java.util.Locale;
import java.util.Scanner;

public class Ex4_ABC {
	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios1-estrutura-sequencial.pdf
		/*
		 * 3) Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double multi1, multi2, diferenca;
		
		System.out.println("==============================================");
		System.out.println("======       DIFERENÇA pelo PRODUTO     ======");
		System.out.println("==============================================");
		System.out.println("      |         (A * B - C * D)        |");
		System.out.println("      ==================================");
		System.out.println();
		
		System.out.println("Digite o valor de \"A\": ");
		double A = sc.nextDouble();
		System.out.println();
		
		System.out.println("Digite o valor de \"B\": ");
		double B = sc.nextDouble();
		System.out.println();
		
		System.out.println("Digite o valor de \"C\": ");
		double C = sc.nextDouble();
		System.out.println();
		
		System.out.println("Digite o valor de \"D\": ");
		double D = sc.nextDouble();
		System.out.println();
		
		sc.close();
		
		System.out.println("A= " + A + ";");
		System.out.println("B= " + B + ";");
		System.out.println("C= " + C + ";");
		System.out.println("D= " + D + ";");
		System.out.println();
		
		multi1 = A * B;
		multi2 = C * D;
		
		System.out.println(A + " x " + B + " = " + multi1 + ";");
		System.out.println(C + " x " + D + " = " + multi2 + ";");
		System.out.println();
		
		diferenca = multi1 - multi2;
		
		System.out.println(multi1 + " - " + multi2 + " = " + diferenca + ".");
		System.out.println();
		System.out.println("==============================================");
		System.out.println("======     OBRIGADO POR PARTICIPAR!     ======");
		System.out.println("==============================================");

	}
}
