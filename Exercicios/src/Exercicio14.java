//Programa que calcula o tempo de download de um arquivo utilizando o tamanho do arquivo e a velocidade da internet
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o tamanho em MB do arquivo: ");
		double arquivo = scan.nextDouble();
		System.out.print("Informe a velocidade da internet: ");
		double velocidade = scan.nextDouble();

		double tempo = arquivo / velocidade;

		System.out.println("O tempo do download é de " + tempo);

	}

}
