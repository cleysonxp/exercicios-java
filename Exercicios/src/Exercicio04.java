//Programa que solicita informar as 4 notas do aluno e mostra a m�dia
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		double media = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 4; i++) {
			System.out.print("Digite a " + i + "� nota: ");
			double nota = scan.nextDouble();
			media += nota;
		}

		System.out.println("A m�dia do aluno eh " + (media / 4));
	}
}
