//Programa que calcula quanto tempo levara para a população de um país A supere a de um país B, 
//ambos países com uma população já definida no programa, tendo cada pais uma taxa de crescimento especifica.
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
		
		System.out.println("População pais A: "+ paisA);
		System.out.println("População pais B: "+ paisB);
		System.out.println("É necessario " + anos+" anos para a população do paisA superar o paisB");

	}

}
