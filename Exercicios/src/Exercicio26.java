//Programa que pede o valor/hora e as horas trabalhadas no mês, e mostra um extrato com os descontos de imposto de renda e inss.
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe seu valo/hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Informe quantas horas você trabalha no mês: ");
		double horas = scan.nextDouble();

		double salarioBruto = valorHora * horas;

		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}

		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDesconto = ir + inss;
		double salarioLiquido = salarioBruto - totalDesconto;

		System.out.println();
		System.out.println("Salário Bruto: ( " + valorHora + " * " + horas + " ) : R$ " + salarioBruto);
		System.out.println("(-) Imposto de Renda ( " + percentualIR + "% ): R$ " + ir);
		System.out.println("(-) INSS ( 10% ): R$ " + inss);
		System.out.println("FGTS ( 11% ): R$ " + fgts);
		System.out.println("Total de descontos: R$ " + totalDesconto);
		System.out.println("Salário Liquido: R$ " + salarioLiquido);
	}

}
