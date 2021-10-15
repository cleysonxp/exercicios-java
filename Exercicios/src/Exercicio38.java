//Programa que pede um n�mero e at� que o usu�rio informe um n�mero entre 0 � 10 ele vai pedir um n�mero novamente.
import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean numValido = false;

		do {
			System.out.print("Infome um n�mero: ");
			int num = scan.nextInt();

			if (num >= 0 && num <= 10) {
				numValido = true;
				System.out.println("Voc� diggitou o n�mero: " + num);
			} else {
				System.out.print("Voc� sigitou o n�mero errado, digite novamente: ");
			}
		} while (!numValido);

	}

}
