//Programa que pede cinco n�meros e informa qual foi o maior n�mero digitado.
import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int maior = 0;
		
		System.out.println("Voc� ira informa 5 n�meros.");
		
		for(int i =0;i <5;i++) {
			System.out.print("Digite um n�mero: ");
			int num = scan.nextInt();
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior n�mero que voc� digitou foi: " + maior);

	}

}
