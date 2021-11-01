//Programa onde os valores do vetor B serão a raiz quadrada dos  valores do vetor A.
import java.util.Scanner;

public class Exercicio77 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Informe o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
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