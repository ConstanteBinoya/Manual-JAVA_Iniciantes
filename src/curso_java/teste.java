package curso_java;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> usuarios = new ArrayList<>();
            // TODO: Solicitar ao usuário a inserção de 3 registros iniciais (nome e idade).
           
            for (int i = 0; i < 3; i++) {
               //System.out.print("Digite o nome do usuário: ");
                String nome = scanner.nextLine(); 
                //System.out.print("Digite a idade do usuário: ");
                int idade = scanner.nextInt(); 
                scanner.nextLine(); 
    
                // Adiciona o nome à lista de usuários
                usuarios.add(nome);
            }
            
            scanner.close(); // Fecha o scanner após as leituras
            
            // TODO: Exibir a lista de usuários cadastrados, formatando a saída conforme o exemplo esperado.
            
            System.out.println("Banco de dados atualizado: " + String.join(", ", usuarios));
        }
    }
