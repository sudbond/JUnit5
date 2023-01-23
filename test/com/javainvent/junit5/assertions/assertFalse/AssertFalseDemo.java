package com.javainvent.junit5.assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

public class AssertFalseDemo {
	@Test
	public void assertFalseWithNoMessage() {
		// getting the object of BookService class
		BookService bookService = new BookService();
		// creating a new object of book type
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		// adding the headFirstJavaBook to List by method call
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		// assertFalse(boolean conditon)
		// test case to check if listOfBooks list is empty or not
		// this will return either true or false
		assertFalse(listOfBooks.isEmpty());

	}

	@Test
	public void assertFalseWithMessage() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		// assertFalse(boolean condition, String message)
		// test case to check if listOfBooks list is empty or not
		// this will return either true or false and the custom message
		assertFalse(listOfBooks.isEmpty(), "List of Books is not Empty!");

	}

	@Test
	public void assertTrueWithMessageSupplier() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		// assertFalse(boolean condition, Supplier<String> messageSupplier)
		assertFalse(listOfBooks.isEmpty(), () -> "List of Book is not empty");

	}

	@Test
	public void assertFalseWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		// assertFalse(BooleanSupplier booleanSupplier)
		assertFalse(() -> listOfBooks.isEmpty());
	}

	@Test
	public void assertFalseWithBooleanSupplierAndMessage() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		// assertFalse(Boolean Supplier booleanSupplier, String message)
		assertFalse(() -> listOfBooks.isEmpty(), "List of Books is not Empty!");

	}

	@Test
	public void assertFalseWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.book();
		// assertFalse(BooleanSupplier booleanSupplier booleanSupplier, Supplier<String>
		// messageSupplier)
		assertFalse(() -> listOfBooks.isEmpty(), () -> "List of Book is not empty");

	}
}
