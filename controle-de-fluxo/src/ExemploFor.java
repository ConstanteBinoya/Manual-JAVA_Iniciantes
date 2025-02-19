public class ExemploFor {
    public static void main(String[] args) {

        // O "for" é uma estrutura de repetição (loop) usada para executar um bloco de
        // código várias vezes, enquanto uma condição for verdadeira.

        // for (inicialização; condição; incremento/decremento) {
        // Bloco de código a ser repetido (saída, calculo...)
        // }

        // COMPONENTES DO FOR - O for possui três partes principais dentro dos
        // parênteses ():

        // 1)INICIALIZAÇÃO:
        /*
         * Executada apenas uma vez antes da primeira iteração do loop.
         * Declara e inicializa a variável de controle.
         * Exemplo: int i = 0; (Começa com i valendo 0).
         */

        // 2) CONDIÇÃO:
        /*
         * Avaliada antes de cada iteração.
         * Se for "true", o bloco de código é executado.
         * Se for "false", o loop é encerrado.
         * Exemplo: i < 5; (Enquanto i for menor que 5, continue).
         */
        
        // 3) INCREMENT/DECREMENTO:
        /*
         * Executado após cada iteração.
         * Geralmente usado para modificar a variável de controle.
         * Exemplo: i++ (Incrementa i em 1 a cada repetição).
         */

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
        System.out.println("Joãozinho domiu!");
    }

}
