package com.scb.SBSamples;

import java.util.ArrayList;
import java.util.Collection;

//import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.model.Movie;
@RestController
public class GetMovieData {
	
	private ArrayList<Movie> ar;

	@RequestMapping("/")
	public ArrayList<Movie> getMovieDetails()
	{
		//return "Movie details to be fetched";
		Movie Basha = new Movie( "Basha", 1996, "Rajinikanth", "Nagma", "SureshKrishna");
		Movie Thalapathy = new Movie( "Thalapathy", 1994, "Rajinikanth", "Nagma", "Maniratnam");
		//Collection movies = new Collection();
		ar = new ArrayList<Movie>();
		ar.add(Basha);
		ar.add(Thalapathy);
		return ar;
	}

	
}
