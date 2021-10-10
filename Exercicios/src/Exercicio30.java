//Programa que calcula as raizes de uma equa��o de segundo grau.
import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor de a: ");
		double a = scan.nextDouble();
		if (a == 0) {
			System.out.println("N�o � equa��o de segundo grau.");
		} else {
			System.out.print("Informe o valor de b: ");
			double b = scan.nextDouble();
			System.out.print("Informe o valor de c: ");
			double c = scan.nextDouble();

			double delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Delta negativo.");
			} else {
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}

	}

}
