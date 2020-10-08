package bootcamp.java.developer.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("João");
		nomes.add("Pedro");
		nomes.add("Anderson");
		nomes.add("Juliana");
		nomes.add("Maria");
		nomes.add("Carlos");
		
		System.out.println(nomes);
			
		Collections.sort(nomes);
		System.out.println(nomes);
		
		nomes.set(1, "Nayara");
		System.out.println(nomes);
		
		nomes.remove(5);
		System.out.println(nomes);
		
		nomes.remove("João");
		System.out.println(nomes);
		
		String nome = nomes.get(3);
		System.out.println(nome);
		
		int posicao = nomes.indexOf("Nayara");
		System.out.println(posicao);
		
		int tamanho = nomes.size();
		System.out.println(tamanho);
		
		nomes.remove("Maria");
		tamanho = nomes.size();
		System.out.println(tamanho);
		
		boolean temNayara = nomes.contains("Nayara");
		System.out.println(temNayara);
		
		for(String n : nomes) {
			System.out.println("--> " + n);
		}
		
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) {
			System.out.println("---> " + iterator.next());
		}
		
		nomes.clear();
		
		boolean listaEstaVazia = nomes.isEmpty();
		System.out.println(listaEstaVazia);

	}
}
