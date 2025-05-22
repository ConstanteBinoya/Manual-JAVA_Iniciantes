package curso_java._G_controleDeFluxo._A_estruturaCondicional._A_If_Else;

import java.util.Scanner;

public class B_ifElse_Composta {

	public static void main(String[] args) {
		// Estrutura CONDICIONAL COMPOSTA if(){}else{}
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Digite que horas são: ");
		hora = sc.nextInt(); 
		System.out.println();
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		}
		else {
			System.out.println("Boa tarde");
		}		
		sc.close();
		
		/* Em if(){}else{}:
		 * se a condiçaõ de if for verdadeira escreve o conteúdo do if;
		 * se for falça, escreve o contúdo do else.*/
	}

}
