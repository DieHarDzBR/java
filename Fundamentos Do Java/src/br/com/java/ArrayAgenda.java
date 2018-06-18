package br.com.java;

public class ArrayAgenda {

	public static void main(String[] args) {

		String[][] contato = { { "Bill Gates", "1111-1111", "bill@outlook.com" },
				{ "Linus Torvald", "2222-2222", "linus@gmail.com" },
				{ "Steve Jobs", "3333-3333", "steve@icloud.com" } };

		// System.out.println("Recuperando E-mail do Linus: " + contato [1][2]);
		// contato [2][2] = "9999-9999";
		// System.out.println("Numero do Bill Gates modificado: " + contato [0][1])

		for (int i = 0; i < contato.length; i++) {
			System.out.println("__________________");
			for (int j = 0; j < contato.length; j++) {
				System.out.println(contato[i][j]);

			}

		}

	}
}
