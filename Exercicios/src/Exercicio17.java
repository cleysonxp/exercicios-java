//Programa que informa se o que foi digitado é F ou M

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe com a letra (F or M)");		
		String input = scan.next();
		
		if(input.equalsIgnoreCase("f")) {
			System.out.println("F - femenino");
		} else if(input.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo Inválido");
		}
		

	}

}
