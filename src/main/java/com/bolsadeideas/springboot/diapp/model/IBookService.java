package com.bolsadeideas.springboot.diapp.model;

import java.util.List;

public interface IBookService {

	List<Book> findAllBooks();
	Book findBookById(Long bookId);
	Book createBook(Book b);
	void deleteBook(Long bookId);
//	Book updateBook(Book book, Long bookId);
//	Book updateBook(Map<String, String> updates, Long bookId);
	
	
}
