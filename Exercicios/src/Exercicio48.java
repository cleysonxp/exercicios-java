//Programa que pede dois números e faz a soma dos numeros entre eles.
import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = scan.nextInt();
		int total = 0;

		System.out.println("---------------------");

		if (num1 < num2) {

			for (int i = num1; i <= num2; i++) {
				total += i;
			}
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				total += i;
			}
		}

		System.out.println("A soma dos entre " + num1 + " e " + num2 + " eh: " + total);

	}

}
