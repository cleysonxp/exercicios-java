//Programa que ira pedir um n�mero e ira devolver a tabuada desse n�mero.
import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Qual tabuada voc� quer: ");
		int tab = scan.nextInt();

		System.out.println();
		System.out.println("Tabualdo do " + tab);
		for (int i = 1; i <= 10; i++) {
			System.out.println(tab + " * " + i + " = " + (tab * i));
		}

	}

}
