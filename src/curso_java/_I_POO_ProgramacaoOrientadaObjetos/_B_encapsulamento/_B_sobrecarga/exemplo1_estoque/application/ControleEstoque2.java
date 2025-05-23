package curso_java._I_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._B_sobrecarga.exemplo1_estoque.application;

import curso_java._I_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._B_sobrecarga.exemplo1_estoque.entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class ControleEstoque2 {
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

        System.out.println("Insira os dados do Produto: ");

        System.out.println("Nome: ");
        String name = sc.nextLine();

        System.out.println("Preço: ");
        Double price = sc.nextDouble();

        System.out.println("Quantidade: ");
        int initialQuantity = sc.nextInt();

        /*
        Com a inserção do construtor na classe "Product1", é exigido que o usuário defina
        os dados iniciais para o objeto (Nome, Quantidade e Preço). Só então é instanciado
        o objeto referente à clase
         */
        Product2 product1 = new Product2(name, price, initialQuantity);

        System.out.println();
        System.out.println("Dados do Produto " + product1);

        System.out.println();
        System.out.println("Insira a quantidade de produtos a serem adicionados ao estoque: ");
        int addedQuantity = sc.nextInt();
        product1.addProducts(addedQuantity);

        System.out.println();
        System.out.println("Dados atualizados " + product1);

        System.out.println();
        System.out.println("Insira a quantidade de produtos a serem removidos do estoque: ");
        int removeQuantity = sc.nextInt();
        product1.removeProducts(removeQuantity);

        System.out.println();
        System.out.println("Dados atualizados " + product1);

        sc.close();
    }
}
