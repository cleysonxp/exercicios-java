//Programa que pedir� duas notas e calcular a m�dia, e informara se foi aprovado ou reprovado
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("M�dia " + media +", Aprovado com Distin��o.");
		} else if(media >= 7 ) {
			System.out.println("M�dia " + media +", Aprovado.");
		} else {
			System.out.println("M�dia " + media +", Reprovado.");
		}

	}

}
