//Programa que pede 10 valores para o vetor A, e preenche o vetor B com 1 se o n�mero digitado for par e zero se o n�mero for impar.
import java.util.Scanner;

public class Exercicio95 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Informe o n�mero para a posi��o " + i + ": ");
			vetorA[i] = scan.nextInt();

			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

	}

}
