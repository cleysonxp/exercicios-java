//Programa que pede um número e até que o usuário informe um número entre 0 á 10 ele vai pedir um número novamente.
import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean numValido = false;

		do {
			System.out.print("Infome um número: ");
			int num = scan.nextInt();

			if (num >= 0 && num <= 10) {
				numValido = true;
				System.out.println("Você diggitou o número: " + num);
			} else {
				System.out.print("Você sigitou o número errado, digite novamente: ");
			}
		} while (!numValido);

	}

}
