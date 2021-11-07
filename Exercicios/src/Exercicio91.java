//Programa que pergunta a cotação atual do dólar, e mostra a relação do real com o dólar.
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio91 {

	public static void main(String[] args) {

		DecimalFormat deci = new DecimalFormat("###,###.##");
		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[20];
		double cotacao;

		System.out.print("Entre com a cotação do dólar: ");
		cotacao = scan.nextDouble();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + 1);
		}

		System.out.println();
		System.out.println("VetoA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("R$ " + (i + 1) + " é igual a $ " + deci.format(vetorA[i]));
		}

	}

}
