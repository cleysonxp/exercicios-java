//Programa que calcula o salario atraves do valo/hora multiplicado pela carga horaria do mes
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Qual seu valor hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Quantas horas voce trabalha no mes: ");
		double horasMes = scan.nextDouble();

		System.out.println("Você ganhou R$ " + (valorHora * horasMes) + " no mês.");

	}
}
