//Programa onde os valores do vetor B s�o os valores do vetor A dividido por 2.
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio83 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] =  vetorA[i] % 2;
		}
		System.out.println();

		System.out.println();

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

//		DecimalFormat df = new DecimalFormat("###,###.##");


	}

}
