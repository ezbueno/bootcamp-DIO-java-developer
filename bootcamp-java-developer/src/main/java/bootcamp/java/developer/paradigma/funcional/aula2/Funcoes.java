package bootcamp.java.developer.paradigma.funcional.aula2;

import java.util.function.Function;

public class Funcoes {
	
	public static void main(String[] args) {
		Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
		System.out.println(retornaNomeAoContrario.apply("João"));
		
		Function<String, Integer> converteStringParaInteiro = string -> Integer.valueOf(string);
		System.out.println(converteStringParaInteiro.apply("20"));
	}
}
