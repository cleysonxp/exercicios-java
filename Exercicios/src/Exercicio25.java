//Programa que pedira o sal�rio e calculara o aumento conforme foi especificado, 
//e mostrara o valor antigo do sal�rio, o percentual de aumento, o aumento e o novo valor do sal�rio.
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor de seu sal�rio: ");
		double salario = scan.nextDouble();

		int percentual = 0;
		if (salario <= 280) {
			percentual = 20;
		} else if (salario > 280 && salario <= 700) {
			percentual = 15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		} else if (salario >= 1500) {
			percentual = 5;
		}

		double aumento = (salario / 100) * percentual;
		double novoSalario = salario + aumento;
		
		System.out.println("Sal�rio antes do reajuste: "+ salario);
		System.out.println("Percentual de aumento: "+ percentual);
		System.out.println("valor de aumento: "+ aumento);
		System.out.println("Novo Sal�rio: "+ novoSalario);
	}
}
