package curso_java._G_controleDeFluxo._A_estruturaCondicional._B_SwitchCase;

import java.util.Scanner;

public class B_SwitchCase_Entrada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		String dia;
		
		System.out.println("====================================");
		System.out.println("=====     SELETOR DE FOLGA     =====");
		System.out.println("====================================");
		System.out.println();
		
		System.out.println("Escolha qual dia que deseja folgar: \n Domingo [1];\n segunda [2];\n terça   [3];\n quarta  [4];\n quinta  [5];\n sexta   [6]; ou\n sábado  [7].");
		int x = sc.nextInt();
		System.out.println();
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}

		System.out.println("====================================");
		System.out.println("Sua folga será no(a): " + dia);
		System.out.println("====================================");

		sc.close();

	}

}
