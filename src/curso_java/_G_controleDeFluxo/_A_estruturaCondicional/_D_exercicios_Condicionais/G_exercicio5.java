package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class G_exercicio5 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 5) Maioridade: O programa verifica se a idade informada é maior ou menor de 18 anos. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite su idade: ");
		int idade = sc.nextInt();
		sc.close();
		
		String maiorIdade = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		
		System.out.println(maiorIdade);

	}

}
