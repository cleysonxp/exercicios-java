//Programa que calcula o valor total dos produtos e informa o valor do troco. 
import java.util.Scanner;

public class Exercicio62 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		double preco = 0;
		double total =0;
		double dinheiro =0;
		double troco = 0;
		
		boolean termino = false;
		int cont = 1;
		
		System.out.println("Informe o valor dos produtos!");
		System.out.println();
		
		System.out.println("Lojas Tabajaras");
		do {
			System.out.print("Produto "+ cont +": R$ ");
			preco = scan.nextDouble();
			total += preco;
			cont++;
			if(preco == 0) {
				System.out.println();
				System.out.println("Total: " + total);
				System.out.print("Dinheiro: ");
				dinheiro = scan.nextDouble();
				System.out.println("Troco: R$ "+(dinheiro - total));
				termino = true;
			}
			
		} while (!termino);

	}

}
