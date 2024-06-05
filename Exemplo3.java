package Vetores;
import java.util.ArrayList;
import java.util.Arrays;
public class Exemplo3 {

	public static void main(String[] args) {
		String[] disciplinas ={"matematica", "filosofia", "historia", "fisica"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("lingua Inglesa");
		
		for (String i: novaLista)
		{
             System.out.println("Disciplina: " +i);
		}
	}

}
