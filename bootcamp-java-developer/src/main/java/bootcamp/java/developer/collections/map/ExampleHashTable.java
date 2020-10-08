package bootcamp.java.developer.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> estudantes = new Hashtable<>();
		estudantes.put("Carlos", 21);
		estudantes.put("Mariana", 33);
		estudantes.put("Rafaela", 18);
		estudantes.put("Pedro", 44);
		
		System.out.println(estudantes);
		
		System.out.println("----------");
		
		estudantes.put("Pedro", 55);
		
		System.out.println(estudantes);
		
		// Remove um estudante no índice 0
		estudantes.remove("Pedro");
		
		System.out.println(estudantes);
		
		System.out.println("----------");
		
		// Recupera um estudante no índice 2
		int idadeEstudante = estudantes.get("Mariana");
		
		System.out.println(idadeEstudante);
		
		System.out.println(estudantes.size());
		
		System.out.println("----------");
		
		// Navega nos registros do map
		for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
			System.out.println(entry + " - " + entry.getValue());
		}
		
		System.out.println("----------");
		
		// Navega nos registros do map
		for (String key : estudantes.keySet()) {
			System.out.println(key + " - " + estudantes.get(key));
		}
		
		System.out.println(estudantes);

	}
}
