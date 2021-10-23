
//programa que pede a quantidade de turmas e quantos alunos em cada e diz a media de alunos.
import java.util.Scanner;

public class Exercicio58 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a quantidade de turmas: ");
		int qtdTurmas = scan.nextInt();
		int alunos = 0;
		double soma = 0;

		for (int i = 0; i < qtdTurmas; i++) {
			System.out.print("Informe a quantidade de aluno da " + (i + 1) + "º turma: ");
			alunos = scan.nextInt();
			soma += alunos;
		}

		double media = soma / qtdTurmas;

		System.out.println();
		System.out.println("Total de alunos eh " + soma);
		System.out.println("A média de alunos eh " + media);

	}

}
