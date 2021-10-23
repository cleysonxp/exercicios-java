//Programa que pede a quantidade de pessoas e a idade de cada, e informa a média de idade desse grupo e diz se é uma turma, jovem, adulta ou idosa.
import java.util.Scanner;

public class Exercicio57 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a quantidade de pessoas: ");
		int qtdPessoas = scan.nextInt();
		int idade = 0;
		double somaIdades = 0;

		for (int i = 0; i < qtdPessoas; i++) {
			System.out.print("Informe a idade da " + (i + 1) + "º pessoa: ");
			idade = scan.nextInt();
			somaIdades += idade;
		}

		double media = somaIdades / qtdPessoas;

		if (media > 0 && media <= 25) {
			System.out.println("A média de idade da turma eh "+media+ ", uma turma jovem!");
		} else if (media >= 26 && media <= 60) {
			System.out.println("A média de idade da turma eh "+media+ ", uma turma adulta!");
		} else {
			System.out.println("A média de idade da turma eh "+media+ ", uma turma idosa!");
		}
	}
}