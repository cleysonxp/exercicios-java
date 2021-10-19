//Programa que pede 5 numeros e informa a soma deles e a média.
import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int media = 0;
		int soma = 0;
		
		System.out.println("Você ira informa 5 números.");
		
		for(int i =0;i <5;i++) {
			System.out.print("Digite um número: ");
			int num = scan.nextInt();
			soma += num;
		}
		media = soma /5;
		
		System.out.println("-----------------------------------");
		System.out.println("A soma dos 5 números eh: " + soma);
		System.out.println("A média dos 5 números eh: " + media);

	}

}
