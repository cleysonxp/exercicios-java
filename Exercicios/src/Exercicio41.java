//Programa que calcula quanto tempo levara para a popula��o de um pa�s A supere a de um pa�s B, 
//ambos pa�ses com uma popula��o j� definida no programa, tendo cada pais uma taxa de crescimento especifica.
public class Exercicio41 {

	public static void main(String[] args) {

		int paisA = 80000;
		int paisB = 200000;
		int anos = 0;


		while (paisA <= paisB) {
			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			anos++;
		}
		
		System.out.println("Popula��o pais A: "+ paisA);
		System.out.println("Popula��o pais B: "+ paisB);
		System.out.println("� necessario " + anos+" anos para a popula��o do paisA superar o paisB");

	}

}
