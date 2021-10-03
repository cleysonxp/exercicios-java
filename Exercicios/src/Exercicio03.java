//Programa que pede dois numeros e imprime a soma deles
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		double n1 = scan.nextDouble();
		System.out.print("Digite outro numero: ");
		double n2 = scan.nextDouble();

		System.out.println("A soma entre " + n1 + " e " + n2 + " eh " + (n1 + n2));
	}
}
