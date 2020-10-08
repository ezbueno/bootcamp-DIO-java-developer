package bootcamp.java.developer.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciseQueue {

	public static void main(String[] args) {
		
		Queue<String> nomes = new LinkedList<>();
		
		// Adiciona 5 nomes na fila
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		// Navega na fila exibindo cada nome no console
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("----------");
		
		// Retorna o primeiro item da fila, sem removê-lo e exibe no console
		System.out.println(nomes.peek());
		
		System.out.println("----------");
		
		// Retorna o primeiro intem da fila, removendo o mesmo e exibe no console
		System.out.println(nomes.poll());
		
		System.out.println("----------");
		
		// Adiciona um novo nome
		nomes.add("Daniel");
		
		// Verifica a posição que o mesmo assumiu na fila exibindo no console
		System.out.println(nomes);
		
		System.out.println("----------");
		
		// Retorna o tamanho da lista e exibe no console
		System.out.println("Tamanho da lista: " + nomes.size());
		
		System.out.println("----------");
		
		// Verifica se a lista está vazia e exibe no console: true ou false
		System.out.println(nomes.isEmpty());
		
		System.out.println("----------");
		
		// Verifica se o nome Carlos está na lista e exibe no console: true ou false
		System.out.println(nomes.contains("Carlos"));		
	}
}
