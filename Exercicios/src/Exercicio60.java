//Programa que mostra uma tabela de preço de uma loja onde o valor de cada produtos é 1,99, a tabela mostra o valor refente a 1 produto até 50 produtos.
public class Exercicio60 {

	public static void main(String[] args) {

		double valorProduto = 1.99;
		double total = 0;

		System.out.println("Lojas Quase Dois - Tabela de preços");
		System.out.println();
		for (int i = 1; i <= 50; i++) {
			total = valorProduto * i;
			System.out.println(i + " - R$ " + total);
		}

	}

}
