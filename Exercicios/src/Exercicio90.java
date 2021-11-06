
//Programa que mostra quantos valores são superiores a 35.
import java.util.Scanner;

public class Exercicio90 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int cont = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] > 35) {
				cont++;
			}
		}
		System.out.println();

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println(cont + " pessoas desse grupo tem idade superior a 35 anos.");
	}
}