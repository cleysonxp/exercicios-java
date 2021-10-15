//Programa que pede nome e senha, se a senha for igual ao nome é solicitado de novo esses dados.
import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome;
		String senha;

		boolean valido = false;

		
		do {
			System.out.print("Informe seu nome: ");
			nome = scan.next();
			System.out.print("Digite sua senha: ");
			senha = scan.next();

			if (nome.equalsIgnoreCase(senha)) {
//				valido = false;
				System.out.print("Senha igual a usuário, digite novamente.\n");
			} else {
				valido = true;
				System.out.println("senha e usuários válidos.");
			}
		} while (!valido);

	}

}
