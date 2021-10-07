//Programa que solicitara o preço de três produtos e ira informar qual é o mais barato.
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o preço da laranja: ");
		double produto1 = scan.nextDouble();
		System.out.print("Informe o preço do limão: ");
		double produto2 = scan.nextDouble();
		System.out.print("Informe o preço do pão:  ");
		double produto3 = scan.nextDouble();

		if (produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O produto mais barato é a laranja: R$ " + produto1);
		} else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O produto mais barato é o limão: R$ " + produto2);
		} else if (produto3 <= produto1 && produto3 <= produto2) {
			System.out.println("O produto mais barato é o pão: R$ " + produto3);
		}
	}
}