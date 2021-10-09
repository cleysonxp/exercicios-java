//Programa que pede duas notas, e calcula a média e informa o conceito dessa nota.
import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		String conceito = "";
		if (media >= 9 && media <= 10) {
			conceito = "A";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
		} else if (media >= 4 && media < 6) {
			conceito = "D";
		} else if (media >= 0 && media < 4) {
			conceito = "E";
		}

		System.out.println();
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);

	}

}
