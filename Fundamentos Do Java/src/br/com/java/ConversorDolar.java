/** Code by: Diogo Diniz :)
 * 
 */

package br.com.java;

import java.util.Scanner;

public class ConversorDolar {

	public static void main(String[] args) {
		double dolar,real, conversor;
	
		Scanner teclado = new Scanner(System.in);
		real = 1;
		
		
		
		//Entrada1
		System.out.println("Digite o valor do dolar Hoje: ");
		dolar = teclado.nextDouble();
		
		
		//Conversor
		System.out.println("Valor do dolár: " + dolar);
		System.out.println("");
		System.out.println("Digite quantos Reais quer converter: ");
		real = teclado.nextDouble();
	
		
		//Saida
		conversor = dolar * real; 
		System.out.println("R$" + "Real em dólar : " + conversor);


	}

}
