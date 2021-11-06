
//Programa que mostra a quantos números 15 foram digitados, mosta a soma de todos números inferiores a 15 e a média do números superiores a 15.
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
			System.out.print("Informe o valor da posição " + i + " do vetor A: ");
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
		System.out.println("Soma do números inferiores a 15 é: " + somaInferior);
		System.out.println("Quantidade de números iguais a 15 é: " + igual15);
		System.out.println("Soma dos números superiores a 15 é: " + somaSuperior);
		System.out.println("Quantidade de números superiores a 15 é: " + cont);
		System.out.println("Média dos números superiores a 15 é: " + media);
	}
}