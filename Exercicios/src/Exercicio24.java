//Programa que perguntará em qual período você estuda e dará uma mensagem conforme o horário.
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o turno que você estuda!");
		System.out.print("M - matutino, V - vespertino, N - noite: ");
		String periodo = scan.next();

		switch (periodo) {
		case "m":
		case "M":
			System.out.println("Bom Dia!");
			break;
		case "v":
		case "V":
			System.out.println("Boa Tarde!");
			break;
		case "n":
		case "N":
			System.out.println("Boa Noite!");
			break;
		default:
			System.out.println("Valor inválido.");
			break;
		}

	}

}
