package com.benfante.javacourse.thelibrary.core.model;

public class Book {
	private long id;
	private String title;
	private float price;
	private Author author;
	private Publisher publisher;

	public Book(long id, String title, Author author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public Book(long id, String title, Author author, float price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book(long id, String title, Author author, Publisher publisher, float price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", author=" + author + ", publisher="
				+ publisher + "]";
	}

}
