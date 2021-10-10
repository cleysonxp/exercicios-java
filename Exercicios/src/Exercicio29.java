//Programa que pede o valor de três lados de um triângulo e informara qual tipo de triângulo ele é.
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
				System.out.println("Triângulo Equilátero.");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triângulo Escaleno.");
			}
			if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isóceles.");
			}

		} else {
			System.out.println("Não forma um triângulo");
		}

	}

}
