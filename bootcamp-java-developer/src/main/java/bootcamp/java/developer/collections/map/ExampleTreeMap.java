package bootcamp.java.developer.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
	
	public static void main(String[] args) {
		
		TreeMap<String, String> treeCapitais = new TreeMap<>();
		
		// Monta a árvore com as capitais
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florianópolis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "São Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("MG", "Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		System.out.println("----------");
		
		// Retorna a primeira capital no topo da árvore
		System.out.println(treeCapitais.firstKey());
		
		System.out.println("----------");
		
		// Retorna a última capital no final da árvore
		System.out.println(treeCapitais.lastKey());
		
		System.out.println("----------");
		
		// Retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(treeCapitais.lowerKey("SC"));
		
		System.out.println("----------");
		
		// Retorna a primeira capital acima na árvore da capital parametrizada
		System.out.println(treeCapitais.higherKey("SC"));
		
		System.out.println("----------");
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		System.out.println("----------");
		
		// Retorna a primeira capital no topo da árvore
		System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());
		
		System.out.println("----------");
		
		// Retorna a última capital no final da árvore
		System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());
		
		System.out.println("----------");
		
		// Retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());
		
		System.out.println("----------");
		
		// Retorna a primeira capital acima na árvore da capital parametrizada
		System.out.println(treeCapitais.higherEntry("SC").getKey() + " - " + treeCapitais.higherEntry("SC").getValue());
		
		System.out.println("----------");
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		System.out.println("----------");
		
		Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
		Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
		
		// Retorna a primeira capital no topo da árvore, removendo do map
		System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());
		
		// Retorna a primeira capital no final da árvore, removendo do map
		System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());
		
		System.out.println("----------");
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		System.out.println("----------");
		
		// Navega em todas as chaves do iterator
		Iterator<String> iterator = treeCapitais.keySet().iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " - " + treeCapitais.get(key));
		}
		
		for (String capital : treeCapitais.keySet()) {
			System.out.println(capital + " -- " + treeCapitais.get(capital));
		}
		
		for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
			System.out.println(capital.getKey() + " --- " + capital.getValue());
		}
	}
}
