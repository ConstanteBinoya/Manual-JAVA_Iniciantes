package curso_java._I_POO_Introducao_parte1._A_classe_objeto._A_exemplo_triangulo._D_menbrosStaticos._B_exemplo_dolar.application;

import curso_java._I_POO_Introducao_parte1._A_classe_objeto._A_exemplo_triangulo._D_menbrosStaticos._B_exemplo_dolar.util.Exchange;

import java.util.Locale;
import java.util.Scanner;

public class DollarExchange {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double cotacao = sc.nextDouble();

        System.out.println("Digite a quantidade de dólares que deseja comprar: ");
        double qtdDolar = sc.nextDouble();

        // Chamada do método cambio passando os argumentos corretos
        double valorFinal = Exchange.cambio(cotacao, qtdDolar);

        // Impressão do resultado com IOF aplicado
        System.out.println();
        System.out.printf("Com a taxa fixa de 6%% de IOF, US$%.2f terá um custo de R$%.2f%n", qtdDolar, valorFinal);

        sc.close();
    }
}
