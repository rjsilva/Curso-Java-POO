package comando;

import java.util.Scanner;

public class ComandoWhile {

	public void menu() {
		Scanner in = new Scanner(System.in);
		System.out.println("digite sua op��o");
		int op = in.nextInt();
		do {

			switch (op) {
			case 1:
				System.out.println("Op��o 1");
				break;
			case 2:
				System.out.println("Op��o 2");
				break;
			default:
				System.out.println("N�o Essa Op��o");
				break;
			}

			System.out.println("digite sua op��o");
			op = in.nextInt();
		} while (op != 0);
		
		System.out.println("Programa Finalizado");
	}
}
