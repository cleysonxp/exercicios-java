package br.com.exercicios.classes;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.setModelo("A60");
		lampada.setTensao("Bivolt");
		lampada.setGarantiaMeses(36);
		lampada.setPotencia(7);
		lampada.setCor("Amarela");
		lampada.setTipoLuz("Amarela");
		lampada.setTipoAbajur(true);

		String[] tipos = new String[5];
		tipos[0] = "Abajur";
//		tipos[1] = "Lampeões";

		lampada.setTipos(tipos);

		System.out.println("Modelo: " + lampada.getModelo());
		System.out.println("Tensão: " + lampada.getTensao());
		System.out.println("Garantia: " + lampada.getGarantiaMeses());
		System.out.println("Potencia: " + lampada.getPotencia());
		System.out.println("Cor: " + lampada.getCor());
		System.out.println("Tipo de Luz: " + lampada.getTipoLuz());
		System.out.println("Tipo de Abajur: " + lampada.isTipoAbajur());
		System.out.println("Tipos: " + lampada.getTipos());

	}

}
