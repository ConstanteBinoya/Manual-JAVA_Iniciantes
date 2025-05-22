package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class G_exercicio3 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 3) Positivo, Negativo ou Zero: O programa classifica um número como
		 * positivo, negativo ou zero usando operador ternário.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		Double numero = sc.nextDouble();
		sc.close();
		
		String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
		
		System.out.println("O número " + numero + " é " + resultado + ".");

	}

}
