//Programa que calcula quanto tempo levara para a população de um país A supere a de um país B,
//onde será pedido ao usuário a população inicial e a taxa de crescimento..
import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a população do país A: ");
		double paisA = scan.nextDouble();
		System.out.print("Informe a taxa de crescimento da população do país A: ");
		double taxaA = scan.nextDouble();
		System.out.print("Informe a população do país B: ");
		double paisB = scan.nextDouble();
		System.out.print("Informe a taxa de crescimento da população do país B: ");
		double taxaB = scan.nextDouble();
		
		int anos = 0;


		while (paisA <= paisB) {
			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			anos++;
		}
		
		System.out.println();
		System.out.println("População pais A: "+ paisA);
		System.out.println("População pais B: "+ paisB);
		System.out.println("É necessario " + anos+" anos para a população do paisA superar o paisB");

	}

}
