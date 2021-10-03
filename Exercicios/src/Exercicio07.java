//Programa para calcular a area de um quadrado e mostrar seu dobro
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valo do lado do quadrado: ");
		double lado = scan.nextDouble();
		double areaDoQuadrado = Math.pow(lado, 2);

		System.out.println("A area do quadrado é " + areaDoQuadrado + ", e o dobro da area é " + areaDoQuadrado * 2);
	}
}
