package br.com.javaConsumeImdb.Repository;

import java.util.List;

import br.com.javaConsumeImdb.Domain.Movie;
import br.com.javaConsumeImdb.Infrastructure.Http.IMDbHttpRequest;
import br.com.javaConsumeImdb.Infrastructure.Http.IMDbResponseMapper;

public class MovieRepository {
	
	private IMDbHttpRequest request = new IMDbHttpRequest();
	
	public List<Movie> getTop250Movies() throws Exception {
		String result = request.getTop250Movies();
		
		return IMDbResponseMapper.map(result);
	}

}
