package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._B_loop_doWhile;

import java.util.Scanner;

public class A_loop_doWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        /*
        O do-while é semelhante ao while, com a diferença de que a condiçãoé verificada
        somente ao final do bloco. Isso garante que o conteúdodo bloco será executado ao
        menos uma vez. Muito útil em menus ouprogramas onde o usuário decide quando
        finalizar ou repetir.
         */
        do {
            /*
            O programa inicia executando o conteúdo do bloco (que nesse neste exemplo
            é um menu de inicialização.
             */
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Ajuda");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            /*
            Para tornar mais didátio, temos um Switch Case (com sintax moderna) para
            dar navegabilidade às escolhas do menu e direciona o usuário às demais
            possibilidade no programa.
             */
            switch (opcao) {
                case 1: System.out.println("Iniciando..."); break;
                case 2: System.out.println("Ajuda: escolha 1 ou 0."); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida.");
            }
        /*
        Por fim, o principal a condicional que controla a saída do programa ou o reinício
        do programa (repetição do conteúdo do bloco.
         */
        } while (opcao != 0); //Assim que o usuário digitar "0" o programa se encerra,
        // caso contrário ficará repetindo enquanto houver interação.

        sc.close();
    }
}
