//Programa que pede algumas informações e valida se elas estão de acordo com as regras. 
import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValido = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		do {
			System.out.print("Informe seu nome: ");
			nome = scan.next();
			if (nome.length() > 3) {
				infoValido = true;
			} else {
				System.out.println("Nome precisa ser maior que três caracteres.");
			}
		} while (!infoValido);

		infoValido = false;
		do {
			System.out.print("Informe sua idade: ");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				infoValido = true;
			} else {
				System.out.println("Idade precisa ser entre 0 a 150.");
			}
		} while (!infoValido);

		infoValido = false;
		do {
			System.out.print("Informe seu salário: ");
			salario = scan.nextDouble();
			if (salario > 0) {
				infoValido = true;
			} else {
				System.out.println("Salário precisa ser maior que zero.");
			}
		} while (!infoValido);

		infoValido = false;
		do {
			System.out.print("Informe seu sexo: ");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoValido = true;
			} else {
				System.out.println("Sexo precisa ser F ou M.");
			}
		} while (!infoValido);

		infoValido = false;
		do {
			System.out.print("Informe seu estado civil: ");
			estadoCivil = scan.next();
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValido = true;
			} else {
				System.out.println("Estado civil precisa ser S, C, V ou D.");
			}
		} while (!infoValido);

		System.out.println("---------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

	}
}
