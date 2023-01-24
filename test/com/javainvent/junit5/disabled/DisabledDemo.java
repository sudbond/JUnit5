package com.javainvent.junit5.disabled;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

@Disabled  // will disable all test cases
public class DisabledDemo {
	@Test
	@Disabled("skip until #98 issue has been fixed")
	public void assertEqualsWithNoMessage() {
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

		assertEquals("1", actualBook.getBookId());
		assertEquals("Head First", actualBook.getTitle());
	}

	@Test
	@Disabled
	public void assertEqualsWithMessage() {
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

		assertEquals("1", actualBook.getBookId());
		assertEquals("Head First", actualBook.getTitle(), "Book title didn't match");

	}

	@Test
	public void assertEqualsWithMessageSupplier() {
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
		assertEquals("1", actualBook.getBookId());
		assertEquals("Head First", actualBook.getTitle(), () -> "Book title didn't match");

	}

}
