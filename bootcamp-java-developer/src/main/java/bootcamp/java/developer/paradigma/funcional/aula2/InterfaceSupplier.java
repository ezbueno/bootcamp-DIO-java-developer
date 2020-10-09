package bootcamp.java.developer.paradigma.funcional.aula2;

import java.util.function.Supplier;

public class InterfaceSupplier {

	public static void main(String[] args) {
		Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
		System.out.println(instanciaPessoa.get());
		
		// Method Reference
		Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
		System.out.println(instanciaPessoa2.get());
	}
}

class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		nome = "João";
		idade = 20;
	}
	
	@Override
	public String toString() {
		return String.format("nome : %s, idade: %d", nome, idade);
	}
}
