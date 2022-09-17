package br.com.javaConsumeImdb.Infrastructure.Http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class IMDbHttpRequest {
	private String apiKey = System.getenv("IMDB_API_KEY");
	
	private HttpClient client;
	private HttpRequest request;
	
	public IMDbHttpRequest() {
		this.client = HttpClient.newHttpClient();
		this.request = HttpRequest
				.newBuilder()
				.uri(this.getURI())
				.GET()
				.build();
	}

	public String search() throws Exception {
		return client
				.send(request, BodyHandlers.ofString())
				.body();
	}
	
	private URI getURI() {
		String stringUri = "https://imdb-api.com/en/API/Top250Movies/" + this.apiKey;
		
		return URI.create(stringUri);
	}
}
