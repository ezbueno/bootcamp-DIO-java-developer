package bootcamp.java.developer.paradigma.funcional.aula1;

import java.util.function.UnaryOperator;

public class IntroParadigmaFuncional {

	public static void main(String[] args) {
		UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3;
		int valor = 10;
		System.out.println("O resultado é : " + calcularValorVezesTrinta.apply(valor));
	}
}
