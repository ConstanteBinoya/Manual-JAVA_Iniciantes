package curso_java._G_controleDeFluxo._A_estruturaCondicional._B_SwitchCase;

import java.util.Scanner;

public class A_condicionalSwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o melhor dia da semana para sua folga?");
        System.out.println("Escolha:\n" +
                "1 [Domingo]\n" +
                "2 [Segunda]\n" +
                "3 [terça]\n" +
                "4 [Quarta]\n" +
                "5 [Quinta]\n" +
                "6 [Sexta]\n" +
                "7 [Sábado]");
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();

    }
}
