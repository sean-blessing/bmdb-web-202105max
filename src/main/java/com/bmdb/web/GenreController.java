package com.bmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bmdb.business.Genre;
import com.bmdb.db.GenreRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/genres")
public class GenreController {
	
	@Autowired
	private GenreRepo genreRepo;
	
	@GetMapping("/")
	public Iterable<Genre> getAll() {
		return genreRepo.findAll();
	}
}
