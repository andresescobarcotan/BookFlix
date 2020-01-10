package com.bookflix.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
	private static final String MISSING_BOOK_COVER = "https://timedotcom.files.wordpress.com/2015/06/521811839-copy.jpg";
	List<Book> myListOfBooks=new ArrayList<Book>();
	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return this.myListOfBooks;
	}

	@Override
	public Book findBookById(Long bookId) {
		// TODO Auto-generated method stub
		Book recoveredBook = new Book();
		for( Book book: myListOfBooks) {
			if(bookId.compareTo(book.getId())==0) {
				recoveredBook = book;
			}
		}
		return recoveredBook;
	}

	@Override
	public Book createBook(Book b) {
		// TODO Auto-generated method stub
		b.setId(Long.valueOf(myListOfBooks.size()+1));
		if(b.getCover()==null) b.setCover(MISSING_BOOK_COVER);
		myListOfBooks.add(new Book(b));
		return myListOfBooks.get(myListOfBooks.size() -1);
	}

	@Override
	public void deleteBook(Long bookId) {
		Book deleted = this.findBookById(bookId);
		myListOfBooks.remove(deleted);
		
	}

	@Override
	public Book updateBook(Book book, Long bookId) {
		Book oldBook = this.findBookById(bookId);
		return book;
	}

	@Override
	public Book updateBook(Map<String, String> updates, Long bookId) {
		// TODO Auto-generated method stub
		Book recoveredBook = new Book();
		return recoveredBook;
	}

}
