package bootcamp.java.developer.paradigma.funcional.aula3;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExemplo {

	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("Ezandro", "Nayara", "Emnie");
		nomes.parallelStream().forEach(System.out::println);
	}
}
