package curso_java._K_wrapper_types._A_boxing_unboxing._A_listas._B_exercicio_listas._B_exercicio2_controleEstoque.application;

import curso_java._K_wrapper_types._A_boxing_unboxing._A_listas._B_exercicio_listas._B_exercicio2_controleEstoque.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadastrarProduto {
    public static void main(String[] args) {

        /**
         * DESAFIO - CONTROLE DE ESTOQUE SIMPLES:
         *
         * Crie um programa que:
         *  1) Peça ao usuário quantos produtos deseja cadastrar;
         *
         *  2) Para cada produto, leia:
         *      i) Código do produto (inteiro);
         *     ii) Nome; e
         *    iii) Quantidade em estoque (inteiro).
         *
         *  3) Armazene os produtos em uma lista;
         *
         *  4) Após o cadastro, peça ao usuário que informe:
         *      i) O código de um produto;
         *     ii) A quantidade a ser adicionada ao estoque.
         *
         *  5) Se o código existir, aumente a quantidade;
         *
         *  6) Imprima todos os produtos com suas quantidades usando for-each.;
         *
         *  7) Faça uma segunda impressão usando for tradicional e índice mostrando:
         *      i) Posição do produto na lista (índice + 1);
         *     ii) Nome; e
         *     iii) Quantidade.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos serão cadastrados agora?");
        int N = sc.nextInt();

        List<Produto> produtos = new ArrayList<>();

        // Populando a lista:
        System.out.println("\nEfetue o cadastro de " + N + " produtos: ");
        for (int i = 0; i < N; i++) {
            System.out.println("\nDados do " + (i + 1) + "º produto:");

            System.out.println("Código: ");
            int codigo = sc.nextInt();
            sc.nextLine();

            // Verificador de Código duplidado:
            boolean codExiste = produtos.stream().anyMatch(f -> f.getCodigo() == codigo);

            if (codExiste) {
                System.out.println("Código já existe! Tente novamente.");
                i--; // refaz essa iteração
                continue;
            }

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();

            /*
            “Instancie um novo Produto com os parâmetros informados e insira
            esse objeto na próxima posição da lista produtos.”
             */
            produtos.add(new Produto(codigo, nome, quantidade));
        }

        // Interação para decidir se adiciona mais produtos a lista:
        char adicionar;
        do {
            System.out.println("\nDeseja adicionar mais produtos [S ou N]?");
            adicionar = Character.toUpperCase(sc.next().charAt(0));

            if (adicionar == 'S') {
                System.out.println("\nDigite o código do produto: ");
                int codBusca = sc.nextInt();

                // Localizador de código:
                Produto prod = produtos.stream()
                        .filter(p -> p.getCodigo().equals(codBusca))
                        .findFirst()
                        .orElse(null);

                // Tentativa de inserir mais unidades aprodutos já cadastrados à lista
                if (prod != null) {
                    System.out.println("\nDigite quantas unidades deseja adicionar: ");
                    int addQuantidade = sc.nextInt();

                    prod.setQuantidade(prod.getQuantidade() + addQuantidade);

                    System.out.println("\nAtualizado: " + prod.getNome() +
                            " | Quantidade em Estoque: " + prod.getQuantidade());
                }
                else {
                    System.out.println("\nCódigo não existe!");
                }
            }

        } while (adicionar == 'S');

        System.out.println("\nBALANÇO GERAL:");
        System.out.println("Produtos em Estoque: ");
        for (Produto prod : produtos) {
            System.out.println(prod);
        }

        System.out.println("\nPosição dos Produtos em Estoque: ");
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.println((i + 1) + " - " + p.getNome() + ": " + p.getQuantidade());
        }

        sc.close();
    }
}
