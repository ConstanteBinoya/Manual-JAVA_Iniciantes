package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for.exercicios_for;

import java.util.Scanner;

public class Exe3_for {
    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-for.pdf
        /*
         * 3) Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
         * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
         * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
         * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
         * o terceiro valor tem peso 5.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de casos para teste: ");
        int N = sc.nextInt();

        System.out.println("Digite as 3 notas (valores reais com uma casa decimal):");

        //Controle de fluxo, tradicional, que determina a quantidade de testes.
        for (int i = 0; i < N; i++) {
            double nota1 = sc.nextDouble(); //Salva 1ª nota
            double nota2 = sc.nextDouble(); //Salva 2ª nota
            double nota3 = sc.nextDouble(); //Salva 3ª nota

            /*
            Calcula a média ponderada (cada nota é multiplicada por seu respectivo peso,
            e a soma desses produtos é dividida pela soma dos pesos).
             */
            double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
            System.out.printf("Média ponderada: %.1f\n", media);
        }
        sc.close();
    }
}
