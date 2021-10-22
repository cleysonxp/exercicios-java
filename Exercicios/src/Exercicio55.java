
//Programa que informa se o número digitado é primo ou não.
import java.util.Scanner;

public class Exercicio55 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Numero digitado não é primo");
				break;
			} else {
				System.out.println("Numero digitado é primo");
				break;
			}
		}

	}

}
