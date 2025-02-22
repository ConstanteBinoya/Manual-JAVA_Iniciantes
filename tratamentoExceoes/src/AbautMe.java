import java.util.Locale; //O Locale é uma classe do pacote java.util 
                         //que representa uma localidade específica (como idioma e região). 
                         //O seu código usa Locale.US, que configura o Scanner para entender o formato numérico dos Estados Unidos, 
                         //como o ponto (.) para separar decimais. 

                         //O que faz?
                         //Usamos useLocale(Locale.US) no Scanner, isso significa que estamos configurando o scanner 
                         //para aceitar entradas com formato numérico dos EUA. Exemplo: 1.75 como 1 unidade e 75 centésimos 
                         //(número de ponto flutuante).

import java.util.Scanner; //O Scanner é uma classe do pacote java.util usada para ler a entrada do usuário no console. 
                          //Sem importar o Scanner, você não poderia usar essa funcionalidade no código.

                          //O que faz?
                          //O Scanner é utilizado para capturar o que o usuário digita no console. 
                          //Você utiliza esse objeto para ler textos (next()), inteiros (nextInt()) e 
                          //números de ponto flutuante (nextDouble()), entre outros.

import java.util.InputMismatchException; //A exceção InputMismatchException faz parte da biblioteca java.util 
                                         //e é necessária para capturar quando o usuário insere um valor de tipo incorreto. 
                                         //No seu código, isso é usado para garantir que o usuário insira números 
                                         //ao invés de texto para os campos de "idade" e "altura".

public class AbautMe {
    public static void main(String[] args) {

        try {
            // Criando o Objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            Double altura = scanner.nextDouble();

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "m.");
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Os campos: idade e altura precisão ser numéricos");

        }
    }
}