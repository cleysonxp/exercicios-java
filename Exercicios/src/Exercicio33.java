//Programa que pede dois n�meros e uma opera��o e dir� o resultado e se ele � positivo ou negativo.
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o primeiro n�mero: ");
		double numero1 = scan.nextDouble();
		System.out.print("Informe o segundo n�mero: ");
		double numero2 = scan.nextDouble();

		System.out.print("Informe a opera��o (+ - / *): ");
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
			System.out.println("Opera��o Inv�lida");
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

		System.out.println(numero1 + " " + operacao + " " + numero2 + " eh: " + resultado + " � um n�mero " + estado);

	}

}
