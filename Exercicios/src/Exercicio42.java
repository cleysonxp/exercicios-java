//Programa que calcula quanto tempo levara para a popula��o de um pa�s A supere a de um pa�s B,
//onde ser� pedido ao usu�rio a popula��o inicial e a taxa de crescimento..
import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a popula��o do pa�s A: ");
		double paisA = scan.nextDouble();
		System.out.print("Informe a taxa de crescimento da popula��o do pa�s A: ");
		double taxaA = scan.nextDouble();
		System.out.print("Informe a popula��o do pa�s B: ");
		double paisB = scan.nextDouble();
		System.out.print("Informe a taxa de crescimento da popula��o do pa�s B: ");
		double taxaB = scan.nextDouble();
		
		int anos = 0;


		while (paisA <= paisB) {
			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			anos++;
		}
		
		System.out.println();
		System.out.println("Popula��o pais A: "+ paisA);
		System.out.println("Popula��o pais B: "+ paisB);
		System.out.println("� necessario " + anos+" anos para a popula��o do paisA superar o paisB");

	}

}
