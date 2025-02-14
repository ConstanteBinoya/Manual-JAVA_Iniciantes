public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 3500;

        // Exemplo de a IA da IDE adverte sobre o possível mal funcionamento por
        // escolher tipos primitivos não adequados ao valor
        // Aplicado o conceito de CAST, forma de ignorar a advertência da IDE ("estou
        // ciente que pode dar merda")
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Aplicando a propriedade mutante de uma variável:
        // Mesmo atribuindo inicialmente um valor no ato da declaração de uma variável,
        // é possivel altera este valos
        // no decorrer do código.
        int numero = 5;
        numero = 2;

        System.out.println(numero);

        // Por outro lado, uma variável pode ter comportamento imutável, valor fixo ao
        // da origem... Pode ser uma CONSTANTE:
        // Basta que no momento da sua declaração seja adicionado o temo "final" antes
        // do tipo e o NOME deve ser em caixa alta.
        final int NUMERO = 5;
        NUMERO = 2;
        // Perceba que a constante NUMERO foi declarada de forma a ser imutável, e mesmo
        // quando se tenta reatribuir o seu valos o sistema aponta um erro.

        System.out.println(NUMERO);

    }
}
