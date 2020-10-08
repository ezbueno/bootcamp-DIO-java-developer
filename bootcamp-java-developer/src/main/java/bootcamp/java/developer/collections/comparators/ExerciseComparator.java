package bootcamp.java.developer.collections.comparators;

import java.util.ArrayList;
import java.util.List;

public class ExerciseComparator {
	
	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<>();
		
		// Adiciona os elementos na lista
		carros.add(new Carro("Mercedes", 2018));
		carros.add(new Carro("Fusca", 1980));
		carros.add(new Carro("Voyage", 1992));
		carros.add(new Carro("Toyota", 2020));
		carros.add(new Carro("Golf", 2010));
		
		// Ordenação usando a interface Comparator
		carros.sort((o1, o2) -> o1.compare(o1, o2));
		System.out.println(carros);
		
	}
}
