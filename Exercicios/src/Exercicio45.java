//Programa que pede 5 numeros e informa a soma deles e a m�dia.
import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int media = 0;
		int soma = 0;
		
		System.out.println("Voc� ira informa 5 n�meros.");
		
		for(int i =0;i <5;i++) {
			System.out.print("Digite um n�mero: ");
			int num = scan.nextInt();
			soma += num;
		}
		media = soma /5;
		
		System.out.println("-----------------------------------");
		System.out.println("A soma dos 5 n�meros eh: " + soma);
		System.out.println("A m�dia dos 5 n�meros eh: " + media);

	}

}
