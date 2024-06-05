package Vetores;
import java.util.Scanner;
import java.util.ArrayList;

public class Atividade04 {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList <String>();
		Scanner ler = new Scanner(System.in);

    int i;
		
    carros.add("HB20");
		carros.add("Uno");
		carros.add("Gol");
		carros.add("Casinho");
		carros.add("Civic");
		carros.add("BMW");
		carros.add("Onix");
		carros.add("Porche");
		carros.add("Fusca");
		carros.add("Mustang");
		
		System.out.println(carros);
		System.out.println("Informe o carro que gostaria de ver com um número de 0 a 9");
		i = ler.nextInt();

		System.out.println(carros.get(i));
	}

}
