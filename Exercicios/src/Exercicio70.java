//Programa que mostra a serie de n termos
import java.util.Scanner;

public class Exercicio70 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor de n: ");
		int n = scan.nextInt();
		double soma = 0;

		for (int i = 1, j = 1; i <= n; i++, j += 2) {

			System.out.print(i + "/" + j + " + ");			
		}	

	}

}
