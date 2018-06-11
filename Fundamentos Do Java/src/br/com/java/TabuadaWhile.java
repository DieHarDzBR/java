
package br.com.java;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int valor, i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("______Tabuada_______");
		System.out.println("");
		System.out.println("Digite o valor da tabuada:");
		valor = teclado.nextInt();
		i = 1;

		while (i < 11) {
		

			System.out.println(valor + " x " + i + " = " + (valor * i));
			i++;

		}

	}

}
