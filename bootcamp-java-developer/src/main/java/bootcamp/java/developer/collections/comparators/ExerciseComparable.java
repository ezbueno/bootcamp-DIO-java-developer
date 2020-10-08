package bootcamp.java.developer.collections.comparators;

import java.util.ArrayList;
import java.util.List;

public class ExerciseComparable {

	public static void main(String[] args) {
		
		List<Time> times = new ArrayList<>();
		
		// Adiciona os elementos na lista
		times.add(new Time("São Paulo", 3));
		times.add(new Time("Santos", 2));
		times.add(new Time("Corinthians", 2));
		times.add(new Time("Internacional", 1));
		times.add(new Time("Flamengo", 1));
		times.add(new Time("Grêmio", 1));
		
		// Ordenação usando a interface Comparable
		times.sort((t1, t2) -> t1.compareTo(t2));
		
		System.out.println(times);
	}
}
