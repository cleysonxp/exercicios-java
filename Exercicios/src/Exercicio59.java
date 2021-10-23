//programa que pede a quantidade de cds e seus valores, e informa quanto foi gasto no total em CDs.
import java.util.Scanner;

public class Exercicio59 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a sua quantidade de CDs: ");
		int qtdCds = scan.nextInt();
		int valor = 0;
		double soma = 0;

		for (int i = 0; i < qtdCds; i++) {
			System.out.print("Informe o valor do " + (i + 1) + "º CD: ");
			valor = scan.nextInt();
			soma += valor;
		}

		System.out.println();
		System.out.println("Você gastou " + soma + " reias em CDs.");

	}

}
