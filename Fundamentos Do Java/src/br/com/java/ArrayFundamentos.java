package br.com.java;

public class ArrayFundamentos {

	public static void main(String[] args) {
		String time1 = "Corinthians";
		String time2 = "Palmeiras";
		String time3 = "Santos";
		String time4 = "São Paulo";
		System.out.println("Fundamentos do Array");
		System.out.println("Exemplo 1: Sem Array");
		System.out.println("Time: " + time3);
		//a linha abaixo cria um vetor simples
		String[] times = {"Corinthians","Palmeiras","Santos","São Paulo"};
		System.out.println("Exemplo 2: Com Array");
		// a linha abaixo recupera o conteudo do indice [0] do array
		System.out.println("Time: " + times[0]);
		// a linha abaixo modifica o cnteudo do indice [2] do array
		times[2] = "Flamengo";
		System.out.println("Exemplo 3: Modificando um Array");
		System.out.println("Time: " + times [2]);
		
	}

}
