package bootcamp.java.developer.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		// Adiciona 5 nomes na lista
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		// Navega na lista exibindo cada nome no console
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("---------------");
		
		// Substitui o nome Carlos por Roberto e exibe cada nome no console
		nomes.set(2, "Roberto");
		System.out.println(nomes);
		
		System.out.println("---------------");
		
		// Retorna o nome da posição 1 e exibe cada nome no console
		System.out.println(nomes.get(1));
		System.out.println(nomes);
		
		System.out.println("---------------");
		
		// Remove o nome da posição 4 e exibe cada nome no console
		nomes.remove(4);
		System.out.println(nomes);
		
		System.out.println("---------------");
		
		// Remove o nome João e exibe cada nome no console
		nomes.remove("João");
		System.out.println(nomes);
		
		System.out.println("---------------");
		
		// Retorna a quantidade de itens na lista e exibe no console
		System.out.println(nomes.size());
		
		System.out.println("---------------");
		
		// Verifica se o nome Juliano existe na lista e exibe no console: true ou false
		System.out.println(nomes.contains("Juliano"));
		
		System.out.println("---------------");
		
		// Nova lista de nomes
		List<String> novaLista = new ArrayList<>();
		novaLista.add("Ismael");
		novaLista.add("Rodrigo");
		
		// Adiciona todos os itens da nova lista na primeira lista criada e exibe no console
		nomes.addAll(novaLista);
		System.out.println(nomes);
		
		System.out.println("---------------");
		
		// Ordena os itens da lista por ordem alfabética e exibe no console
		Collections.sort(nomes);
		System.out.println(nomes);
		
		System.out.println("---------------");
		
		// Verifica se a lista está vazia e exibe no console: true ou false
		System.out.println(nomes.isEmpty());
		
	}
}
