package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for.exercicios_for;

import java.util.Scanner;

public class Exe5_for {
    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-for.pdf
        /*
         * 5) Ler um valor N. Calcular e escrever seu respectivo fatorial.
         * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que,
         * por definição, fatorial de 0 é 1.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja descobrir o Fatorial de qual número?");
        int N = sc.nextInt();

        long fatorial = 1; // usamos long para aguentar valores maiores

        String expressao = ""; // vai montar a parte visual tipo "5 * 4 * 3 * 2 * 1"

        //Resolução mais simples: apenas o resultado
        /*
        for (int i = 1; i <= N; i++ ) {
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial de " + N + " é:" + fatorial);
         */

        /*
        INÍCIO >>> [int i = N;]: Seguindo a lógica de càlculo do fatorial de um número,
        o fluxo será sempre decrescente, por tanto, a variável "i" tem seu valor inicial
        exatamente o mesmo do número que será sobmetido ao fatorial (ponto de partida);

        CONDIÇÃO >>> [i >= 1;]: enquanto o valor de "i" for maior que "1" o loop se
        repetirá, pois sinaliza o destino final do loop: "i" ser menor que "1", ou seja,
        inicia em um número qualquer e decrece até o "0";

        INCREMENTO/DECREMENTO >>> [i-- ou i - 1;]: sinaliza que para cada volta que o
        loop der a variável "i" diminui em uma unidade (-1), isso possibilitará a saída
        do loop assim que a condição [i >= 1;] naõ for verdadeira, em outras palavras,
        assim que i = 0;
         */
        for (int i = N; i >= 1; i--) {
            fatorial *= i; //Efetua, de fato, o cáculo do fatorial. A variável "fatorial"
                           //é iniciada com 1 por ele ser o elemento neutro da
                           // multiplicação, não poderia ser de outra forma, pois se
                           // fosse iniciado por "0" a resposta dessa multiplicação seri
                           // eternamente "0".

            expressao += i; //Apenas garante uma boa visualização do calculo de um
                            // fatorial etapa a etapa.

            /*
            Neste if, também serve para a parte visual, construindo o incremento da
            fórmula: X! = x * (x-1) * (x-2) * (x-3)...
             */
            if (i > 1) {
                expressao += " * ";
            }
        }

        /*
        Neste if fora do escopo do for, é garantida uma regra do raciocínio fatorial:
        0! = 1.
         */
        if (N == 0) {
            expressao = "1"; // 0! = 1
            fatorial = 1;
        }

        /*
        Esta saída concatena todos os dados que foram construídos para apresentar o
        resultado do fatorial, bem como a fórmula que levou até ele.
         */
        System.out.println(N + "! = " + expressao + " = " + fatorial);

        sc.close();
    }
}
