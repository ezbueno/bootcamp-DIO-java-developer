package bootcamp.java.developer.paradigma.funcional.aula3;

public class ThreadExemplo {

	public static void main(String[] args) {
		GeradorPDF geradorPDF = new GeradorPDF();
		BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento();
		
		geradorPDF.start();
		barraDeCarregamento.start();
	}
}

class GeradorPDF extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PDF gerado");
	}
}

class BarraDeCarregamento extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Loading...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class BarraDeCarregamento2 implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Executando BarraDeCarregamento2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class BarraDeCarregamento3 implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Executando BarraDeCarregamento3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}