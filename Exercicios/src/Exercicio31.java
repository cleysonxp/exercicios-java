//Programa que pede um ano e informa se ele é um ano bissexto ou não.
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o ano: ");
		int ano = scan.nextInt();

		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(ano + " é um ano bisseto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}

	}

}
