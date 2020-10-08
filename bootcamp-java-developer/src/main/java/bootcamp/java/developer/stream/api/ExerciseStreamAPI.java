package bootcamp.java.developer.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseStreamAPI {
	
	public static void main(String[] args) {
		
		Estudante e1 = new Estudante();
		e1.setNome("Nayara");
		e1.setIdade(26);
		
		Estudante e2 = new Estudante();
		e2.setNome("Camila");
		e2.setIdade(16);
		
		Estudante e3 = new Estudante();
		e3.setNome("Emnie");
		e3.setIdade(19);
		
		Estudante e4 = new Estudante();
		e4.setNome("Camila");
		e4.setIdade(18);
		
		List<Estudante> estudantes = new ArrayList<>();
		estudantes.add(e1);
		estudantes.add(e2);
		estudantes.add(e3);
		estudantes.add(e4);
		
		// Retorna a quantidade de estudantes na lista
		System.out.println(estudantes.stream().count());
		
		// Retorna a quantidade de estudantes com idade igual ou superior a 18
		System.out.println(estudantes.stream().filter((estudante -> estudante.getIdade() >= 18)).collect(Collectors.toList()));
		
	}
}
