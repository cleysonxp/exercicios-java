//Programa que ira informar se a letra digitada é uma consoante ou vogal
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com uma letra: ");
		String input = scan.next();

		if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("o")
				|| input.equalsIgnoreCase("i") || input.equalsIgnoreCase("u")) {
			System.out.println("Você digitou a vogal: " + input);
		} else {
			System.out.println("Você digitou a consoante: " + input);
		}
	}

}
