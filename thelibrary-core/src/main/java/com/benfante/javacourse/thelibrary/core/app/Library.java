package com.benfante.javacourse.thelibrary.core.app;

import com.benfante.javacourse.thelibrary.core.model.Author;
import com.benfante.javacourse.thelibrary.core.model.Book;
import com.benfante.javacourse.thelibrary.core.model.Publisher;

public class Library {

	public static void main(String[] args) {
		Author agathaChristie = new Author(0, "Agatha", "Cristie");
		Publisher harperCollins = new Publisher(0, "HarperCollins");
		Book book1 = new Book(0, "Dieci Piccoli Indiani", agathaChristie, harperCollins, 0.0f);
		Book book2 = new Book(1, "Assassinio sull'Orient Express", agathaChristie, harperCollins, 10.50f);
		Author jkRowling = new Author(1, "J.K.", "Rowling");
		Publisher bloomsbury = new Publisher(1, "Bloomsbury");
		Book book3 = new Book(2, "Herry Potter", jkRowling, bloomsbury, 15.45f);

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3);

	}

}
