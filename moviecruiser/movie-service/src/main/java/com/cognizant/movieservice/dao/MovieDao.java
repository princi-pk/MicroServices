package com.cognizant.movieservice.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.movieservice.model.Movie;

@Component
public interface MovieDao {
	public List<Movie> getMovieListAdmin();

	List<Movie> getMovieListCustomer();

	void modifyMovie(Movie movie);

	Movie getMovie(long movieId);

}
