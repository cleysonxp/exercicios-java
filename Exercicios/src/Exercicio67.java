//Programa que monta a tabuada do n�mero informado, tendo inicio e final definido pelos us�ario.
import java.util.Scanner;

public class Exercicio67 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a tabuada: ");
		int tabu = scan.nextInt();

		System.out.print("Informe o come�o da tabuada: ");
		int start = scan.nextInt();
		System.out.print("Informe o final da tabuada: ");
		int end = scan.nextInt();

		System.out.println();
		System.out.println("Tabuada do " + tabu);
		System.out.println("Come�ar por: " + start);
		System.out.println("Terminar por: " + end);
		System.out.println();
		System.out.println("Vou montar a tabuada de " + tabu + " come�ando em " + start + " e terminando em " + end + ":");
		for (int i = start; i <= end; i++) {
			System.out.println(tabu + " x " + i + " = " + (tabu * i));
		}

	}

}
