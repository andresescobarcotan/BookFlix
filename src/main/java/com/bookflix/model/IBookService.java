package com.bookflix.model;

import java.util.List;
import java.util.Map;

public interface IBookService {
	List<Book> findAllBooks();
	Book findBookById(Long bookId);
	Book createBook(Book b);
	void deleteBook(Long bookId);
	Book updateBook(Book book, Long bookId);
	Book updateBook(Map<String, String> updates, Long bookId);	
}
