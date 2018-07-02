package com.benfante.javacourse.thelibrary.core.model;

import java.util.Arrays;

public class Book {
	private long id;
	private String title;
	private float price;
	private Author[] authors;
	private Publisher publisher;

	public Book(long id, String title, Author[] authors) {
		this.id = id;
		this.title = title;
		this.authors = authors;
	}

	public Book(long id, String title, Author[] authors, float price) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.price = price;
	}

	public Book(long id, String title, Author[] authors, Publisher publisher, float price) {
		this.id = id;
		this.title = title;
		this.authors = authors;
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

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void addAuthor(Author author) {
		authors = expandArrayWithCopyOf();
		// authors = expandArrayWithFor();
		// authors = expandArrayWithArrayCopy();
		authors[authors.length - 1] = author;
	}

	@SuppressWarnings("unused")
	private Author[] expandArrayWithFor() {
		Author[] newAuthors = new Author[authors.length + 1];
		for (int i = 0; i < authors.length; i++) {
			newAuthors[i] = authors[i];
		}
		return newAuthors;
	}

	@SuppressWarnings("unused")
	private Author[] expandArrayWithArrayCopy() {
		Author[] newAuthors = new Author[authors.length + 1];
		System.arraycopy(authors, 0, newAuthors, 0, authors.length);
		return newAuthors;
	}

	private Author[] expandArrayWithCopyOf() {
		return Arrays.copyOf(authors, authors.length + 1);
	}

	public boolean hasAuthor(Author author) {
		boolean result = false;
		for (Author currAuthor : authors) {
			if (currAuthor.equals(author)) {
				result = true;
				break;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", author=" + Arrays.toString(authors) + ", publisher="
				+ publisher + "]";
	}

}
