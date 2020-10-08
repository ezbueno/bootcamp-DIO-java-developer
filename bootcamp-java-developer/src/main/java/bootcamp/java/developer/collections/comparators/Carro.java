package bootcamp.java.developer.collections.comparators;

import java.util.Comparator;

public class Carro implements Comparator<Carro> {
	
	private final String marca;
	private final Integer ano;

	public Carro(String marca, Integer ano) {
		this.marca = marca;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public Integer getAno() {
		return ano;
	}
	
	@Override
	public String toString() {
		return marca + " - " + ano;
	}

	@Override
	public int compare(Carro o1, Carro o2) {
		return o1.getAno() - o2.getAno();
	}
}
