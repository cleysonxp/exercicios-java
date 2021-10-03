//Programa que pede o raio de um circulo e calcula a area dele
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o raio de um circulo: ");
		double raio = scan.nextDouble();
		double areaDoCirculo = Math.PI * Math.pow(raio, 2);

		System.out.println("A area do circulo eh " + areaDoCirculo);
	}

}
