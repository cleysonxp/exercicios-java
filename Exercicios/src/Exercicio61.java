//Programa que exibe uma tabela mostrando o valor de 1 até 50 pães, o valor do pão é informado para fazer esse calculo.
import java.util.Scanner;

public class Exercicio61 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.print("Entre com a quantidade de pães: ");
//		double qtdPao = scan.nextDouble();
		System.out.print("Entre com o valor do pão: ");
		double valorPao = scan.nextDouble();
		double total = 0;

		System.out.println();
		System.out.println("Preço do pão: R$ " + valorPao);
		for (int i = 0; i < 50; i++) {
			total = (i + 1) * valorPao;
			System.out.println((i + 1) + " - R$ " + total);
		}

	}

}
