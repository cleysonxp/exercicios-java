//Programa que exibe uma tabela mostrando o valor de 1 at� 50 p�es, o valor do p�o � informado para fazer esse calculo.
import java.util.Scanner;

public class Exercicio61 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.print("Entre com a quantidade de p�es: ");
//		double qtdPao = scan.nextDouble();
		System.out.print("Entre com o valor do p�o: ");
		double valorPao = scan.nextDouble();
		double total = 0;

		System.out.println();
		System.out.println("Pre�o do p�o: R$ " + valorPao);
		for (int i = 0; i < 50; i++) {
			total = (i + 1) * valorPao;
			System.out.println((i + 1) + " - R$ " + total);
		}

	}

}
