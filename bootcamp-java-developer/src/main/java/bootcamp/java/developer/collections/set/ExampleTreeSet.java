package bootcamp.java.developer.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		// Monta a árvore com as capitais
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianópolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		System.out.println("----------");
		
		// Retorna a primeira capital no topo da árvore
		System.out.println("Primeira capital no topo da árvore: " + treeCapitais.first());
		
		System.out.println("----------");
		
		// Retorna a última capital no final da árvore
		System.out.println("Última capital da árvore: " + treeCapitais.last());
		
		System.out.println("----------");
		
		// Retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(treeCapitais.lower("Florianópolis"));
		
		System.out.println("----------");
		
		// Retorna a primeira capital acima na árvore da capital parametrizada
		System.out.println(treeCapitais.higher("Florianópolis"));
		
		System.out.println("----------");
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		System.out.println("----------");
		
		// Retorna a primeira capital no topo da árvore, removendo do set
		System.out.println("Primeira capital removida no topo da árvore: " + treeCapitais.pollFirst());
		
		System.out.println("----------");
		
		// Retorna a primeira capital no final da árvore, removendo do set
		System.out.println("Primeira capital removida no final da árvore: " + treeCapitais.pollLast());
		
		System.out.println("----------");
		
		// Exibe todas as capitais no console
		System.out.println();
		
		System.out.println("----------");
		
		// Navega em todos os itens do iterator
		Iterator<String> iterator = treeCapitais.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("---> " + iterator.next());
		}
		
		for (String capital : treeCapitais) {
			System.out.println("---->" + capital);
		}
		
		System.out.println("----------");
	}

}
