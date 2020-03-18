package com.bookflix.app.model;

import java.util.List;
import java.util.Map;

public interface IMovieService {

	List<Movie> findAllMovies();
	Movie findMoviesById(Long movieId);
	Movie createMovie(Movie m);
	void deleteMovie(Long movieId);
	Movie updateMovie(Movie movie, Long movieId);
	Movie updateMovie(Map<String, String> updates, Long movieId);	
	
}
