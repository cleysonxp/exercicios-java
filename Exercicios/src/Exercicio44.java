//Programa que pede cinco números e informa qual foi o maior número digitado.
import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int maior = 0;
		
		System.out.println("Você ira informa 5 números.");
		
		for(int i =0;i <5;i++) {
			System.out.print("Digite um número: ");
			int num = scan.nextInt();
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior número que você digitou foi: " + maior);

	}

}
