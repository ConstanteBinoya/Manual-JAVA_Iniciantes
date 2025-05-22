package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class F_exercicio5 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 5) Classificação de Notas: O usuário informa sua nota (A, B, C, D ou F), e o
		 * programa exibe o significado ("Excelente", "Bom", etc.).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Digite sua nota: \n[Digite: 1 se sua nota foi: A]; \n[Digite: 2 se sua nota foi: B]; \n[Digite: 3 se sua nota foi: C]; \n[Digite: 4 se sua nota foi: D]; ou \n[Digite: 5 se sua nota foi: F].");
		int nota = sc.nextInt();
		System.out.println();

		switch (nota) {
		case 1:
			System.out.println("Sua nota foi EXCELENTE!");
			break;
		case 2:
			System.out.println("Sua nota foi MUITO BOA!");
			break;
		case 3:
			System.out.println("Sua nota foi BOA!");
			break;
		case 4:
			System.out.println("Sua nota foi REGULAR!");
			break;
		case 5:
			System.out.println("Sua nota foi INSUFICIENTE!");
			break;
		default:
			System.out.println("Opção inválida!");
		}

		System.out.println();
		System.out.println("Obrigado por participar!");

		sc.close();

	}

}
