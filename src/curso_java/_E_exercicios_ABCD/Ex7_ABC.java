package curso_java._E_exercicios_ABCD;

import java.util.Locale;
import java.util.Scanner;

public class Ex7_ABC {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios1-estrutura-sequencial.pdf
		/*
		 * 6) Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre:
		 */
		// a) a área do triângulo retângulo que tem A por base e C por altura.
        // b) a área do círculo de raio C. (pi = 3.14159)
        // c) a área do trapézio que tem A e B por bases e C por altura.
        // d) a área do quadrado que tem lado B.
        // e) a área do retângulo que tem lados A e B.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;
		
		System.out.println("=============================================================");
		System.out.println("|=====              GEOMETRIATOR - 3000                =====|");
		System.out.println("|___________________________________________________________|");
		System.out.println("|                         Fórmulas                          |");
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("| Área do Triângulo: (base * altura) / 2                    |");
		System.out.println("| Área do Círculo:       π * r²                             |");
		System.out.println("| Área do Trapézio: ((baseMaior + baseMenor) * altura) / 2; |");
		System.out.println("| Área do Quadrado:      lado²                              |");
		System.out.println("| Área do Retângulo:  base * altura                         |");
		System.out.println("=============================================================");
		System.out.println();
		
		System.out.println("Digite o primeiro valor: ");
		double A = sc.nextDouble();
		System.out.println();
		
		System.out.println("Digite o segundo valor: ");
		double B = sc.nextDouble();
		System.out.println();
		
		System.out.println("Digite o terceiro valor: ");
		double C = sc.nextDouble();
		sc.close();
		System.out.println();
		
		System.out.println("|____________________________|");
		System.out.println("  Os valores digitados foram: ");
		System.out.println("|----------------------------|");
		System.out.println("  A = " + A + ";");
		System.out.println("  B = " + B + "; e");
		System.out.println("  C = " + C + ".");
		System.out.println("|____________________________|");
		System.out.println();
		
		pi = 3.14159;
		areaTriangulo = A * B;
		areaCirculo = pi * Math.pow(C, 2.0);
		areaTrapezio = ((A + B) * C) / 2.0;
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A * B;

		System.out.println("================================================");
		System.out.println("|=====             RESOLUÇÃO              =====|");
		System.out.println("|______________________________________________|");
		System.out.printf("  Triângulo: (" + A + " x " + B + ") / 2 = %.3f%n", areaTriangulo);
		System.out.println("-----------------------------------------------");
		System.out.printf("  Círculo:    π x " + C + "² = %.3f%n", areaCirculo);
		System.out.println("-----------------------------------------------");
		System.out.printf("  Trapézio:  ((" + A + " + " + B + ") x " + C + ") / 2 = %.3f%n", areaTrapezio);
		System.out.println("-----------------------------------------------");
		System.out.printf("  Quadrado:  " + B + "² = %.3f%n", areaQuadrado);
		System.out.println("-----------------------------------------------");
		System.out.printf("  Retângulo: " + A + " x " + B + " = %.3f%n", areaRetangulo);
		System.out.println("================================================");
		System.out.println();
		
		System.out.println("=============================================================");
		System.out.println("======             OBRIGADO POR PARTICIPAR!            ======");
		System.out.println("=============================================================");		
		
	}
}
