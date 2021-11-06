
//Programa que mostra a porcentagem de números ímpares e pares do vetor.
import java.util.Scanner;

public class Exercicio88 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int contP = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 != 0) {
				contP++;
			}
		}
		System.out.println();

		double porcPar = (contP * 100) / vetorA.length;
		double porcImp = 100 - porcPar;

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Porcentagem Pares: " + porcPar);
		System.out.println("Porcentagem Ímpares: " + porcImp);
	}
}