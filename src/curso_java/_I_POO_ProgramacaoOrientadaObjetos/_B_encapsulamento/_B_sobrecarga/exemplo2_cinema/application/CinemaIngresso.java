package curso_java._I_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._B_sobrecarga.exemplo2_cinema.application;

import curso_java._I_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._B_sobrecarga.exemplo2_cinema.entities.Ingresso;

import java.util.Locale;
import java.util.Scanner;

public class CinemaIngresso {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("===  CBV - CINEMA  ===");
        System.out.println("===    R$ 20.00    ===");
        System.out.println("======================");
        System.out.println();

        System.out.println("Digite o nome do filme: ");
        String nomeFilme = sc.next();

        System.out.println("Digite o horário: ");
        String horario = sc.next();

        // Intanciar o objeto "ingresso" com nome e horário:
        Ingresso ingresso = new Ingresso(nomeFilme, horario);

        int opcao;

        do {
            System.out.println();
            System.out.println("Qual será a forma de pagamento?");
            System.out.println("1 - Dinheiro");
            System.out.println("2 - Cartão");
            System.out.println("3 - Pix");
            System.out.println("0 - Sair");
            System.out.print("Escolha (1/2/3/0): ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor pago: R$");
                    double valorPago = sc.nextDouble();

                /*
                 Informa que na classe "Ingresso", o método "comprar" receberá o
                 parâmetro "valorPago"
                 */
                    ingresso.comprar(valorPago);
                    break;

                case 2:
                    System.out.println("Número do Cartão: ");
                    String numeroCartao = sc.next();

                    System.out.println("Nome do titular: ");
                    String titularCartao = sc.nextLine();
                    sc.nextLine();

                    System.out.println("CVV: ");
                    String cvv = sc.nextLine();

                /*
                 Informa que na classe "Ingresso", o método "comprar" receberá os
                 parâmetros "numeroCartao", "titularCartao" e "cvv"
                 */
                    ingresso.comprar(numeroCartao, titularCartao, cvv);
                    break;

                case 3:
                    System.out.print("Titular do Pix: ");
                    String titularPix = sc.nextLine();

                    System.out.print("Chave Pix: ");
                    String chavePix = sc.nextLine();

                /*
                 Informa que na classe "Ingresso", o método "comprar" receberá os
                 parâmetros "titularPix" e "chavePix"
                 */
                    ingresso.comprar(titularPix, chavePix);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.out.println("Até a próxima.");
                    break;

                default:
                    System.out.println("Opção Inválida Compra cancelada!");
            }
        } while (opcao != 0);
        sc.close();
    }
}
