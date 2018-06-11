package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a opção desejada: ");
		
		
		
		
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			pedra(); //Executando o método
			break;
		case 2:
			papel(); //Executando o método
			break;
		case 3:
			tesoura();
			break;
		default: //caso nenhuma opção selecionada\
			System.out.println("Opção Inválida");
			continue;
		}
	}
	// Criando um metodo
	static void pedra() {
		System.out.println("Voce jogou pedra");
	}
	// Criando um metodo
		static void papel() {
			System.out.println("Voce jogou papel");
		}
	static void tesoura() {
		System.out.println("Voce jogou tesoura");
		Random dado = new Random();
		int face = dado.nextInt(6) + 1; //gerar numeros aleatorios (0 a 5) somamos 1 ao resultado pois nao existe a face 0 no dado
		System.out.println("Face do dado: " + face);
		System.out.println("Quer jogar de novo (s/n)?");
		opcao = teclado.next().charAt(0);
	
		
		//************************************
		int x = 11;
		int y = 11;
				while (x < 10) {
					System.out.println("caraio do xis");
					x++;
				}
					System.out.println("");
					do {
						System.out.println("carai do ispilo");
						y++;
					}	while (y < 10);
	}
}
		
		