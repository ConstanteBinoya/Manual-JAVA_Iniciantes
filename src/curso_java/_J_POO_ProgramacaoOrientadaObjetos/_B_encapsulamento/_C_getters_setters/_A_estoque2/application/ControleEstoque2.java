package curso_java._J_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._C_getters_setters._A_estoque2.application;

import curso_java._J_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._C_getters_setters._A_estoque2.entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class ControleEstoque2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do Produto: ");

        System.out.println("Nome: ");
        String name = sc.nextLine();

        System.out.println("Preço: ");
        double price = sc.nextDouble();

        System.out.println("Quantidade: ");
        int initialQuantity = sc.nextInt();

        /*
        Aqui criamos o objeto product2 passando os valores ao construtor. Neste ponto,
        os atributos ainda são preenchidos *internamente* (acesso direto dentro da
        própria classe)
         */
        Product2 product2 = new Product2(name, price, initialQuantity);

        System.out.println();
        System.out.println("Dados do Produto " + product2);
        /*
         Aqui, o método toString() é chamado, que acessa os atributos INTERNAMENTE,
         sem usar os getters.
         */

        System.out.println();
        System.out.println("Insira a quantidade de produtos a serem adicionados ao estoque: ");
        int addedQuantity = sc.nextInt();
        product2.addProducts(addedQuantity);
        /*
         Método que modifica um atributo (quantity) *sem* usar setter — é uma forma
         controlada dentro da classe
         */

        System.out.println();
        System.out.println("Dados atualizados " + product2);

        System.out.println();
        System.out.println("Insira a quantidade de produtos a serem removidos do estoque: ");
        int removeQuantity = sc.nextInt();
        product2.removeProducts(removeQuantity);
        /*
         Também manipula o atributo quantity de forma interna e segura (sem setter direto)
         */


        System.out.println();
        System.out.println("Dados atualizados " + product2);

        // Exemplo de uso explícito dos getters:
        System.out.println();
        System.out.println("\n Acesso direto aos dados através de getters:");
        System.out.println("Nome do produto: " + product2.getName());
        System.out.println("Preço unitário: $" + product2.getPrice());
        System.out.println("Quantidade em estoque: " + product2.getQuantity());

        /*
         Exemplo de alteração com setters (poderia ser inserido com if/validação no
         sistema real):
         */
        product2.setName("Produto Atualizado");
        product2.setPrice(99.90);
        System.out.println("\n Produto atualizado manualmente com setters:");
        System.out.println("Dados atualizados: " + product2);

        sc.close();
    }
}
