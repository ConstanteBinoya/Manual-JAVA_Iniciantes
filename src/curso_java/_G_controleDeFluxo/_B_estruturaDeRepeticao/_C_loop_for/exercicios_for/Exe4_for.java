package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for.exercicios_for;

import java.util.Scanner;

public class Exe4_for {
    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-for.pdf
        /*
         * 4) Fazer um programa para ler um número N. Depois leia N pares de números e
         * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
         * mostrar a mensagem "divisao impossivel".
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de testes: ");
        int N = sc.nextInt();

        System.out.println("Digite dois valores por linha (numerador e divisor):");

        // Loop para processar N pares de valores
        for (int i = 0; i < N; i++) {
            double numerador = sc.nextDouble();
            double divisor = sc.nextDouble();

            // Verifica se o divisor é zero antes de realizar a divisão
            if (divisor == 0) {
                System.out.println("Divisão impossivel: " + numerador + " / " + divisor);
            }
            else {
                double divisao = numerador / divisor;

                //System.out.println(numerador + " / " + divisor + " = " + divisao);
                System.out.printf("%.2f / %.2f = %.2f%n", numerador, divisor, divisao);
            }
        }
        sc.close();
    }
}
