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
		/*return client
				.send(request, BodyHandlers.ofString())
				.body();*/
		return """
				{
				    "items": [
				        {
				            "id": "tt0111161",
				            "rank": "1",
				            "title": "The Shawshank Redemption",
				            "fullTitle": "The Shawshank Redemption (1994)",
				            "year": "1994",
				            "image": "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_Ratio0.6716_AL_.jpg",
				            "crew": "Frank Darabont (dir.), Tim Robbins, Morgan Freeman",
				            "imDbRating": "9.2",
				            "imDbRatingCount": "2641222"
				        },
				        {
				            "id": "tt0068646",
				            "rank": "2",
				            "title": "The Godfather",
				            "fullTitle": "The Godfather (1972)",
				            "year": "1972",
				            "image": "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_Ratio0.7015_AL_.jpg",
				            "crew": "Francis Ford Coppola (dir.), Marlon Brando, Al Pacino",
				            "imDbRating": "9.2",
				            "imDbRatingCount": "1830893"
				        }
			       ]
		       }
			""";
	}
	
	private URI getURI() {
		String stringUri = "https://imdb-api.com/en/API/Top250Movies/" + this.apiKey;
		
		return URI.create(stringUri);
	}
}
