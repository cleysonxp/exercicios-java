//Programa que passa os mesmos valores do vetor A para o B, porem com a ordem invertida.
import java.util.Scanner;

public class Exercicio98 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();

			vetorB[vetorA.length - i - 1] = vetorA[i];
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
