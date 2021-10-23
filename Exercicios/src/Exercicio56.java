//Programa que pede a quantidade de notas, o valor de cada nota e calcula a média.
import java.util.Scanner;

public class Exercicio56 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		int qtdNotas = scan.nextInt();
		int nota = 0;
		double media =0;
		
		for(int i = 0;i<qtdNotas;i++) {
			System.out.print("Informe a "+(i+1)+"º nota:");
			nota = scan.nextInt();
			media += nota;
		}
		
		System.out.println();
		System.out.println("A média das " + qtdNotas + " notas eh: "+(media/qtdNotas));

	}

}
