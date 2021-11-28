//Programa que pede 20 números para o vetor A e passa os ímpares para o vetor C e os pares para o vetor B.
import java.util.Scanner;

public class Exercicio100 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; // pares
		int[] vetorC = new int[vetorA.length]; // impares

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com o valor da posição A - " + i + ": ");
			vetorA[i] = scan.nextInt();
		}

		int posB = 0;
		int posC = 0;

		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < posB; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor C = ");
		for (int i = 0; i < posC; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
	}

}