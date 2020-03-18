package com.bookflix.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookflix.app.model.Book;
import com.bookflix.app.model.IMovieService;
import com.bookflix.app.model.Movie;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/v2/movies/")
public class MoviesController {
	@Autowired
	private IMovieService movieService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Movie> findAllMovies() {
	return movieService.findAllMovies();
	}
	@GetMapping("/{movieId}")
	public Movie findMovie(@PathVariable Long movieId) {
	return movieService.findMoviesById(movieId);
	}
	@PostMapping(consumes = {"application/json"}) 
	public Movie createMovie(@RequestBody Movie movie) {
	return movieService.createMovie(movie);
	}
	@DeleteMapping("/{movieId}")
	public void deleteMovie(@PathVariable Long movieId) {
	movieService.deleteMovie(movieId);
	}
	
	@PutMapping("/{movieId}")
	public Movie updateMovie(@RequestBody Movie movie, @PathVariable Long movieId) {
	return movieService.updateMovie(movie, movieId);
	}
	@PatchMapping("/{movieId}")
	public Movie updateMovie(
	@RequestBody Map<String, String> updates,
	@PathVariable Long movieId) {
	return movieService.updateMovie(updates, movieId);
	}
}
