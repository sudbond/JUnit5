package com.javainvent.junit5.bookstore.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.javainvent.junit5.bookstore.exception.BookNotFoundException;
import com.javainvent.junit5.bookstore.model.Book;

public class BookService {
	private List<Book> listOfBooks = new ArrayList<>();

	public void addBook(Book book) {
		listOfBooks.add(book);
	}

	public List<Book> book() {
		return Collections.unmodifiableList(listOfBooks);
	}
	
	public Book getBookById(String bookId) {
		for(Book book : listOfBooks) {
			if(bookId.equals(book.getBookId())) {
				return book;
			}
		}
		return null;
	}
	
	public String[] getBookIdsByPublisher(String Publisher) {
		List<String> bookIdStrings = new ArrayList<>();
		for(Book book : listOfBooks) {
			if(Publisher.equals(book.getPublisher())) {
				bookIdStrings.add(book.getBookId());
			}
		}
		return bookIdStrings.toArray(new String[bookIdStrings.size()]);
	}
	
	public List<String> getBookTitlesByPublisher(String Publisher) {
		List<String> bookTitles = new ArrayList<>();
		for(Book book : listOfBooks) {
			if(Publisher.equals(book.getPublisher())) {
				bookTitles.add(book.getTitle());
			}
		}
		return bookTitles;
	}
	
public Book GetBookByTitle(String title) {
	for(Book book : listOfBooks) {
		if(title.equals(book.getTitle())) {
			return book;
		}
	}
	throw new BookNotFoundException("Book not found in Book Store!");
}
	

}
