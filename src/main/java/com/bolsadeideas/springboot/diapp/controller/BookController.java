package com.bolsadeideas.springboot.diapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.diapp.model.Book;
import com.bolsadeideas.springboot.diapp.model.BookService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping
	public List<Book> findAllBooks() {
	return bookService.findAllBooks();
	}
	@GetMapping("/{bookId}")
	public Book findBook(@PathVariable Long bookId) {
	return bookService.findBookById(bookId);
	}
	@PostMapping(consumes = {"application/json"}) 
	public Book createBook(@RequestBody Book book) {
	return bookService.createBook(book);
	}
	@DeleteMapping("/{bookId}")
	public void deleteBook(@PathVariable Long bookId) {
	bookService.deleteBook(bookId);
	}
	/*
	@PutMapping("/{bookId}")
	public Book updateBook(@RequestBody Book book, @PathVariable Long bookId) {
	return bookService.updateBook(book, bookId);
	}
	@PatchMapping("/{bookId}")
	public Book updateBook(
	@RequestBody Map<String, String> updates,
	@PathVariable Long bookId) {
	return bookService.updateBook(updates, bookId);
	}*/
}
