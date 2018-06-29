package com.benfante.javacourse.thelibrary.core.app;

import com.benfante.javacourse.thelibrary.core.model.Book;

public class Library {

	public static void main(String[] args) {
		Book book1 = new Book(0, "Dieci Piccoli Indiani", "Agatha Christie");
		Book book2 = new Book(1, "Assassinio sull'Orient Express", "Agatha Christie", 10.50f);
		Book book3 = new Book(2, "Herry Potter", "J.K. Rowling", 15.45f);

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3);

	}

}
