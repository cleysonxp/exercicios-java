//Programa que calcula o fatorial de um número que foi informado.
import java.util.Scanner;

public class Exercicio54 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite qual número você quer fazer o fatorial: ");
		int num = scan.nextInt();
		System.out.println();
		System.out.println("Fatoria de " + num + "!");		
		int fatorial = 1;

		for (int i = num; i > 0; i--) {
			fatorial *= i;
		}
		System.out.println("Resultado eh: " + fatorial);

	}

}
