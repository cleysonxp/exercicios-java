//Programa que pedira 2 n�meros e informara qual n�mero digitado � o maior
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		double n1 = scan.nextDouble();

		System.out.print("Digite outro n�mero: ");
		double n2 = scan.nextDouble();

		if (n1 > n2) {
			System.out.println("O maior n�mero que voc� digitou foi " + n1);
		} else if (n1 < n2) {
			System.out.println("O maior n�mero que voc� digitou foi " + n2);
		} else {
			System.out.println("Voc� digitou o mesmo n�mero: " + n1);
		}

	}

}
