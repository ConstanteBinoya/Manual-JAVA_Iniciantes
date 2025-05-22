package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._A_loop_While.exercicios_while;

import java.util.Scanner;

public class Exe1_while {
    public static void main(String[] args) {

        // ORIGEM:
        // src/docs/apoio/listaExercicios/04-estrutura-while.pdf
        /*
         * 1) Escreva um programa que repita a leitura de uma senha até que ela seja válida.
         * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
         * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e
         * o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha de acesso: ");
        String senha = sc.next();

        /*
         * OBS: Em Java, != e == compara referências de objetos, não o conteúdo das strings.
         * Ou seja, ele verifica se as variáveis apontam para o mesmo lugar na memória, não se os textos são iguais.
         *
         * Solução: Use o método .equals() para comparar o conteúdo das strings:
         */
        while (!senha.equals("2002")) {
            System.out.println("Senha Inválida");
            System.out.println("Digite sua senha de acesso: ");
            senha = sc.next();
        }
        System.out.println("Acesso Permitido!");

        sc.close();
    }
}
