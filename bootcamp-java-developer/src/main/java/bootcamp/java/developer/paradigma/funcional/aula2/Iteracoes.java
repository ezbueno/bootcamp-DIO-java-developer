package bootcamp.java.developer.paradigma.funcional.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
	
	public static void main(String[] args) {
		String[] nomes = {"Ezandro", "Bueno", "Nayara", "Balarotti"};
		Integer[] numeros = {1, 2, 3, 4, 5};
		imprimirNomesFiltrados(nomes);
		imprimirTodosNomes(nomes);
		imprimirDobroNumeros(numeros);
		
		List<String> profissoes = new ArrayList<>();
		profissoes.add("Desenvolvedor de Software");
		profissoes.add("Analista de Suporte");
		profissoes.add("Gerente de Projetos");
		profissoes.add("Gerente de Qualidade");
		
		profissoes.stream().filter(profissao -> profissao.startsWith("Gerente")).forEach(System.out::println);
	}
	
	public static void imprimirNomesFiltrados(String...nomes) {
		String nomesParaImprimirDoFor = "";
		
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Ezandro")) {
				nomesParaImprimirDoFor = nomes[i];
			}
		}
		
		System.out.println("Nomes imprimidos pelo for: " + nomesParaImprimirDoFor);
		
		String nomesParaImprimirDoStream = Stream.of(nomes).filter(nome -> nome.equals("Nayara")).collect(Collectors.joining());
		System.out.println("Nomes imprimidos pelo stream: " + nomesParaImprimirDoStream);
	}
	
	public static void imprimirTodosNomes(String...nomes)  {		
		Stream.of(nomes).forEach(System.out::println);
	}
	
	public static void imprimirDobroNumeros(Integer...numeros) {
		Stream.of(numeros).map(numero -> numero * 2).forEach(System.out::println);
	}
}
