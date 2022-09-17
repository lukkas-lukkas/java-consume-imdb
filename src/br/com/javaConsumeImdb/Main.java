package br.com.javaConsumeImdb;

import br.com.javaConsumeImdb.Infrastructure.Http.IMDbHttpRequest;

public class Main {

	public static void main(String[] args) {
		IMDbHttpRequest request = new IMDbHttpRequest();
		
		try {
			String result = request.search();
			
			System.out.println("Filmes encontrados com sucesso.");
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Não foi possivel buscar os filmes.");
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
