import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		double n = scan.nextDouble();
		
		if(n > 0) {
			System.out.println("O n�mero " + n + " � positivo");
		} else if(n < 0) {
			System.out.println("O n�mero " + n + " � negativo");
		} else {
			System.out.println("Voc� digitou o n�mero " + n);
		}

	}

}
