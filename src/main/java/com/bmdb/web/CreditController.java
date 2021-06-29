package com.bmdb.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bmdb.business.Credit;
import com.bmdb.business.Movie;
import com.bmdb.db.CreditRepo;
import com.bmdb.db.MovieRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/credits")
public class CreditController {
	
	@Autowired
	private CreditRepo creditRepo;
	@Autowired
	private MovieRepo movieRepo;

	@GetMapping("/")
	public Iterable<Credit> getAll() {
		return creditRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Credit> get(@PathVariable Integer id) {
		return creditRepo.findById(id);
	}
	
	@PostMapping("/")
	public Credit add(@RequestBody Credit credit) {
		return creditRepo.save(credit);
	}
	
	@PutMapping("/")
	public Credit update(@RequestBody Credit credit) {
		return creditRepo.save(credit);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		creditRepo.deleteById(id);
	}
	
	// custom queries
	@GetMapping("/movie/{id}")
	public Iterable<Credit> getAllByMovie(@PathVariable int id) {
		//Optional<Movie> movie = movieRepo.findById(id);
		return creditRepo.findAllByMovieId(id);
	}
	
	
	
	
	
	
	
	
	
	

}
