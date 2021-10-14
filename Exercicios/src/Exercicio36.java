
//Programa que calcula o preço do quilo do morango e da maçã conforme regras pré estabelecidas.
import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a quantidade (Kg) de morango: ");
		double qtdMorango = scan.nextDouble();
		System.out.print("Informe a quantidade (Kg) de maçã: ");
		double qtdMaca = scan.nextDouble();

		double totalQtdFrutas = qtdMaca + qtdMorango;

		double precoMorango = 0;
		double precoMaca = 0;

		if (qtdMorango <= 5) {
			precoMorango = 2.5;
		} else if (qtdMorango > 5) {
			precoMorango = 2.2;
		}

		if (qtdMaca <= 5) {
			precoMaca = 1.8;
		} else if (qtdMaca > 5) {
			precoMaca = 1.5;
		}

		double precoTotalMorango = qtdMorango * precoMorango;
		double precoTotalMaca = qtdMaca * precoMaca;

		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;

		if (totalQtdFrutas > 8 || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}

		System.out.println("Preço Total: " + precoTotal);

	}

}
