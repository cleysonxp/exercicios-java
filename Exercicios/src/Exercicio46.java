//Programa que imprime os n�meros impares do zero at� 50.
import java.util.Iterator;

public class Exercicio46 {

	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

}
