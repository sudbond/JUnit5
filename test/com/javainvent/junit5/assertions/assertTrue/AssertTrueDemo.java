package com.javainvent.junit5.assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

public class AssertTrueDemo {

	@Test
	public void assertTrueWithNoMessage() {
		// getting the object of BookService class
		BookService bookService = new BookService();
		// creating a new object of book type
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		// adding the headFirstJavaBook to List by method call
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		// assertTrue(boolean conditon)
		// test case to check if listOfBooks list is empty or not
		// this will return either true or false
		assertTrue(listOfBooks.isEmpty());

	}

	@Test
	public void assertTrueWithMessage() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		//assertTrue(boolean condition, String message)
		// test case to check if listOfBooks list is empty or not
		// this will return either true or false and the custom message
		assertTrue(listOfBooks.isEmpty(), "List of Books is not Empty!");

	}

	@Test
	public void assertTrueWithMessageSupplier() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		//assertTrue(boolean condition, Supplier<String> messageSupplier)
		assertTrue(listOfBooks.isEmpty(), () -> "List of Book is not empty");

	}

	@Test
	public void assertTrueWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		//asertTrue(BooleanSupplier booleanSupplier)
		assertTrue(() -> listOfBooks.isEmpty());
	}

	@Test
	public void assertTrueWithBooleanSupplierAndMessage() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		//assertTrue(Boolean Supplier booleanSupplier, String message)
		assertTrue(() -> listOfBooks.isEmpty(), "List of Books is not Empty!");

	}

	@Test
	public void assertTrueWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		// assertTrue(BooleanSupplier booleanSupplier booleanSupplier, Supplier<String> messageSupplier)
		assertTrue(() -> listOfBooks.isEmpty(), () -> "List of Book is not empty");

	}
}
