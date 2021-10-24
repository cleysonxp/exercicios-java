//Programa que pede a quantidade de temperaturas e seus valores, e informa a média, a maior e a menor temperatura.
import java.util.Scanner;

public class Exercicio64 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com a quantidade de tempretauras: ");
		int qtdTemperaturas = scan.nextInt();
		double temp = 0;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		for (int i = 1; i <= qtdTemperaturas; i++) {
			System.out.print("Informe a " + i + "º temperetura: ");
			temp = scan.nextDouble();
			soma += temp;

			if (temp > maior) {
				maior = temp;
			}

			if (temp < menor) {
				menor = temp;
			}
		}

		System.out.println();
		System.out.println("Média das temperaturas: " + (soma / qtdTemperaturas));
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Menor temperatura: " + menor);

	}

}
