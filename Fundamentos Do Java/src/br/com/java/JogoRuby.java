package br.com.java;

import java.util.Scanner;

public class JogoRuby {

	public static void main(String[] args) {
		int nome;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bem vindo ao jogo da advinha��o.");
		System.out.println(" ");
		System.out.println("Qual � seu nome? ");
		nome = teclado.nextInt();
		System.out.println("Come�aremos o jogo para voc�: " + nome);
		
	}

}
