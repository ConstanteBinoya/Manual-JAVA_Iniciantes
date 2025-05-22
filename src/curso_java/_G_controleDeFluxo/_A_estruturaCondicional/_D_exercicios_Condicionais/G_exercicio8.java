package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class G_exercicio8 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 8) Frete Grátis: Se o valor da compra for maior que R$200, exibe
		 * "Frete grátis", caso contrário, "Frete de R$20".
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua compra: ");
		double valor = sc.nextDouble();
		
		String frete = (valor > 200) ? "Grátis" : "R$ 20,00";
		
		System.out.println("Sua compra foi de R$" + valor + " e seu frete será de " + frete);
		
		sc.close();

	}

}
