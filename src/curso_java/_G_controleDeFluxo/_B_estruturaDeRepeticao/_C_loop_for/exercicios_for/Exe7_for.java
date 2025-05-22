package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for.exercicios_for;

import java.util.Scanner;

public class Exe7_for {
    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-for.pdf
        /*
         * 7) Fazer um programa para ler um número inteiro positivo N.
         * O programa deve então mostrar na tela N linhas, começando de 1 até N.
         * Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do
         * valor, conforme exemplo.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int N = sc.nextInt();

        while (N <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
            N = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);
        }
        sc.close();
    }
}
