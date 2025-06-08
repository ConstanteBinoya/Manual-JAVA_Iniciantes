package curso_java._I_POO_Introducao_parte1._A_classe_objeto._A_exemplo_triangulo._B_exemplo_estoque.application;

import curso_java._I_POO_Introducao_parte1._A_classe_objeto._A_exemplo_triangulo._B_exemplo_estoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {

        /*
         * PROJETO: Gestão de Estoque de Produto
         *
         * OBJETIVO:
         * Criar um programa para ler os dados de um produto em estoque
         * (nome, preço e quantidade). Em seguida:
         *   - Mostrar os dados do produto (nome, preço, quantidade no estoque e valor
         *     total no estoque)
         *   - Realizar uma entrada no estoque e mostrar novamente os dados do produto
         *   - Realizar uma saída no estoque e mostrar novamente os dados do produto
         *
         * ESTRUTURA SUGERIDA:
         * Criar uma classe "Product" com os seguintes membros:
         *
         *  ______________________________________
         * |                Product               |
         * |--------------------------------------|
         * | - name     : String                  |
         * | - price    : double                  |
         * | - quantity : int                     |
         * |--------------------------------------|
         * | + TotalValueInStock()     : double   |
         * | + AddProducts(quantity)   : void     |
         * | + RemoveProducts(quantity): void     |
         * |______________________________________|
         *
         * OBSERVAÇÃO:
         * O programa deve utilizar conceitos de Programação Orientada a Objetos,
         * como encapsulamento e organização das responsabilidades em métodos da classe.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Insira os dados do Produto: ");

        System.out.println("Nome: ");
        product.name = sc.nextLine();

        System.out.println("Preço: ");
        product.price = sc.nextDouble();

        System.out.println("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Dados do Produto" + product);

        System.out.println();
        System.out.println("Insira a quantidade de produtos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados" + product);

        System.out.println();
        System.out.println("Insira a quantidade de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados" + product);

        sc.close();
    }
}
