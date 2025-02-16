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
        // Um operador unário é um operador que atua sobre apenas um operando. Diferente
        // dos operadores binários (que operam sobre dois operandos), os operadores
        // unários modificam um único valor.

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

        /*
         * OPERADO TERNÁRIO: O operador ternário é uma forma concisa de escrever
         * (ABREVIAÇÃO) uma
         * estrutura if-else simples. Ele usa três operandos e tem a seguinte sintaxe:
         * 
         * condição ? valor_se_verdadeiro : valor_se_falso;
         * 
         * Se a condição for verdadeira, o primeiro valor é retornado. Caso contrário, o
         * segundo valor será retornado.
         */

        /*Exemplo:
        int a, b;
        
        a = 5;
        b = 6;

        //Uma estrutura condicional IF/ELSE padrão:
        String resultado = "";

        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        //Convertida para Ternário:
        String resultado = a == b ? "verdadeiro" : "falso";
        int resultado2 = a == b ? 1 : 0;

        System.out.println(resultado + " e " + resultado2);*/

        /*OPERADORES RELACIONAIS:
         * 
         */
    }

}
