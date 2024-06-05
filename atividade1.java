package Vetores;
import java.util.ArrayList;
public class atividade1 {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int soma=0;
		
		numeros.add(6);
		numeros.add(9);
		numeros.add(10);
		numeros.add(8);
		numeros.add(7);
		
		for(int numero : numeros) {
			soma=soma + numero;
		}
		System.out.println(soma);
		
		
	}
	
	

}
