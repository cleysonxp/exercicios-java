//Programa que pede números para o vetor A e vetor B, e passa os números de A e B para o vetor C.
import java.util.Scanner;

public class Exercicio99 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com o valor da posição A - " + i+": ");
			vetorA[i] = scan.nextInt();

			vetorC[i] = vetorA[i];
		}

		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {

			System.out.print("Entre com o valor da posição B - " + i+": ");
			vetorB[i] = scan.nextInt();

			vetorC[vetorA.length + i] = vetorB[i];
		}

		System.out.println();
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

		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
	}

}
