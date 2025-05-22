package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class G_exercicio7 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 7) Média de Três Notas: Se a média for maior ou igual a 6, exibe "Aprovado",
		 * senão "Reprovado".
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double media;
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();	
		sc.close();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		String resultado = (media >= 7) ? "Aprovado!" : "Reprovado!";
		
		System.out.println("Sua médoa foi " + media + " e você foi " + resultado);

	}

}
