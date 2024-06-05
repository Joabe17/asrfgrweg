package Vetores;
import java.util.ArrayList;

public class Atividade02 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int soma=0;
		
		numeros.add(-12);
		numeros.add(-6);
		numeros.add(-24);
		numeros.add(-33);
		numeros.add(-19);
		
		for(int numero : numeros) {
			if (numero % 2==0) {
			   soma=soma +numero;
			}

			System.out.println("A soma dos numeros negativos é:" +soma);
		}
	}

		
		}


