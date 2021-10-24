//programa que calcula o fatorial do número informado.
import java.util.Scanner;

public class Exercicio63 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o fatorial: ");
		int fatorial = scan.nextInt();
		int total= fatorial;
		int cont = fatorial;
		
		System.out.print(fatorial+"! = ");
		
		for(int i = 0; i < fatorial - 1; i++) {
			System.out.print(cont-- + " . ");
			total *= (1+i);
		}
		System.out.println(" 1 =  " +total);

	}

}
