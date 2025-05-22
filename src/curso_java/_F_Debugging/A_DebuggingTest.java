package curso_java._F_Debugging;

import java.util.Scanner;

public class A_DebuggingTest {

	public static void main(String[] args) {
		
		// 🔴 1° Breakpoint: Começo do programa
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nome = scanner.nextLine(); // Inspecione a entrada do usuário

		System.out.print("Digite a 1ª nota: ");
		double nota1 = scanner.nextDouble();

		System.out.print("Digite a 2ª nota: ");
		double nota2 = scanner.nextDouble();

		// 🔴 2° Breakpoint: Antes do cálculo da média
		double media = calcularMedia(nota1, nota2);

		// 🔴 3° Breakpoint: Antes da verificação de aprovação
		String resultado = verificarAprovacao(media);

		// 🔴 4° Breakpoint: Antes da saída do resultado
		System.out.println(nome + " obteve média " + media + " e está " + resultado);

		scanner.close();
	}

	// Método que calcula a média das notas
	public static double calcularMedia(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}

	// Método que define o status do aluno
	public static String verificarAprovacao(double media) {
		// 🔴 5° Breakpoint: Dentro do switch-case
		String status;
		switch ((int) media) {
		case 10:
		case 9:
		case 8:
		case 7:
			status = "APROVADO";
			break;
		case 6:
		case 5:
			status = "RECUPERAÇÃO";
			break;
		default:
			status = "REPROVADO";
		}
		return status;

	}

}
