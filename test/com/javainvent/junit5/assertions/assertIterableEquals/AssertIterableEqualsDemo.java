package com.javainvent.junit5.assertions.assertIterableEquals;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

public class AssertIterableEqualsDemo {
	@Test
	public void assertIterableEqualsWithNoMessage() {
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
		List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("Head First Java");
		expectedTitles.add("Head First Javascript");
		
		assertIterableEquals(expectedTitles,actualTitles);
	}

	@Test
	public void assertIterableEqualsWithMessage() {
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
				List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
				List<String> expectedTitles = new ArrayList<>();
				expectedTitles.add("Head First Java");
				expectedTitles.add("Head First Javascript");
				expectedTitles.add("Head First Javascript and Java");
				
				assertIterableEquals(expectedTitles,actualTitles,"Book Titles didn't match");

	}

	@Test
	public void assertIterableEqualsWithMessageSupplier() {
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
		List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("Head First Java");
		expectedTitles.add("Head First Javascript");
		expectedTitles.add("Head First Javascript and Java");
		
		assertIterableEquals(expectedTitles,actualTitles,()->"Book Titles didn't match");

	}
}
