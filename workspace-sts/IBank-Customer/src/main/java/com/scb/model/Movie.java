package com.scb.model;

public class Movie {
	
	public String movieName;
	public int releaseYear;
	public String leadActor;
	public String leadActress;
	public String director;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActress() {
		return leadActress;
	}
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public Movie(String movieName, int releaseYear, String leadActor, String leadActress, String director) {
		super();
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.director = director;
	}
	
	public Movie() {
		super();
		
	}
	
}
