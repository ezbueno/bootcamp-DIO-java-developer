package bootcamp.java.developer.paradigma.funcional.aula1;

public class FuncaoComLambda {

	public static void main(String[] args) {
		Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
		System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
	}
}
