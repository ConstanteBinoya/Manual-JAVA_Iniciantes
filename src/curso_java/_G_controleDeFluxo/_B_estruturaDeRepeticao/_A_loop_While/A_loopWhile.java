package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._A_loop_While;

import java.util.Scanner;

public class A_loopWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivinhe o número secreto: ");
        int x = sc.nextInt();

        // Inicializa a variável 'soma' com zero (que é o elemento NEUTRO).
        // Ela será usada para armazenar a soma de todos os números errados digitados.
        int soma = 0;

        // Início do laço de repetição "while"
        // O loop continuará executando enquanto o número digitado for diferente de zero
        while (x != 0) {
            soma = soma + x; // Adiciona o valor digitado (que está errado) à variável soma

            System.out.println("Errou! Tente novamente.");
            x = sc.nextInt(); // Lê o próximo número digitado pelo usuário
        }
        // Quando o número digitado for 0, o laço termina e estas mensagens são exibidas:

        System.out.println("Mizeravy!!! Acertou de novo.");
        System.out.println("A soma dos números digitados é: " + soma);
        sc.close();

    }

}
