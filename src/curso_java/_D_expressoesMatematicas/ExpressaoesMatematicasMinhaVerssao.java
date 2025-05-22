package curso_java._D_expressoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class ExpressaoesMatematicasMinhaVerssao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // O Locale DEVE ser posicionado ANTES do Scanner
		Scanner sc = new Scanner(System.in);
		
    // Existem diversas funções matemáticas em java, Maiores informações: java.lang.Math
		
		double A, B, C;
		
		System.out.println("Digite um número positivo com ponto flutuante [Ex.: 3.0]: ");
		double x = sc.nextDouble();
		System.out.println();
		System.out.println("Digite mais um número positivo com ponto flutuante [Ex.: 4.0]: ");
		double y = sc.nextDouble();
		System.out.println();
		System.out.println("Digite um número negativo com ponto flutuante [Ex.: -5.0]: ");
		double z = sc.nextDouble();
		System.out.println();
		
		sc.close();
		
		System.out.println("============================================");
		System.out.println("Os valores digitados foram: " + x + ", " + y + " e " + z);
		System.out.println("============================================");

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(x + y);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println();
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println();
		System.out.println("Raiz quadrada de " + x + " + " + y + " = " + C);
		System.out.println();

		A = Math.pow(x, y);
		B = Math.pow(y, x);
		C = Math.pow(x + y, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println();
		System.out.println(y + " elevado a " + x + " = " + B);
		System.out.println();
		System.out.println(x + " + " + y + " elevado ao quadrado = " + C);
		System.out.println();

		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println();
		System.out.println("Valor absoluto de " + z + " = " + B);
		System.out.println();

	}

}
