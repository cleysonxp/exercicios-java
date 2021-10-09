//Programa que pergunta o dia da semana e fala qual dia é, ex: 1 - domingo, 2 – segunda, etc.
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o dia da semana (1-7): ");
		int dia = scan.nextInt();

		switch (dia) {
		case 1:
			System.out.println("1 - Domingo!");
			break;
		case 2:
			System.out.println("2 - Segunda!");
			break;
		case 3:
			System.out.println("3 - Terça!");
			break;
		case 4:
			System.out.println("4 - Quarta!");
			break;
		case 5:
			System.out.println("5 - Quinta!");
			break;
		case 6:
			System.out.println("6 - Sexta!");
			break;
		case 7:
			System.out.println("7 - Sábado!");
			break;
		default:
			System.out.println("Valor inválido!");
			break;
		}

	}

}
