//Programa onde os valores do vetor C s�o a soma dos valores do vetor A e vetor B.
import java.util.Scanner;

public class Exercicio79 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10]; 
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do vetor B: ");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] + vetorB[i];
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
		
		System.out.println();
		System.out.print("Vetor C = ");
		for(int i = 0; i<vetorC.length;i++ ) {
			System.out.print(vetorC[i]+" ");
		}
	}
}