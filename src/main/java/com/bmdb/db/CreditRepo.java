package com.bmdb.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bmdb.business.Credit;

public interface CreditRepo extends CrudRepository<Credit, Integer> {
	
	// get all credits by movie
	List<Credit> findAllByMovieId(int id);
	//List<Credit> findAllByMovie(Movie movie);  <- this also works
}
