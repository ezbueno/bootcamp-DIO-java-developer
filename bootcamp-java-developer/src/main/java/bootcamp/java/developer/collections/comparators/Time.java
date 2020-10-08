package bootcamp.java.developer.collections.comparators;

public class Time implements Comparable<Time> {
	
	private String nome;
	private Integer tituloMundial;
	
	public Time(String nome, Integer tituloMundial) {
		this.nome = nome;
		this.tituloMundial = tituloMundial;
	}

	public String getNome() {
		return nome;
	}

	public Integer getTituloMundial() {
		return tituloMundial;
	}
	
	@Override
	public String toString() {
		return nome + " - " + tituloMundial;
	}

	@Override
	public int compareTo(Time o) {
		return this.getTituloMundial() - o.getTituloMundial();
	}
}
