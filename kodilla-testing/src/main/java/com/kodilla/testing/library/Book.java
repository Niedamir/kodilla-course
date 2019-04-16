package com.kodilla.testing.library;

import java.util.Objects;

public class Book {
	String titile;
	String author;
	int publicatinYear;

	//CONSTRUCTOR
	public Book(String titile, String author, int publicatinYear) {
		this.titile = titile;
		this.author = author;
		this.publicatinYear = publicatinYear;
	}

	//EQUALS & HASH
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return publicatinYear == book.publicatinYear &&
			Objects.equals(titile, book.titile) &&
			Objects.equals(author, book.author);
	}
	@Override
	public int hashCode() {
		return Objects.hash(titile, author, publicatinYear);
	}

	//GETTERS
	public String getTitile() {
		return titile;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublicatinYear() {
		return publicatinYear;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Book{" +
			"titile='" + titile + '\'' +
			", author='" + author + '\'' +
			", publicatinYear=" + publicatinYear +
			'}';
	}
}
