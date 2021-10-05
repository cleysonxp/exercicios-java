import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int n1 = scan.nextInt();
		System.out.print("Digite outro número inteiro: ");
		int n2 = scan.nextInt();
		System.out.print("Digite um número real: ");
		double n3 = scan.nextDouble();

		double n4 = (n1 * 2) * (n2 / 2);
		double n5 = (n1 * 3) + n3;
		double n6 = Math.pow(n3, 3);

		System.out.println("Resultado: " + n4);
		System.out.println("Resultado: " + n5);
		System.out.println("Resultado: " + n6);

	}
}
