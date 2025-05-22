package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for.exercicios_for;

import java.util.Scanner;

public class Exe2_for {
    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-for.pdf
        /*
         * 2) Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
         * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
         * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações
         * conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora
         * do intervalo).
         */

        Scanner sc = new Scanner(System.in);

        int inCount = 0;
        int outCount = 0;

        System.out.println("Digite a quantidade de números a ser coletados: ");
        int N = sc.nextInt();

        System.out.println("Agora digite os " + N + " números, um por linha:");
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                inCount++;
            }
            else {
                outCount++;
            }
        }
        System.out.println(inCount + " in\n" + outCount +" out");

        sc.close();
    }
}


