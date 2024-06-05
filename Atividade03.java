package Vetores;

import java.util.ArrayList;

public class Atividade03 {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList <String>();


		frutas.add("uva passa");
		frutas.add("Morango");
		frutas.add("Banana");
		frutas.add("Amora");
		frutas.add("Pessego");
		frutas.add("Abacaxi");
		frutas.add("jabuticaba");
		frutas.add("Ameixa");
		frutas.add("Mamão");
		frutas.add("Cereja");
		frutas.add("Laranja");

		System.out.println(frutas);
		frutas.remove(0);
		frutas.remove(1);
		frutas.remove(2);
		frutas.remove(3);
		frutas.remove(4);
		System.out.println(frutas);
		System.out.println(frutas.size());
	}
}