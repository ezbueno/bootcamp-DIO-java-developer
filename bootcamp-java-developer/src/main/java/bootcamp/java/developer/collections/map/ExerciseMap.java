package bootcamp.java.developer.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExerciseMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> estadosBrasil = new HashMap<>();
		
		// Adiciona os 26 estados brasileiros no map
		estadosBrasil.put("AC", "Acre");
		estadosBrasil.put("AL", "Alagoas");
		estadosBrasil.put("AP", "Amapá");
		estadosBrasil.put("AM", "Amazonas");
		estadosBrasil.put("BA", "Bahia");
		estadosBrasil.put("DF", "Distrito Federal");
		estadosBrasil.put("GO", "Goiás");
		estadosBrasil.put("MA", "Maranhão");
		estadosBrasil.put("MT", "Mato Grosso");
		estadosBrasil.put("MS", "Mato Grosso do Sul");
		estadosBrasil.put("MG", "Minas Gerais");
		estadosBrasil.put("PA", "Pará");
		estadosBrasil.put("PB", "Paraíba");
		estadosBrasil.put("PR", "Paraná");
		estadosBrasil.put("PE", "Pernambuco");
		estadosBrasil.put("PI", "Piauí");
		estadosBrasil.put("RJ", "Rio de Janeiro");
		estadosBrasil.put("RN", "Rio Grande do Norte");
		estadosBrasil.put("RS", "Rio Grande do Sul");
		estadosBrasil.put("RO", "Rondônia");
		estadosBrasil.put("RR", "Roraima");
		estadosBrasil.put("SC", "Santa Catarina");
		estadosBrasil.put("SP", "São Paulo");
		estadosBrasil.put("SE", "Sergipe");
		estadosBrasil.put("TO", "Tocantins");
		
		System.out.println(estadosBrasil);
		
		System.out.println("----------");
		
		// Remove o estado de Minas Gerais
		estadosBrasil.remove("Minas Gerais");
		
		System.out.println(estadosBrasil);
		
		System.out.println("----------");
		
		// Adiciona o Distrito Federal
		estadosBrasil.put("DF", "Distrito Federal");
		
		System.out.println(estadosBrasil);
		
		System.out.println("----------");
		
		// Verifica o tamanho do map e exibe no console
		System.out.println(estadosBrasil.size());
		
		System.out.println("----------");
		
		// Remove o estado de Mato Grosso do Sul usando o nome
		estadosBrasil.remove("Mato Grosso do Sul");
		
		System.out.println(estadosBrasil);
		
		System.out.println("----------");
		
		// Navega em todos os registros do map, mostrando no console o seguinte formato: NOME (SIGLA)		
		for (Map.Entry<String, String> entry : estadosBrasil.entrySet()) {
			System.out.println(entry.getValue() + " ---- " + entry.getKey());
		}
		
		System.out.println("----------");
		
		// Verifica se o estado de Santa Catarina existe no map, buscando por sua sigla (SC) e exibe no console: true ou false
		System.out.println(estadosBrasil.containsKey("SC"));
		
		System.out.println("----------");
		
		// Verifica se o estado do Maranhã existe no map, buscando por seu nome e exibe no console: true ou false
		System.out.println(estadosBrasil.containsValue("Maranhão"));
	}
}
