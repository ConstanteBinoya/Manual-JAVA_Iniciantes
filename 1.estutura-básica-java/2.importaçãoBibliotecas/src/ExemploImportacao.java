import java.util.ArrayList;
import java.util.Scanner;

public class ExemploImportacao {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        System.out.println(lista);

        Scanner scanner = new Scanner(System.in); // Usando a classe Scanner

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Olá, " + nome + "!");
    }
}
