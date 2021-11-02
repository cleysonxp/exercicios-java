//Programa onde os valores do vetor C são a divisão dos valores do vetor A e vetor B.
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio82 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10]; 
		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do vetor B: ");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] / vetorB[i];
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
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.println();
		System.out.print("Vetor C = ");
		for(int i = 0; i<vetorC.length;i++ ) {
			System.out.print(vetorC[i]+" ");
		}

	}

}
