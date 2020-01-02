package com.bolsadeideas.springboot.diapp.model;


public class Book {
	private long id;
	private String title;
	private String author;
	private String cover;
	
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public Long getId() {
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(long id, String title, String author, String cover) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.cover = cover;
	}
	public Book(Book b) {
		
		this.id = b.getId();
		this.title = b.getTitle();
		this.author = b.getAuthor();
		this.cover = b.getCover();
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}