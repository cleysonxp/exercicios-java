//Programa que perguntar� em qual per�odo voc� estuda e dar� uma mensagem conforme o hor�rio.
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o turno que voc� estuda!");
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
			System.out.println("Valor inv�lido.");
			break;
		}

	}

}
