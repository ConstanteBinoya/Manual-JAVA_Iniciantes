package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for.exercicios_for;

import java.util.Scanner;

public class Exe6_for {
    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-for.pdf
        /*
         * 6) Ler um número inteiro N e calcular todos os seus divisores.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro, para descobrir seus Divisores: ");
        int N = sc.nextInt();

        System.out.print("Divisores de " + N + ": ");
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }
}
