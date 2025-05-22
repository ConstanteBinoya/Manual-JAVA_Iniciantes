package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._A_loop_While.exercicios_while;

import java.util.Scanner;

public class Exe3_while {

    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-while.pdf
        /*
         * 3) Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
         * Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
         * 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
         * deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
         * código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes
         * que abasteceram cada tipo de combustível, conforme exemplo.
         */

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Qual sua preferência de combustível: ");
        System.out.println(" Álcool [1]\n Gasolina [2]\n Diesel [3]\n Fim [4]");
        int fuel = sc.nextInt();

        while (fuel != 4) {
            // Resolução com if-else encadeado:
            /*
            if (fuel == 1) {
                alcool = alcool + 1;
                System.out.println("ÁLCOOL");
            }
            else if (fuel == 2) {
                gasolina = gasolina + 1;
                System.out.println("GASOLINA");
            }
            else if (fuel == 3) {
                diesel = diesel + 1;
                System.out.println("DIESEL");
            }
            else {
                System.out.println("Opção inválida! tente novamente. ");
            }
             */

            // Resolução com Switch Case:
            switch (fuel) {
                case 1:
                    alcool++;
                    System.out.println("ÁLCOOL.");
                    break;
                case 2:
                    gasolina++;
                    System.out.println("GASOLINA.");
                    break;
                case 3:
                    diesel++;
                    System.out.println("DIESEL.");
                    break;
                default:
                    System.out.println("Opção inválida! tente novamente. ");
            }

            // Menu fora do if/else, para evitar repetição desnecessária
            System.out.println(" Álcool [1]\n Gasolina [2]\n Diesel [3]\n Fim [4]");
            fuel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
