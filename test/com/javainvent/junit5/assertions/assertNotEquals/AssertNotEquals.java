package com.javainvent.junit5.assertions.assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

public class AssertNotEquals {
	@Test
	public void assertNotEqualsWithNoMessage() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		// method call
		Book actualBook = bookService.getBookById("1");

		assertNotEquals("3", actualBook.getBookId());

	}

	@Test
	public void assertNotEqualsWithMessage() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		// method call
		Book actualBook = bookService.getBookById("1");
		assertNotEquals("6", actualBook.getBookId(), "BookId matches to expected value!");

	}

	@Test
	public void assertNotEqualsWithMessageSupplier() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		// method call
		Book actualBook = bookService.getBookById("1");
		assertNotEquals("5", actualBook.getBookId(), () -> "BookId matches to expected value!");

	}
}
