package com.stackroute.collections;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */
public class MovieService {

	/**
	 * Constructor to create movieMap as an empty LinkedHashMap object
	 */
	Map<Movie, Integer> movies = new LinkedHashMap<>();

	public MovieService() {
	}

	/*
	 * Returns the movieMap object
	 */
	public Map<Movie, Integer> getMovieMap() {
		return movies;
	}

	/*
	 * Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
	 */
	public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
		movies.put(movie, rating);
		return movies.entrySet();
	}

	/*
	 * Return Set of movie names having rating greater than or equal to given rating
	 */
	public List<String> getHigherRatedMovieNames(int rating) {
		List<String> ratedMovies = new ArrayList<>();
		for (Movie mov : movies.keySet()) {
			if (movies.get(mov) >= rating) {
				ratedMovies.add(mov.getMovieName());
			}
		}
		return ratedMovies;
	}

	/*
	 * Return Set of movie names belonging to specific genre
	 */
	public List<String> getMovieNamesOfSpecificGenre(String genre) {
		List<String> genreMovies = new ArrayList<>();
		for (Movie mov : movies.keySet()) {
			if (mov.getGenre().equalsIgnoreCase(genre)) {
				genreMovies.add(mov.getMovieName());
			}
		}
		return genreMovies;
	}

	/*
	 * Return Set of movie names which are released after Specific releaseDate and
	 * having rating less than or equal to 3
	 */

	public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
		List<String> ans = new LinkedList<>();
		for (Movie movie : movies.keySet()) {
			//
			if (movie.getReleaseDate().isAfter(releaseDate) && movies.get(movie) <= 3) {
				ans.add(movie.getMovieName());
			}
		}
		return ans;
	}

	/*
	 * Return set of movies sorted by release dates in ascending order. Hint: Use
	 * TreeMap
	 */
	public List<Movie> getSortedMovieListByReleaseDate() {
		List<Movie> data = new LinkedList<>();
		Comparator<Movie> com = (m1, m2) -> m1.getReleaseDate().compareTo(m2.getReleaseDate());
		TreeMap<Movie, Integer> sortedMovieList = new TreeMap<>(com);

		for (Movie mov : movies.keySet()) {

			sortedMovieList.put(mov, movies.get(mov));
		}

		for (Movie movie : sortedMovieList.keySet()) {
			data.add(movie);
		}
		return data;
	}

	/*
	 * Return set of movies sorted by rating. Hint: Use Comparator and LinkedHashMap
	 */
	public Map<Movie, Integer> getSortedMovieListByRating() {
		ArrayList<Entry<Movie, Integer>> movieData = new ArrayList<>(movies.entrySet());
		Collections.sort(movieData, (mov, mov2) -> {
			return ((Comparable) ((Map.Entry) (mov)).getValue()).compareTo(((Map.Entry) (mov2)).getValue());
		});

		HashMap data = new LinkedHashMap();
		Iterator it = movieData.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();

			data.put(entry.getKey(), entry.getValue());
		}
		return data;
	}
}
