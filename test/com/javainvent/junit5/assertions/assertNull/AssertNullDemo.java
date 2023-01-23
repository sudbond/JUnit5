package com.javainvent.junit5.assertions.assertNull;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

public class AssertNullDemo {

	@Test
	public void assertNUllWithNoMessage() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		// method call
		Book actualBook = bookService.getBookById("3");
		// checking if actual book with id 3 is present or not
		assertNull(actualBook);
	}

	@Test
	public void assertNUllWithMessage() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		// method call
		Book actualBook = bookService.getBookById("2");
		// checking if actual book with id 2 is present or not
		assertNull(actualBook, "Book is not null");

	}

	@Test
	public void assertNUllWithMessageSupplier() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		// method call
		Book actualBook = bookService.getBookById("2");
		// checking if actual book with id 2 is present or not
		assertNull(actualBook, () -> "Book is not null");

	}

}
