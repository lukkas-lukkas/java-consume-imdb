package br.com.javaConsumeImdb.Domain;

public class Movie {
	private String id;
	private String title;
	private String rank;
	private String year;
	
	public Movie(String id, String title, String rank, String year) {
		this.id = id;
		this.title = title;
		this.rank = rank;
		this.year = year;
	}

	@Override
	public String toString() {
		String base = "Titulo: %s, Ranking: %s, Ano: %s";
		return base.formatted(this.title, this.rank, this.year);
	}
}
