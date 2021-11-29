//Programa que pede 20 n�meros para o vetor A e armazena no inicicio do vetor B os n�meros pares e depois os n�meros impares. 
import java.util.Scanner;

public class Exercicio101 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; // pares e impares

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com o valor da posi��o A - " + i + ": ");
			vetorA[i] = scan.nextInt();
		}

		int posB = 0;

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
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

	}

}
