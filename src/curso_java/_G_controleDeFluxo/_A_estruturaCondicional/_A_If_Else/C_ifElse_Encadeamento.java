package curso_java._G_controleDeFluxo._A_estruturaCondicional._A_If_Else;

import java.util.Scanner;

public class C_ifElse_Encadeamento {

	public static void main(String[] args) {
		// Estrutura CONDICIONAL ENCADEADA if(){}else{if(){}else{}}

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Digite que horas são: ");
		hora = sc.nextInt();
		System.out.println();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} 
		else if (hora < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		sc.close();

		/*
		 * Em if(){}else{}: se a condiçaõ de if for verdadeira escreve o conteúdo do if;
		 * se for falsa, escreve o contúdo do else.
		 */

	}

}
