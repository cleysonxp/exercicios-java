//Programa que investiga um crime atrav�s de cinco perguntas, e dependendo da resposta da pessoa ela ser�, inocente, suspeita, c�mplice ou culpada.
import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Telefonou para a v�tima (S - N)? ");
		String resposta1 = scan.next();
		System.out.print("Esteve no local do crime (S - N)? ");
		String resposta2 = scan.next();
		System.out.print("Mora perto da v�tima (S - N)? ");
		String resposta3 = scan.next();
		System.out.print("Devia para a v�tima (S - N)? ");
		String resposta4 = scan.next();
		System.out.print("J� trabalhou com a v�tima (S - N)? ");
		String resposta5 = scan.next();

		int cont = 0;

		if (resposta1.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resposta2.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resposta3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resposta4.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resposta5.equalsIgnoreCase("S")) {
			cont++;
		}

		if (cont == 2) {
			System.out.println("Suspeita!");
		} else if (cont == 3 || cont == 4) {
			System.out.println("C�mplice!");
		} else if (cont == 5) {
			System.out.println("Assassino!");
		} else if (cont == 1 || cont == 0) {
			System.out.println("Inocente!");
		}

	}

}
