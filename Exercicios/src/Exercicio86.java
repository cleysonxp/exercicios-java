//Programa que calcula a soma total dos valores no vetor que s�o m�ltiplos.
import java.util.Scanner;

public class Exercicio86 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int total = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 5 == 0) {
				total += vetorA[i];				
			}
		}
		System.out.println();

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("A soma de todos os valores multiplos de 5 � do vetor �: " + total);

	}

}
