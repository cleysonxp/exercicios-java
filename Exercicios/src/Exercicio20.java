//Programa que pedira 3 n�meros e dir� qual � o maior deles.
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com um n�mero: ");
		double n1 = scan.nextDouble();
		System.out.print("Entre com um segundo n�mero: ");
		double n2 = scan.nextDouble();
		System.out.print("Entre com um terceiro n�mero: ");
		double n3 = scan.nextDouble();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O primeiro n�mero � maior: " + n1);
		} else if(n2 >= n1 && n2 >= n3) {
			System.out.println("O segundo n�mero � maior: " + n2);
		} else if(n3 >= n1 && n3 >= n2) {
			System.out.println("O terceiro n�mero � maior: " + n3);
		}

	}

}
