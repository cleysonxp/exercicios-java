import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();

		System.out.print("Informe a quantidade de horas trabalhadas no m�s: ");
		double horas = scan.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double TotalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - TotalDescontos;

		System.out.println();
		System.out.println("Sal�rio bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("S�ndicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("Total descontos: " + TotalDescontos);
		System.out.println("Sal�rio l�quido: " + salarioLiquido);

	}

}
