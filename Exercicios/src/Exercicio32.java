//Programa que pede um n�mero e informa se esse n�mero � par ou impar.
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " eh par.");
		} else {
			System.out.println("O n�mero " + numero + " eh impar.");
		}

	}

}
