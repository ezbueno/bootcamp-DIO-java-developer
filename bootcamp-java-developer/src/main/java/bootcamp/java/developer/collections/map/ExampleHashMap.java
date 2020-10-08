package bootcamp.java.developer.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();
		
		// Adiciona os campeões mundiais da Fifa no map
		campeoesMundiaisFifa.put("Brasil", 5);
		campeoesMundiaisFifa.put("Alemanha", 4);
		campeoesMundiaisFifa.put("Itália", 4);
		campeoesMundiaisFifa.put("Uruguai", 2);
		campeoesMundiaisFifa.put("Argentina", 2);
		campeoesMundiaisFifa.put("França", 2);
		campeoesMundiaisFifa.put("Inglaterra", 1);
		campeoesMundiaisFifa.put("Espanha", 1);
		
		System.out.println(campeoesMundiaisFifa);
		
		System.out.println("----------");
		
		// Atualiza o valor para a chave Brasil
		campeoesMundiaisFifa.put("Brasil", 6);
		
		System.out.println(campeoesMundiaisFifa);
		
		System.out.println("----------");
		
		// Retorna a Argentina
		System.out.println(campeoesMundiaisFifa.get("Argentina"));
		
		System.out.println("----------");
		
		// Retorna se existe ou não um campeão: França
		System.out.println(campeoesMundiaisFifa.containsKey("França"));
		
		System.out.println("----------");
		
		// Remove o campeão: França
		System.out.println(campeoesMundiaisFifa.remove("França"));
		
		System.out.println("----------");
		
		// Retorna se existe ou não o um campeão: França
		System.out.println(campeoesMundiaisFifa.containsKey("França"));
		
		System.out.println("----------");
		
		// Retorna se existe ou não alguma seleção hexa campeã
		System.out.println(campeoesMundiaisFifa.containsValue(6));
		
		System.out.println("----------");
		
		// Retorna o tamanho do map
		System.out.println(campeoesMundiaisFifa.size());
		
		System.out.println(campeoesMundiaisFifa);
		
		System.out.println("----------");
		
		// Navega nos registros do map
		for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		System.out.println("----------");
		
		// Navega nos registros do map
		for (String key : campeoesMundiaisFifa.keySet()) {
			System.out.println(key + " -- " + campeoesMundiaisFifa.get(key));
		}
		
		System.out.println(campeoesMundiaisFifa);
		
		System.out.println("----------");
		
		// Verifica se o map contém a chave Estados Unidos
		System.out.println(campeoesMundiaisFifa.containsKey("Estados Unidos"));
		
		System.out.println("----------");
		
		// Verifica se o map contém o valor 5
		System.out.println(campeoesMundiaisFifa.containsValue(5));
		
		System.out.println("----------");
		
		// Verifica o tamanho antes e depois de limpar o map
		System.out.println(campeoesMundiaisFifa.size());
		
		campeoesMundiaisFifa.clear();
		
		System.out.println(campeoesMundiaisFifa.size());
	}
}
