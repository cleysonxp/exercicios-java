//Programa que para ao informar um numero impar.
import java.util.Scanner;

public class Exercicio93 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com um n�mero para a posi��o " + i+": ");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 != 0) {
				break;
			}
		}

	}

}
