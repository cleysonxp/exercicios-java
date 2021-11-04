//Programa que informa quantos n�meros pares foram digitados.
import java.util.Scanner;

public class Exercicio84 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int countP = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do vetor A: ");
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
		System.out.println("Voc� digitou " + countP + " n�meros pares.");

//		DecimalFormat df = new DecimalFormat("###,###.##");
	}
}