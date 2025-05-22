package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._A_loop_While.exercicios_while;

import java.util.Scanner;

public class Exe2_while {

    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-while.pdf
        /*
         * 2) Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de
         * pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
         * O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
         * (nesta situação sem escrever mensagem alguma).
         */

        Scanner sc = new Scanner(System.in);

        int x, y;

        // Lê os primeiros valores
        System.out.println("Digite a coordenada X:");
        x = sc.nextInt();

        System.out.println("Digite a coordenada Y:");
        y = sc.nextInt();

        // Executa enquanto X e Y forem diferentes de 0
        while (x != 0 && y != 0) {

            // Verifica e imprime o quadrante correspondente
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto Quadrante");
            }

            // Lê novos valores
            System.out.println("Digite a coordenada X:");
            x = sc.nextInt();

            System.out.println("Digite a coordenada Y:");
            y = sc.nextInt();
        }

        // Quando uma das coordenadas for zero, o loop encerra silenciosamente
        sc.close();

    }
}
