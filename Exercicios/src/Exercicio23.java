//Programa que pedira tr�s n�meros e exibira em ordem decrescente deles.
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com um n�mero: ");
		double n1 = scan.nextDouble();
		System.out.print("Entre com um segundo n�mero: ");
		double n2 = scan.nextDouble();
		System.out.print("Entre com um terceiro n�mero: ");
		double n3 = scan.nextDouble();

		if (n1 >= n2 && n1 >= n3 && n2 >= n3) {
			System.out.println("Voc� digitou os n�meros: " + n1 + ", " + n2 + ", " + n3);
		} else if (n1 >= n2 && n1 >= n3 && n2 <= n3) {
			System.out.println("Voc� digitou os n�meros: " + n1 + ", " + n3 + ", " + n2);
		} else if (n2 >= n1 && n2 >= n3 && n1 >= n3) {
			System.out.println("Voc� digitou os n�meros: " + n2 + ", " + n1 + ", " + n3);
		} else if (n2 >= n1 && n2 >= n3 && n1 <= n3) {
			System.out.println("Voc� digitou os n�meros: " + n2 + ", " + n3 + ", " + n1);
		} else if (n3 >= n1 && n3 >= n2 && n1 >= n2) {
			System.out.println("Voc� digitou os n�meros: " + n3 + ", " + n1 + ", " + n2);
		} else if (n3 >= n1 && n3 >= n2 && n1 <= n2) {
			System.out.println("Voc� digitou os n�meros: " + n3 + ", " + n2 + ", " + n1);
		}

	}

}
