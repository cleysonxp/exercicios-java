//Programa que pede dois números e uma operação e dirá o resultado e se ele é positivo ou negativo.
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		double numero1 = scan.nextDouble();
		System.out.print("Informe o segundo número: ");
		double numero2 = scan.nextDouble();

		System.out.print("Informe a operação (+ - / *): ");
		String operacao = scan.next();

		double resultado = 0;

		switch (operacao) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "*":
			resultado = numero1 * numero2;
			break;
		case "/":
			resultado = numero1 / numero2;
			break;
		default:
			System.out.println("Operação Inválida");
			break;
		}

		String estado = "";
		if (resultado > 0) {
			estado = "positivo";
		} else if (resultado < 0) {
			estado = "negativo";
		} else {
			estado = "neutro";
		}

		System.out.println(numero1 + " " + operacao + " " + numero2 + " eh: " + resultado + " é um número " + estado);

	}

}
