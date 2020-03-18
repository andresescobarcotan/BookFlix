package com.bookflix.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class MovieService implements IMovieService {

	private static final String MISSING_MOVIE_COVER = "https://timedotcom.files.wordpress.com/2015/06/521811839-copy.jpg";
	List<Movie> myListOfMovies=new ArrayList<Movie>();
	
	@PostConstruct
    void init() {
        this.myListOfMovies = new ArrayList<>();
        String[] actors = {"Humprey Bogart"};
        
        Movie casablanca = new Movie(0,"Casablanca",actors, MISSING_MOVIE_COVER);
        myListOfMovies.add(casablanca);
    }
	@Override
	public List<Movie> findAllMovies() {
		System.out.println("List of movies have been requested");
		return myListOfMovies;
	}

	@Override
	public Movie findMoviesById(Long movieId) {
		// TODO Auto-generated method stub
		Movie recoveredMovie = new Movie();
		for(Movie movie: myListOfMovies) {
			if(movieId.compareTo(movie.getId())==0) {
				recoveredMovie = movie;
			}
		}
		return recoveredMovie;
	}

	@Override
	public Movie createMovie(Movie m) {
		// TODO Auto-generated method stub
		m.setId(Long.valueOf(myListOfMovies.size()+1));
		if(m.getCover()==null) m.setCover(MISSING_MOVIE_COVER);
		myListOfMovies.add(new Movie(m));
		return myListOfMovies.get(myListOfMovies.size() -1);
	}

	@Override
	public void deleteMovie(Long movieId) {
		Movie deleted = this.findMoviesById(movieId);
		myListOfMovies.remove(deleted);

	}

	@Override
	public Movie updateMovie(Movie movie, Long movieId) {
		Movie oldMovie = this.findMoviesById(movieId);
		return movie;
	}

	@Override
	public Movie updateMovie(Map<String, String> updates, Long movieId) {
		// TODO Auto-generated method stub
		Movie recoveredMovie = new Movie();
		return recoveredMovie;
	}

}
