//Programa que pede um n�mero e faz a listagem de n�mero primos at� ele.
import java.util.Scanner;

public class Exercicio66 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num = scan.nextInt();
		
		boolean primo;

		for (int i = 1; i <= num; i++) {

			primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				} 
			}
			
			if(primo){
				System.out.println(i);				
			}
		}
	}
}
