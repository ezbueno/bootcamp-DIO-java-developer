package bootcamp.java.developer.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Pamela");
		filaBanco.add("Patrícia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávia");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		
		System.out.println("----------");
		
		String clienteASerAtendido = filaBanco.poll();
		System.out.println(clienteASerAtendido);
		
		System.out.println(filaBanco);
		
		System.out.println("----------");
		
		//filaBanco.clear();
		
		String primeiroCliente = filaBanco.peek();
		System.out.println(primeiroCliente);
		
		System.out.println(filaBanco);
		System.out.println("----------");
			
		String primeiroClienteOuErro = filaBanco.element();
		System.out.println(primeiroClienteOuErro);
		
		System.out.println(filaBanco);
		System.out.println("----------");
		
		for (String client : filaBanco) {
			System.out.println(client);	
		}
		
		System.out.println("----------");
		
		Iterator<String> iteratorFilaBanco = filaBanco.iterator();
		
		while (iteratorFilaBanco.hasNext()) {
			System.out.println("---> " + iteratorFilaBanco.next());
		}
		
		System.out.println("----------");

	}

}
