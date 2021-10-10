//Programa que pede o valor de tr�s lados de um tri�ngulo e informara qual tipo de tri�ngulo ele �.
import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro lado: ");
		int lado1 = scan.nextInt();
		System.out.print("Informe o primeiro lado: ");
		int lado2 = scan.nextInt();
		System.out.print("Informe o primeiro lado: ");
		int lado3 = scan.nextInt();

		if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Tri�ngulo Equil�tero.");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Tri�ngulo Escaleno.");
			}
			if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Tri�ngulo Is�celes.");
			}

		} else {
			System.out.println("N�o forma um tri�ngulo");
		}

	}

}
