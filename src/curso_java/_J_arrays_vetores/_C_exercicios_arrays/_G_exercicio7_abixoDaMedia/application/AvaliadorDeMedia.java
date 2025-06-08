package curso_java._J_arrays_vetores._C_exercicios_arrays._G_exercicio7_abixoDaMedia.application;

import java.util.Locale;
import java.util.Scanner;

public class AvaliadorDeMedia {
    public static void main(String[] args) {

        /**
         * Fazer um programa para ler um número inteiro N e depois um vetor de N números
         * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
         * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
         * abaixo da média, com uma casa decimal cada.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que deseja avaliar: ");
        int N = sc.nextInt();

        double[] notas = new double[N];

        System.out.println("\nDigite " + N + " notas para a verificação: ");
        for (int i = 0; i < notas.length; i++){
            notas[i] = sc.nextDouble();
        }

        double somatorio = 0.0;

        for (double nota : notas) {
                somatorio += nota;
        }

        double media = somatorio / N;

        System.out.printf("\nMédia das notas fornecidas: %.3f", media);
        System.out.println("\nNotas abaixo da média: ");

        for (double nota : notas) {
            if (nota < media) {

                // TRUNCAMENTO DE UM NÚMERO PARA 1 CASA DECIMAL (SEM ARREDONDAR):
                /*
                // A operação abaixo é utilizada para truncar um número decimal para
                penas uma casa decimal, SEM realizar arredondamento.
                Exemplo: transformar 9.87 em 9.8.

                double notaTruncada = Math.floor(nota * 10) / 10;

                PASSO A PASSO:

                1. Multiplicamos a nota por 10 → isso desloca a primeira casa decimal
                para a parte inteira.
                     Ex: 9.87 * 10 = 98.7

                2. Aplicamos Math.floor(98.7) → que trunca (arredonda para baixo) o
                número: 98.7 → 98.0

                3. Dividimos o resultado por 10 → para retornar à escala original:
                98.0 / 10 = 9.8

                Assim, conseguimos truncar a nota para uma casa decimal sem usar
                arredondamento.
                Isso é útil em situações em que queremos apenas cortar os decimais
                excedentes,
                e não "aproximar" o valor com base na casa seguinte.
                 */
                double notaTruncada = Math.floor(nota * 10) / 10;
                System.out.printf("%.1f\n", notaTruncada);
            }
        }

        sc.close();
    }
}
