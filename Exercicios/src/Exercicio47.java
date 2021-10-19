
//Programa que pede dois números e completa a sequencia de números entre eles.
import java.util.Scanner;

public class Exercicio47 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("---------------------");

		if (num1 < num2) {

			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		}
	}

}
