//programa que pede alguns n�meros e analisa.
import java.util.Scanner;

public class Exercicio104 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com o valor da posi��o A - " + i + ": ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Analizando o n�mero " + vetorA[i]);

			for (int j = 2; j < vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " � par");
				}
			}

			System.out.println();
		}
	}
}