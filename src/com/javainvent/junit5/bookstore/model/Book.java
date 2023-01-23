package com.javainvent.junit5.bookstore.model;

public class Book {
	private String bookId;
	private String title;
	private String publisher;

	public Book(String bookId, String title, String publisher) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTilte(String tilte) {
		this.title = tilte;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
