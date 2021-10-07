import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double n = scan.nextDouble();
		
		if(n > 0) {
			System.out.println("O número " + n + " é positivo");
		} else if(n < 0) {
			System.out.println("O número " + n + " é negativo");
		} else {
			System.out.println("Você digitou o número " + n);
		}

	}

}
