//Programa onde o vetor B tem os mesmos valores que o vetor A.
import java.util.Scanner;

public class Exercicio74 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Informe o valor da posi��o " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		System.out.println();

		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length;i++ ) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i = 0; i<vetorB.length;i++ ) {
			System.out.print(vetorB[i]+" ");
		}	
	}
}