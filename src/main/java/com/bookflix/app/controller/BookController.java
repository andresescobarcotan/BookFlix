package com.bookflix.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookflix.app.model.Book;
import com.bookflix.app.model.IBookService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/v2/books/")
public class BookController {
	@Autowired
	private IBookService bookService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
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
	
	@PutMapping("/{bookId}")
	public Book updateBook(@RequestBody Book book, @PathVariable Long bookId) {
	return bookService.updateBook(book, bookId);
	}
	@PatchMapping("/{bookId}")
	public Book updateBook(
	@RequestBody Map<String, String> updates,
	@PathVariable Long bookId) {
	return bookService.updateBook(updates, bookId);
	}
}
