package comando;

import java.util.Scanner;

public class ComandoWhile {

	public void menu() {
		Scanner in = new Scanner(System.in);
		System.out.println("digite sua opção");
		int op = in.nextInt();
		do {

			switch (op) {
			case 1:
				System.out.println("Opção 1");
				break;
			case 2:
				System.out.println("Opção 2");
				break;
			default:
				System.out.println("Não Essa Opção");
				break;
			}

			System.out.println("digite sua opção");
			op = in.nextInt();
		} while (op != 0);
		
		System.out.println("Programa Finalizado");
	}
}
