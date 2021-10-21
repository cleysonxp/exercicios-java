//Programa que pede dois números e faz o primeiro número elevado ao segundo.
import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a base: ");
		int base = scan.nextInt();
		System.out.print("Informe o expoente: ");
		int ex = scan.nextInt();

		int resultado = base;

		for (int i = 1; i < ex; i++) {
			resultado *= base;
		}

		System.out.println("O resultado eh: " + resultado);

	}

}
