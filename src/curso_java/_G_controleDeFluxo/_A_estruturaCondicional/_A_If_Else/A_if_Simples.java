package curso_java._G_controleDeFluxo._A_estruturaCondicional._A_If_Else;

public class A_if_Simples {

	public static void main(String[] args) {
		// Estrutura CONDICIONAL SIMPLES if(){}

		int x = 5;

		System.out.println("Bom dia");

		if (x < 0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Boa noite");

		// Estrutura do if: if(){}
		/*
		 * if(condição booleana){ Entre chaves fica o fluxo, saída, evento que ocorrerá
		 * caso a condição seja verdadeira. }
		 */
		// Ou seja, "Boa tarde" só será impresso se
		// "x" (que tem valor 5) for menor que "0"
	}
}