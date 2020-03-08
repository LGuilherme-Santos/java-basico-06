package br.fai.projeto06;

public class Main {

	public static void main(String[] args) {
		
		
		Main app = new Main();
		app.start();
	}

	private void start() {
		System.out.println("Exercicio 06");
		
		String[] a = {"civic", "gol", "palio", "uno"};
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
	}
}
