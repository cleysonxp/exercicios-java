//Programa que converte metros em cm.
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor em metro para ser convertido para CM: ");
		int metros = scan.nextInt();
		System.out.println(metros + " metros é igual a " + (metros * 100) + " cm.");
	}
}
