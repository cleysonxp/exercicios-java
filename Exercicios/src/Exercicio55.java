
//Programa que informa se o n�mero digitado � primo ou n�o.
import java.util.Scanner;

public class Exercicio55 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Numero digitado n�o � primo");
				break;
			} else {
				System.out.println("Numero digitado � primo");
				break;
			}
		}

	}

}
