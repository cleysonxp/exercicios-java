//Programa com a série de fibonacci.
import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o n-ésimo termo da série de fibonacci: ");
		int n = scan.nextInt();
		
		System.out.println();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;			
		
		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i < n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}

	}

}
