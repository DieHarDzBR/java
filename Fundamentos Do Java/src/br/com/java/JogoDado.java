package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner(System.in);
		do {
// a linha abaixo usa a classe Random para crair um objeto que ser� usado para gerar n�meros aleat�rios.
			Random dado = new Random();
			int face = dado.nextInt(6) + 1; //gerar numeros aleatorios (0 a 5) somamos 1 ao resultado pois nao existe a face 0 no dado
			System.out.println("Face do dado: " + face);
			System.out.println("Quer jogar de novo (s/n)?");
			opcao = teclado.next().charAt(0);
			//charAt(0) captura apenas a 1a letra do que foi digitado
			
			
		}while(opcao == 's');

	}

}
