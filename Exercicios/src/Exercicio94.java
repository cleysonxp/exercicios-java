//Programa que informa se o n�mero digitado � um palindromo ou n�o.
import java.util.Scanner;

public class Exercicio94 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com um n�mero para a posi��o " + i+": ");
			vetorA[i] = scan.nextInt();

		}

		// 1221
		// i = 2

		boolean palindromo = true;
		for (int i = 0; i < (vetorA.length / 2); i++) {

			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		if (palindromo) {
			System.out.println("Palindromo");
		} else {
			System.out.println("N�o � palindromo");
		}

	}

}
