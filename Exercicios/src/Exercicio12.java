//Programa que pedira a altura e informara o peso ideal
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sua altura: ");
		double altura = scan.nextDouble();

		double pesoIdeal = (72.8 * altura) - 58;

		System.out.println("O peso ideal é: " + pesoIdeal);

	}

}
