//Programa que pede 10 n�meros e informa quais s�o os divisores desses n�meros.
import java.util.Scanner;

public class Exercicio105 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com o valor da posi��o A - " + i + ": ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Analizando o n�mero " + vetorA[i]);

			for (int j = 1; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j + " � divisor");
				}
			}

			System.out.println();
		}

	}

}
