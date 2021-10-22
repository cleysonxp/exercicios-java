//Programa que faz a série de fibonacci até que o valor seja maior que 500.
public class Exercicio53 {

	public static void main(String[] args) {

		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;

		System.out.println(primeiro);
		System.out.println(segundo);

		while (proximo <= 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}
	}
}
