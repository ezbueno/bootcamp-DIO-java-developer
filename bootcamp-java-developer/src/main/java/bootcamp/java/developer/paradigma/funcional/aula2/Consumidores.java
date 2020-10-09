package bootcamp.java.developer.paradigma.funcional.aula2;

import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {
		Consumer<String> imprimeFrase = System.out::println;
		imprimeFrase.accept("Hello, world!");
		
		Consumer<String> imprimeFrase2 = frase -> System.out.println(frase);
		imprimeFrase2.accept("Olá, mundo!");
	}
}
