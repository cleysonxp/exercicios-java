//Programa que solicitara o pre�o de tr�s produtos e ira informar qual � o mais barato.
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o pre�o da laranja: ");
		double produto1 = scan.nextDouble();
		System.out.print("Informe o pre�o do lim�o: ");
		double produto2 = scan.nextDouble();
		System.out.print("Informe o pre�o do p�o:  ");
		double produto3 = scan.nextDouble();

		if (produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O produto mais barato � a laranja: R$ " + produto1);
		} else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O produto mais barato � o lim�o: R$ " + produto2);
		} else if (produto3 <= produto1 && produto3 <= produto2) {
			System.out.println("O produto mais barato � o p�o: R$ " + produto3);
		}
	}
}