package curso_java._A_saidaDeDados;

import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);  // Garante que o padão decimal será o dos EUA

        String nome = "Constante";
        int y = 32;
        int idade = 36;
        double x = 10.35784;
        double renda = 4000.0;

        System.out.println(y);
        System.out.println(x);

        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);
        //.printf() significa que vc vai formatar a saída;
		/*
		  "%.x" serve para selecionar quantas casa decimais virão após
		  o ponto flutuante. Troque o "x" pela quantidade desejada;
		*/

        /*
          %n significa quebra de linha: como o "print" não tem mais o "ln"
          a proxima saída ficaria colada na anterior, o "\n" substitui o "ln"
          em saídas de double formatado.
        */

        /*
          Outro elemento essencial para saídas de double com casa decimais
          formatadas é a "," que ligará a personalização à variável double.
          è um tipo de concatenação.
        */

        System.out.printf("RESULTADO = %.4f\n", x);

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        /*
          %f = Ponto Flutuante (double);
          %d = Inteiro;
          %s = String;
          %n = Quebra de linha.
        */

        System.out.println("Olá mundo!");

    }

}
