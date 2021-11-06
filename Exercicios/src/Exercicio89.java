
//Programa que mostra a quantos n�meros 15 foram digitados, mosta a soma de todos n�meros inferiores a 15 e a m�dia do n�meros superiores a 15.
import java.util.Scanner;

public class Exercicio89 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int igual15 = 0;
		int somaInferior = 0;
		int cont = 0;
		int somaSuperior = 0;
		double media = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] < 15) {
				somaInferior += vetorA[i];
			} else if (vetorA[i] == 15) {
				igual15++;
			} else if (vetorA[i] > 15) {
				somaSuperior += vetorA[i];
				cont++;
			}
		}
		media = somaSuperior / cont;
		System.out.println();

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Soma do n�meros inferiores a 15 �: " + somaInferior);
		System.out.println("Quantidade de n�meros iguais a 15 �: " + igual15);
		System.out.println("Soma dos n�meros superiores a 15 �: " + somaSuperior);
		System.out.println("Quantidade de n�meros superiores a 15 �: " + cont);
		System.out.println("M�dia dos n�meros superiores a 15 �: " + media);
	}
}