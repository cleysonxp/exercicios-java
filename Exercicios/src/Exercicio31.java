//Programa que pede um ano e informa se ele � um ano bissexto ou n�o.
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o ano: ");
		int ano = scan.nextInt();

		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(ano + " � um ano bisseto.");
		} else {
			System.out.println(ano + " n�o � um ano bissexto.");
		}

	}

}
