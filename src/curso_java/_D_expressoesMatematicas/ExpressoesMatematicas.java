package curso_java._D_expressoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class ExpressoesMatematicas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y, z, A, B, C;		
		
		System.out.println("Digite um número positivo com ponto flutuante [Ex.: 3.0]: ");
		y = sc.nextDouble();
		System.out.println("Digite um número negativo com ponto flutuante [Ex.: -4.0]: ");
		z = sc.nextDouble();
		
		x = y + z;

		A = Math.sqrt(z);
		B = Math.sqrt(y);
		C = Math.sqrt(x);
		System.out.println("Raiz quadrada de " + z + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + x + " = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(z, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println(z + " elevado ao quadrado = " + C);

		A = Math.abs(y);
		B = Math.abs(z);
		C = Math.abs(z-x);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		System.out.println("Valor absoluto de " + z + "-" + y + " = " + C);
		
		sc.close();
	}
}
