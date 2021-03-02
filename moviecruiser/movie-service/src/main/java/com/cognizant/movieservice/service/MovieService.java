package com.cognizant.movieservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.movieservice.MovieServiceApplication;
import com.cognizant.movieservice.dao.MovieDao;
import com.cognizant.movieservice.model.Movie;

@Service
public class MovieService {
	private static Logger LOGGER = LoggerFactory.getLogger(MovieServiceApplication.class);

	@Autowired
	private MovieDao movieDao;

	public MovieDao getMovieDao() {
		return movieDao;
	}

	public void setMovieDao(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	public List<Movie> getMovieListAdmin() {
		LOGGER.info("START");
		LOGGER.info("END");
		return movieDao.getMovieListAdmin();

	}

	public List<Movie> getMovieListCustomer() {
		LOGGER.info("START");
		LOGGER.info("END");
		return movieDao.getMovieListCustomer();

	}

	public void modifyMovie(Movie movie) {
		LOGGER.info("START");
		LOGGER.info("END");
		movieDao.modifyMovie(movie);
	}

	public Movie getMovie(long movieId) {
		LOGGER.info("START");
		LOGGER.info("END");
		return movieDao.getMovie(movieId);

	}

}
