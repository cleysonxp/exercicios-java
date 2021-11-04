//Programa que informa quantos números pares foram digitados.
import java.util.Scanner;

public class Exercicio84 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int countP = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();			
		}
		System.out.println();
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				countP++;
			}
		}

		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Você digitou " + countP + " números pares.");

//		DecimalFormat df = new DecimalFormat("###,###.##");
	}
}