//Programa que pedira 2 números e informara qual número digitado é o maior
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double n1 = scan.nextDouble();

		System.out.print("Digite outro número: ");
		double n2 = scan.nextDouble();

		if (n1 > n2) {
			System.out.println("O maior número que você digitou foi " + n1);
		} else if (n1 < n2) {
			System.out.println("O maior número que você digitou foi " + n2);
		} else {
			System.out.println("Você digitou o mesmo número: " + n1);
		}

	}

}
