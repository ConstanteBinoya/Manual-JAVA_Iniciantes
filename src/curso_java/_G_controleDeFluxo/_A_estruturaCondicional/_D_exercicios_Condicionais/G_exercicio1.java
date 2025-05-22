package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class G_exercicio1 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 1) Maior número: O usuário informa dois números, e o programa exibe o maior usando operador 
         * ternário. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero1 = sc.nextDouble();
		System.out.println();
		
		System.out.println("Digite outro número: ");
		double numero2 = sc.nextDouble();
		System.out.println();
		
		double resultado = (numero1 > numero2) ? numero1 : numero2;
		
		System.out.println();
		System.out.printf("o maior número é: %.2f%n", resultado);
		System.out.println();
		
		System.out.println("Obrigado por participar!");
		
		sc.close();

	}
}
