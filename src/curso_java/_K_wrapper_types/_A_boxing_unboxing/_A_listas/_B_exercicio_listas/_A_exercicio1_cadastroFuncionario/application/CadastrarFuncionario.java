package curso_java._K_wrapper_types._A_boxing_unboxing._A_listas._B_exercicio_listas._A_exercicio1_cadastroFuncionario.application;

import curso_java._K_wrapper_types._A_boxing_unboxing._A_listas._B_exercicio_listas._A_exercicio1_cadastroFuncionario.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadastrarFuncionario {
    public static void main(String[] args) {

        /**
         * "Fazer um programa para ler um número inteiro N e depois os dados
         * (id, nome e salário) de N funcionários. Não deve haver repetição de id.
         *
         * Em seguida, efetuar o aumento de X por cento no salário de um determinado
         * funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado
         * não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a
         * listagem atualizada dos funcionários, conforme exemplos.
         *
         * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário
         * possa ser mudado livremente. Um salário só pode ser aumentado com base em uma
         * operação de aumento por porcentagem dada."
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários deseja registrar? ");
        int N = sc.nextInt();

        // Instanciar a lista: List<Tipo> nomeDaLista = new ArrayList<>();
        /*
        Diferente de array os elementos das extremidades são diferentes:
        List<>(IMPLEMENTADORdEiNTERFACE) ... ArrayList<>(IMPLEMENTADORdEiNTERFACE)

        Isso ocorre devido ao fato das Listas terem alguns pontos de flexibilidade
        em relação aos arrays. Essa flexibilidade se dá ao fato de poder alterar o
        implementador de interface na extremidade direita sem a necessidade de
        fazê-lo a esquerda ( arrayList<>; linkedKist<>...).

        De resto, a estrutura das listas se assemelham às dos arrays:
        ... <TipoDoObjeto> nomeDoObjeto = new ...
         */
        List<Funcionario> funcionarios = new ArrayList<>();

        // POPULANDO A LISTA COM OS DADOS PARA O CADASTRO:
        System.out.println("Efetue o cadastro de " + N + " funcionários: ");

        // Em lista o equivalente a .length é o .size()
        for (int i = 0; i < N; i++) {
            System.out.println("\nFuncionário(a) #" + (i + 1));

            /*
            Neste exercício o ID é inserido manualmente pelo usuário, mas em
            aplicações reais seria mais seguro e usual utilizar um gerador automático,
            como UUID, AtomicInteger, ou Random, para garantir unicidade.”
             */
            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Limpa buffer para o .nextLine()

            // VERIFICAR SE O ID JÁ EXISTE:
            /*
             OBS: esta verificação só existe para aprofundar didaticamente o conteúdo,
             em outras palavras, num contexto real e comercial de programação não é
             necessária, pois o ID seria gerado automáticamente com o auxilio do
             Random. Entretanto, como o ID foi gerado manualmente pelo usuário, existe
             a probabilidade de que seja repetido um ID ja utilizado anteriormente.
             */
            /*
            boolean idExiste = "retorne verdadeiro ou falso sobre a seguinte condição"

            funcionarios.stream() = "analise sequencialmente a lista funcionarios sobre
            os seguintes requisitos..."

            .anyMatch() = é um método terminal da API de Streams do Java.
            Sua função principal é:
                  "Verificar se algum elemento do stream satisfaz uma condição lógica."
            Basicamente ele quer dizer:
                  "Verifique se algum elemento do fluxo atende à seguinte condição..."

            (f -> f.getId() == id) = sentença lógica condicional.
                 'f'  é um apelido temporário para cada elemento (objeto Funcionario)
                 do stream durante a iteração. É comum usar letras como f, x, p, etc.,
                 mas pode ser qualquer nome válido.

                 -> Esse é o operador lambda, que pode ser lido como:
                         "tal que" ou "cujo" ou "para o qual vale".

                 f.getId() você está acessando o atributo id do objeto Funcionario
                 referenciado por f.

                 == id  esse é o id digitado pelo usuário no main, e está sendo
                 comparado com o id do objeto f.

             Resumindo:
                   (f -> f.getId() == id)
                        "Para cada f (funcionário da lista), verifique se o id do f é
                        igual ao id digitado pelo usuário."
             */
            boolean idExiste = funcionarios.stream().anyMatch(f -> f.getId() == id);
            if (idExiste) {
                System.out.println("ID já existe! Tente novamente.");
                i--; // refaz essa iteração
                     /*
                     O que exatamente i-- faz nesse trecho:
                          Se o ID digitado já existe, não avance para o próximo
                          funcionário, pois essa iteração não produziu um cadastro
                          válido.
                     Exerce a função de um do-while aninhado.
                     (menos código, mesmo resultado)
                      */
                continue; /*
                           Pula tudo abaixo e volta para o próximo ciclo do for:
                           Isso torna o código mais claro e direto, pois evita a
                           necessidade de um 'else' envolvendo todo o restante da iteração.
                           */
            }

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Salário: ");
            double salario = sc.nextDouble();

            // Instanciando (criando) um novo objeto da classe Funcionario:
            /*
            “Adicione ao final da lista funcionarios um novo objeto Funcionario
            criado com os dados informados: id, nome e salario.”
            ou
            “Instancie um novo Funcionario com os parâmetros informados e insira
            esse objeto na próxima posição da lista funcionarios.”
             */
            funcionarios.add(new Funcionario(id, nome, salario));
        }

        // AUMENTO DO SALÁRIO:
        System.out.println("\nInforme o ID do(a) funcionário(a) que terá aumento: ");
        int idAumento = sc.nextInt();

        // DECLARAÇÃO E ATRIBUIÇÃO DE UMA VARIÁVEL COMPOSTA:
        /*
        O que ele é tecnicamente:
             "Uma única instrução composta que declara uma variável (func), executa
             um fluxo de dados sobre uma lista (funcionarios) e aplica métodos
             encadeados para:
                  1) "Filtrar elementos por uma condição (f.getId() == idAumento)";
                  2) "Encontrar o primeiro que satisfaça a condição (findFirst())";
                  3) "Garantir um valor válido ou nulo, caso não haja nenhum resultado
                      (orElse(null)).
         Em outras palavras, Você está usando encadeamento funcional para procurar
         (e capturar) um objeto específico dentro de uma lista, em uma única linha.

         Entenda linha por linha:
              funcionarios (abreviado para func): é sua lista de objetos Funcionario;

              .stream(): transforma a lista em um fluxo de dados (um "rio" por onde
              os objetos passarão para análise funcional):
                   Resultado: você pode aplicar métodos encadeados
                              (filter, map, forEach, etc.) sobre os dados da lista.

              .filter(...): é um método intermediário que "filtra" o stream;

              (f -> f.getId() == idAumento): expressão lambda, que diz:
                   "para cada funcionário f, mantenha no fluxo apenas aqueles cujo
                   id seja igual ao idAumento digitado pelo usuário."

                   Resultado: se tiverem 10 funcionários, mas só 1 com o ID buscado,
                   o stream vai continuar com apenas aquele funcionário no fluxo.
                   Se nenhum tiver, o fluxo fica vazio.

              .findFirst(): é um método terminal. Ele encerra o stream e retorna o
              primeiro elemento que passou no filtro, se houver:
                   Retorna um objeto do tipo Optional<Funcionario>, ou seja: um
                   "talvez tenha, talvez não tenha".

              .orElse(null): significa:
                   "Se o Optional tiver um funcionário (ou seja, se encontrou),
                   retorne-o. Caso contrário, retorne null."
                        Resultado final: se achou o funcionário com o ID informado,
                        ele é atribuído à variável func. Caso contrário, func será null.

              Em outra palavras:
                   "Crie uma variável func, do tipo Funcionario, e atribua a ela o
                   primeiro funcionário da lista cujo ID seja igual ao informado
                   pelo usuário. Se nenhum for encontrado, func receberá null."
         */
        Funcionario func = funcionarios.stream()
                .filter(f -> f.getId() == idAumento)
                .findFirst()
                .orElse(null);

        // ANÁLISE CONDICIONAL SOBRE A VARIÁVEL ACIMA: "Funcionario func =..."
        if (func != null) {
            System.out.println("Informe a porcentagem de aumento: ");
            double percentual = sc.nextDouble();
            func.aumentarSalario(percentual);
        } else {
            System.out.println("Este ID não existe!");
        }

        // RESULTADO DO CADASTRO: resgate através de "@Override.toString()"
        System.out.println("\nLista de funcionários: ");

        // Loop for-each que percorre toda a lista imprimindo todos os elementos dela:
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        sc.close();
    }
}
