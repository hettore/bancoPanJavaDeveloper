package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		livros livros = new livros();
		
//		int a = 2;
//		int b = 3;
//		System.out.println("Hettore diz - Hello World e a + b = " + ( a + b ));
		
		System.out.println(gato);
		System.out.println(livros);
		
	}

}

class livros {
	private String nome;
	private String npag;
}