package bootcamp.java.developer.optional;

import java.util.Optional;

public class ExerciseOptional {
	
	public static void main(String[] args) {
		
		Optional<String> optionalVazio = Optional.empty();
		optionalVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
		
		Optional<String> optionalPresente = Optional.of("Optional presente");
		optionalPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Optional não presente"));
		
		if (optionalPresente.isPresent()) {
			String valor = optionalPresente.get();
			System.out.println("Valor: " + valor);
		}
		
		optionalPresente.map((valor) -> valor.concat(" ----*-*---- ")).ifPresent(System.out::println);
		
		Optional<String> optionalNull = Optional.empty();
		optionalNull.orElseThrow(IllegalStateException::new);		
	}
}
