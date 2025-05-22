package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class F_exercicio1 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 1) Dia da Semana:
		 * Peça ao usuário um número de 1 a 7 e exiba o dia correspondente da semana. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha seu dia da semana preferido:\n Domingo [1];\n Segunda [2];\n Terça   [3];\n Quarta  [4];\n Quinta  [5];\n Sexta   [6]; ou\n Sábado  [7].");
		int dia = sc.nextInt();
		System.out.println();
		
		switch (dia) {
		case 1:
			System.out.println("Seu dia preferido da semana é o Domingo");
			break;
		case 2:
			System.out.println("Seu dia preferido da semana é a Segunda");
			break;	
		case 3:
			System.out.println("Seu dia preferido da semana é a Terça");
			break;	
		case 4:
			System.out.println("Seu dia preferido da semana é a Quarta");
			break;
		case 5:
			System.out.println("Seu dia preferido da semana é a Quinta");
			break;
		case 6:
			System.out.println("Seu dia preferido da semana é a Sexta");
			break;
		case 7:
			System.out.println("Seu dia preferido da semana é o sábado");
			break;
		default:
			System.out.println("Opção inválida!");	
		}
		
		System.out.println();
		System.out.println("Obrigado por participar!");
		
		sc.close();

	}

}
