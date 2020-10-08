package bootcamp.java.developer.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExerciseSet {

	public static void main(String[] args) {

		// Utilizando HashSet

		HashSet<Integer> numeros = new HashSet<>();

		// Adiciona 5 números inteiros no set
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(4);
		
		// Navega no set exibindo cada número no console
		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		System.out.println("----------");

		// Remove o primeiro item do set e exibe no console cada número do set
		System.out.println(numeros.remove(0));

		System.out.println("----------");

		// Adiciona um novo número no set e exibe no console cada número do set
		System.out.println(numeros.add(23));

		System.out.println("----------");

		// Verifica o tamanho do set e exibe no console
		System.out.println(numeros.size());

		System.out.println("----------");

		// Verifica se o set está vazio e exibe no console: true ou false
		System.out.println(numeros.isEmpty());

		System.out.println("----------");

		// Utilizando LinkedHashSet

		LinkedHashSet<Integer> novosNumeros = new LinkedHashSet<>();

		// Adiciona 5 números inteiros no set
		novosNumeros.add(5);
		novosNumeros.add(98);
		novosNumeros.add(15);
		novosNumeros.add(83);
		novosNumeros.add(1);

		// Navega no set exibindo cada número no console
		for (Integer numero : novosNumeros) {
			System.out.println(numero);
		}

		System.out.println("----------");

		// Remove o primeiro item do set e exibe no console cada número do set
		System.out.println(novosNumeros.remove(0));

		System.out.println("----------");

		// Adiciona um novo número no set e exibe no console cada número do set
		System.out.println(novosNumeros.add(23));

		System.out.println("----------");

		// Verifica o tamanho do set e exibe no console
		System.out.println(novosNumeros.size());

		System.out.println("----------");

		// Verifica se o set está vazio e exibe no console: true ou false
		System.out.println(novosNumeros.isEmpty());

		System.out.println("----------");
		
		// Utilizando TreeSet
		
		TreeSet<Integer> maisNumeros = new TreeSet<>();
		
		// Adiciona 5 números inteiros no set
		maisNumeros.add(5);
		maisNumeros.add(18);
		maisNumeros.add(95);
		maisNumeros.add(82);
		maisNumeros.add(87);

		// Navega no set exibindo cada número no console
		for (Integer numero : maisNumeros) {
			System.out.println(numero);
		}

		System.out.println("----------");

		// Remove o primeiro item do set e exibe no console cada número do set
		System.out.println(maisNumeros.remove(0));

		System.out.println("----------");

		// Adiciona um novo número no set e exibe no console cada número do set
		System.out.println(maisNumeros.add(23));

		System.out.println("----------");

		// Verifica o tamanho do set e exibe no console
		System.out.println(maisNumeros.size());

		System.out.println("----------");

		// Verifica se o set está vazio e exibe no console: true ou false
		System.out.println(maisNumeros.isEmpty());

		System.out.println("----------");

	}
}
