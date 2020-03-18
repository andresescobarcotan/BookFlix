package com.bookflix.app.model;

public class Movie {
	public long id;
	private String title;
	private String cover;
	private String[] actors;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String[] getActors() {
		return actors;
	}
	public void setActors(String[] actors) {
		this.actors = actors;
	}
	
	public Movie(long id, String title, String[] actors, String cover)
	{
		super();
		this.id = id;
		this.title = title;
		this.actors = actors;
		this.cover = cover;
	}
	public Movie(Movie m) {
		this.id = m.getId();
		this.title = m.getTitle();
		this.cover = m.getCover();
		this.actors = m.getActors();
	}
	
	public Movie() {
		super();
	}
	
	
}
