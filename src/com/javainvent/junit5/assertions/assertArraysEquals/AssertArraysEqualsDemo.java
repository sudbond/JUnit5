package com.javainvent.junit5.assertions.assertArraysEquals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

public class AssertArraysEqualsDemo {
	@Test
	public void assertArrayEqualsWithNoMessage() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		bookService.addBook(headFirstJavascriptBook);
		// method call
		String[] actualBookIds = bookService.getBookIdsByPublisher("Wrox");
		assertArrayEquals(new String[] {"1","3"},actualBookIds);
	}

	@Test
	public void assertArrayEqualsWithMessage() {
		// creating instance of book service
				BookService bookService = new BookService();
				// creating two books
				Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
				Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
				Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");
				// adding the books to the list
				bookService.addBook(headFirstJavaBook);
				bookService.addBook(headFirstDesignBook);
				bookService.addBook(headFirstJavascriptBook);
				// method call
				String[] actualBookIds = bookService.getBookIdsByPublisher("Wrox");
				assertArrayEquals(new String[] {"1","3"},actualBookIds,"Book id didn't match");

	}

	@Test
	public void assertEqualsWithMessageSupplier() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		bookService.addBook(headFirstJavascriptBook);
		// method call
		String[] actualBookIds = bookService.getBookIdsByPublisher("Wrox");
		assertArrayEquals(new String[] {"1","2"},actualBookIds,()->"Book id didn't match");

	}
}
