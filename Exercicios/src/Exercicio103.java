//Programa que pede  alguns n�meros e diz se o n�mero � primo ou par.
import java.util.Scanner;

public class Exercicio103 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com o valor da posi��o A - " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println();

		boolean primo;
		String msg;

		for (int i = 0; i < vetorA.length; i++) {

			primo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}
			
			msg = "";
			if (primo) {
				msg = " primo";
			} else {
				msg = " n�o � primo";
			}

			System.out.println(vetorA[i] + msg);
		}
	}
}