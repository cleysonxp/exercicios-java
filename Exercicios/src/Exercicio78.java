//Programa onde os valores do vetor B serão os valores do vetor A multiplicado pela sua posição na matriz.
import java.util.Scanner;

public class Exercicio78 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Informe o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
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