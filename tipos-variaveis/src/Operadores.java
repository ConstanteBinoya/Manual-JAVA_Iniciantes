public class Operadores {

    public static void main(String[] args) {

        // CONCATENAÇÃO:
        // Gramaticalmente, concatenar significa juntar, ligar, unir...
        // Em Lógica de Programação o sentido é o mesmo, mas a aplicação precisa de
        // atenção, pois utiliza-se a concatenação, prioritariamente, para unir duas
        // Strings, entretanto o conceito pode ser aplicado para além das Strings.
        // Observe os exelplos:

        /*
         * String concatenacao = "?";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + 1 + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + (1 + 1 + 1);
         * System.out.println(concatenacao);
         */

        // OPERADORES UNÁRIOS:
        /*
         * Um operador unário é um operador que atua sobre apenas um operando. Diferente
         * dos operadores binários (que operam sobre dois operandos), os operadores
         * unários modificam um único valor.
         */

        // + Mantém positivo (não tem efeito prático)
        // - Torna negativo
        // ++x Pré-incremento (Primeiro incrementa, depois usa).
        // x++ Pós-incremento (Primeiro usa, depois incrementa).
        // --x Pré-decremento
        // x-- Pós-decremento
        // ! Inverte um valor booleano
        // ~ Inverte os bits de um número inteiro

        /*
         * int numero = 5; // Binário: 00000101
         * numero = -numero;
         * System.out.println(numero);
         */

        /*
         * System.out.println(++numero);
         * System.out.println(numero++);
         * System.out.println(numero);
         */

        /*
         * int resultado = ~numero; // Inverte os bits
         * System.out.println(resultado); // Saída: -6 (depende da representação de
         * bits)
         */

        // OPERADO TERNÁRIO:
        /*
         * O operador ternário é uma forma concisa de escrever
         * (ABREVIAÇÃO) uma estrutura if-else simples. Ele usa três operandos e tem a
         * seguinte sintaxe:
         */
        // condição ? valor_se_verdadeiro : valor_se_falso;

        /*
         * Se a condição for verdadeira, o primeiro valor é retornado. Caso contrário, o
         * segundo valor será retornado.
         */

        /*
         * Exemplo:
         * int a, b;
         * 
         * a = 5;
         * b = 6;
         * 
         * //Uma estrutura condicional IF/ELSE padrão:
         * String resultado = "";
         * 
         * if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         * 
         * //Convertida para Ternário:
         * String resultado = a == b ? "verdadeiro" : "falso";
         * int resultado2 = a == b ? 1 : 0;
         * 
         * System.out.println(resultado + " e " + resultado2);
         */

        // OPERADORES RELACIONAIS:
        /*
         * Os operadores relacionais em Java são utilizados para comparar dois valores e
         * retornam um resultado booleano (true ou false). Eles são muito utilizados em
         * estruturas condicionais, como if e while.
         * 
         * Operador   Descrição        Exemplo   Resultado
         * ==          Igual a         5 == 5      true
         * !=       Diferente de       5 != 3      true
         * >          Maior que        10 > 3      true
         * <          Menor que        10 < 3      false
         * >=      Maior ou igual a    10 >= 10    true
         * <=      Menor ou igual a    5 <= 2      false
         */
        /*
         * int a = 10, b = 5;
         * 
         * System.out.println(a == b); // false
         * System.out.println(a != b); // true
         * System.out.println(a > b); // true
         * System.out.println(a < b); // false
         * System.out.println(a >= 10); // true
         * System.out.println(b <= 2); // false
         */

        // Atenção: Comparando Strings!
        /*
         * Para comparar valores numéricos, usamos ==.
         * Mas para comparar Strings, usamos .equals()!
         */

        /*
         * String nome1 = "Java";
         * String nome2 = "Java";
         * 
         * System.out.println(nome1 == nome2); // Funciona, mas não recomendado!
         * System.out.println(nome1.equals(nome2)); // Correto! true
         */

        // OPERADORES LÓGICOS:
        /*
         * Os operadores lógicos são usados para combinar ou inverter expressões
         * booleanas (true ou false). São muito utilizados em estruturas condicionais
         * (if, while, for) para tomar decisões mais complexas.
         */

         // Operador       Nome                                 Descrição 
         //   &&       E lógico (AND)      Retorna true se ambas as condições forem verdadeiras
         //  `         OU lógico (OR)       Retorna true se pelo menos uma das condições for verdadeira
         //   !       NÃO lógico (NOT)     Inverte o valor da expressão booleana 
    }

}
