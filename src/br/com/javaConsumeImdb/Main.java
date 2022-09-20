package br.com.javaConsumeImdb;

import br.com.javaConsumeImdb.Repository.MovieRepository;

public class Main {

	public static void main(String[] args) {
		MovieRepository repository = new MovieRepository();
		
		try {
			var movies = repository.getTop250Movies();
			
			System.out.println("Filmes encontrados com sucesso.");
			System.out.println(movies);
		} catch (Exception e) {
			System.out.println("Não foi possivel buscar os filmes.");
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
