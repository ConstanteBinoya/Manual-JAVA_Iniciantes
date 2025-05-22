package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class G_exercicio2 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 2) Número Par ou Ímpar: O programa verifica se um número informado pelo usuário é par ou ímpar.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		sc.close();
		System.out.println();
		
		String resultado = (numero % 2 == 0) ? "é PAR." : "é IMPAR.";
		
		System.out.println(numero + " " + resultado);

	}

}
