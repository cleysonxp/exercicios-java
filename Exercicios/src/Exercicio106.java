//Faz Math.pow nas posi��es de um for. 
import java.util.Scanner;

public class Exercicio106 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[10];

		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = Math.pow(2, i);
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

	}

}
