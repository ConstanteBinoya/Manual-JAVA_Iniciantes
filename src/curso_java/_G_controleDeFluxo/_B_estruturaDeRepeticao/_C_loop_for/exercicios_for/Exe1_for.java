package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for.exercicios_for;

import java.util.Scanner;

public class Exe1_for {
    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-for.pdf
        /*
         * 1) Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
         * ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numéro inteiro entre 1 e 1000: ");
        int N = sc.nextInt();

        /*
        O bloco while garante que o usuário obedecerá o intervalo determinado.
         */
        while (N < 1 || N > 1000) {
            System.out.println("Valor fora do intervalo permitido. Tente novamente:");
            N = sc.nextInt();
        }

        // Resolução do problema proposto.
        System.out.println("Os números ímpares de 1 até " + N + " são:");
        /*
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
         */

        //Forma alternativa de encontrar os ímpares ou pares a depender da necessidade
        for (int i = 1; i <= N; i += 2) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
