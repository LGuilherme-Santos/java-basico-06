package br.fai.projeto06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Main app = new Main();
		app.start();
	}

	private void start() {
		System.out.println("Exercicio 06");
		System.out.println("");
		
		Scanner scan = new Scanner(System.in);
		String[] a = new String[4];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Nome do carro: ");
		a[i] = scan.next();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Nome do carro: ");
		a[i] = scan.next();
		}
		
		for(String carro: a){
						
			System.out.print(carro + " ");
		}
		System.out.println(" ");
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Nome do carro: ");
		a[i] = scan.next();
		}
		
		for(String carro: a){
						
			System.out.print(carro + " ");
		}
		
		
	}
}
