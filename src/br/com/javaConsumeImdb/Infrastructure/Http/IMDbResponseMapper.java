package br.com.javaConsumeImdb.Infrastructure.Http;

import java.util.List;

import com.google.gson.Gson;

import br.com.javaConsumeImdb.Domain.Movie;

public class IMDbResponseMapper {
	private List<Movie> items;
	
	public static List<Movie> map(String json) {
		return new Gson().fromJson(json, IMDbResponseMapper.class).items;
	}
}
