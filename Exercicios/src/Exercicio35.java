//Programa que pede o tipo e quantidade de combustível e informa o preço a ser pago conforme as regras do posto.
import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {

		double precoA = 1.9;
		double precoG = 2.5;
		int desconto = 0;
		double total = 0;
		double totalDesconto = 0;
		double precoPagar = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Qual tipo de combustível (G - A)? ");
		String combustivel = scan.next();
		System.out.print("Quantos litros: ");
		int litro = scan.nextInt();

		if (combustivel.equalsIgnoreCase("A")) {
			if (litro <= 20) {
				desconto = 3;
			} else if (litro > 20) {
				desconto = 5;
			} else {
				System.out.println("Informe um valor valido para o combustível.");
			}

			total = litro * precoA;
		} else if (combustivel.equalsIgnoreCase("A")) {
			if (litro <= 20) {
				desconto = 4;
			} else if (litro > 20) {
				desconto = 6;
			} else {
				System.out.println("Informe um valor valido para o combustível.");
			}

			total = litro * precoG;
		} else {
			System.out.println("Erro, somente Gasolina ou Àlcool.");
		}

		totalDesconto = (total / 100) * desconto;
		precoPagar = total - totalDesconto;

		System.out.println("Valor a ser pago: " + precoPagar);
	}

}
