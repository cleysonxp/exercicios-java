//Programa que mostra o aumento de um funcionario x do ano de 1995 ate o ano de 2021
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio68 {

	public static void main(String[] args) {

		DecimalFormat deci = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o seu salário: ");

		double salario = scan.nextDouble();
		double percentual = 1.5;

		System.out.println("1995 -> " + deci.format(salario));
		salario += (salario / 100) * percentual;

		System.out.println("1996 -> " + deci.format(salario));
		for (int i = 1997; i <= 2021; i++) {

			percentual *= 2;

			salario += (salario / 100) * percentual;

			System.out.println(i + " -> " + deci.format(salario));
		}

	}

}
