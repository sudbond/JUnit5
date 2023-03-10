package com.javainvent.junit5.assertions.assertTimeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

public class AssertTimoutDemo {
	@Test
	public void assertTimeoutWithNoMessage() {
		BookService bookService = new BookService();
		for (int i = 1; i <= 10000; i++) {
			bookService.addBook(new Book(String.valueOf(i), "Head First Java", "Wrox"));
		}
		List<String> actualTitles = new ArrayList<>();

		assertTimeout(Duration.ofMillis(1), () -> {
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		});

		assertEquals(10000, actualTitles.size());
	}

	@Test
	public void assertTimeoutWithMessage() {
		BookService bookService = new BookService();
		for (int i = 1; i <= 10000; i++) {
			bookService.addBook(new Book(String.valueOf(i), "Head First Java", "Wrox"));
		}
		List<String> actualTitles = new ArrayList<>();

		assertTimeout(Duration.ofMillis(1), () -> {
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		}, "Performance issues with getBookTitlesByPublisher");

		assertEquals(10000, actualTitles.size());
	}
	
	@Test
	public void assertTimeoutWithMessageSupplier() {
		BookService bookService = new BookService();
		for (int i = 1; i <= 1000; i++) {
			bookService.addBook(new Book(String.valueOf(i), "Head First Java", "Wrox"));
		}
		List<String> actualTitles = new ArrayList<>();

		assertTimeout(Duration.ofMillis(1), () -> {
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		}, ()->"Performance issues with getBookTitlesByPublisher");

		assertEquals(1000, actualTitles.size());
	}
}
