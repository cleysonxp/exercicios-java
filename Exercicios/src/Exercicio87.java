//Programa que calcula a média aritmética de todos valores no vetor que são ímpares.
import java.util.Scanner;

public class Exercicio87 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int contador = 0;
		int total = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 != 0) {
				total += vetorA[i];
				contador++;
			}
		}
		System.out.println();

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("A média aritmética dos números impares é: " + (total/contador));


	}

}
