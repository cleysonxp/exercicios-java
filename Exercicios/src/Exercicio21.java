//Programa que pedira 3 n�meros e dir� qual � o maior e monor ebtre eles.
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com um n�mero: ");
		double n1 = scan.nextDouble();
		System.out.print("Entre com um segundo n�mero: ");
		double n2 = scan.nextDouble();
		System.out.print("Entre com um terceiro n�mero: ");
		double n3 = scan.nextDouble();
		
//		Verificando qual � o maior n�mero digitado.
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O primeiro n�mero � maior: " + n1);
		} else if(n2 >= n1 && n2 >= n3) {
			System.out.println("O segundo n�mero � maior: " + n2);
		} else if(n3 >= n1 && n3 >= n2) {
			System.out.println("O terceiro n�mero � maior: " + n3);
		}
		
//		Verificando qual � o menor n�mero digitado.
		if(n1 <= n2 && n1 <= n3) {
			System.out.println("O primeiro n�mero � o menor: " + n1);
		} else if(n2 <= n1 && n2 <= n3) {
			System.out.println("O segundo n�mero � maior o menor: " + n2);
		} else if(n3 <= n1 && n3 <= n2) {
			System.out.println("O terceiro n�mero � maior o menor: " + n3);
		}

	}

}
