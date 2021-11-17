//Programa que pede 10 valores para o vetor A e 10 para o vetor B, e preenche o vetor C com 
//1 se o numero de A for maior que o de B, 0 se A e B forem igual e -1 se B for maior que A.
import java.util.Scanner;

public class Exercicio96 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com um número para a posição A = " + i + ": ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorB.length; i++) {

			System.out.print("Entre com um número para a posição B = " + i + ": ");
			vetorB[i] = scan.nextInt();

			if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else {
				vetorC[i] = -1;
			}
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

		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();

	}

}
