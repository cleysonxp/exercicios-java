//Programa que pede 10 n�meros e informa quantos n�meros pares foram digitados e quantos impares foram digitados.
import java.util.Scanner;

public class Exercicio51 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int contP = 0;
		int contI = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " +(i+1)+ "� n�mero: ");
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				contP++;
			} else {
				contI++;
			}
		}
		System.out.println();
		System.out.println("Voc� digitou " + contP+ " n�meros pares.");
		System.out.println("Voc� digitou " + contI+ " n�meros impares.");
		

	}

}
