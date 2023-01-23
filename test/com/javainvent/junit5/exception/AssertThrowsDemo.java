package com.javainvent.junit5.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.javainvent.junit5.bookstore.exception.BookNotFoundException;
import com.javainvent.junit5.bookstore.model.Book;
import com.javainvent.junit5.bookstore.service.BookService;

public class AssertThrowsDemo {
	@Test
	public void assertThorwsWithNoMessage() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		BookNotFoundException bookNotFoundException = assertThrows(BookNotFoundException.class,
				() -> bookService.GetBookByTitle("Head First Spring"));
		assertEquals("Book not found in Book Store!", bookNotFoundException.getMessage());
		// assertThrows(NullPointerException.class, () ->
		// bookService.GetBookByTitle("Head First Spring"));
	}

	@Test
	public void assertThorwsWithMessage() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		assertThrows(NullPointerException.class, () -> bookService.GetBookByTitle("Head First Spring"),
				"Different exception thrown!");

	}

	@Test
	public void assertThorwsWithMessageSupplier() {
		// creating instance of book service
		BookService bookService = new BookService();
		// creating two books
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		// adding the books to the list
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		assertThrows(NullPointerException.class, () -> bookService.GetBookByTitle("Head First Spring"),
				() -> "Different exception thrown!");

	}

}
