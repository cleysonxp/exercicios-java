//Programa que pedira 3 números e dirá qual é o maior deles.
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com um número: ");
		double n1 = scan.nextDouble();
		System.out.print("Entre com um segundo número: ");
		double n2 = scan.nextDouble();
		System.out.print("Entre com um terceiro número: ");
		double n3 = scan.nextDouble();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O primeiro número é maior: " + n1);
		} else if(n2 >= n1 && n2 >= n3) {
			System.out.println("O segundo número é maior: " + n2);
		} else if(n3 >= n1 && n3 >= n2) {
			System.out.println("O terceiro número é maior: " + n3);
		}

	}

}
