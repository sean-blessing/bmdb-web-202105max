package com.bmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bmdb.business.Genre;
import com.bmdb.business.MovieGenre;
import com.bmdb.db.GenreRepo;
import com.bmdb.db.MovieGenreRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/movie-genres")
public class MovieGenreController {
	
	@Autowired
	private MovieGenreRepo movieGenreRepo;
	@Autowired
	private GenreRepo genreRepo ;
	
	@GetMapping("/")
	public Iterable<MovieGenre> getAll() {
		return movieGenreRepo.findAll();
	}
	
	// get all movies for genre (String)
	@GetMapping("/genre")
	public Iterable<MovieGenre> getAllByGenreStr(@RequestParam String genreStr) {
		Genre genre = genreRepo.findByName(genreStr);
		return movieGenreRepo.findAllByGenreId(genre.getId());
	}
	
	
	
	
	
	
	
	
	
}
