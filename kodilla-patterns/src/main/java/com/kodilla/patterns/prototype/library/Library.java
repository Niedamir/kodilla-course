package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
	private String name;
	Set<Book> books = new HashSet<>();
	LocalDate date = LocalDate.of(1990, 01, 01);

	public Library(final String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Set<Book> getBooks() {
		return books;
	}

	public Library shallowCopy() throws CloneNotSupportedException {
		return (Library) super.clone();
	}

	public Library deepCopy() throws CloneNotSupportedException {
		Library clonedLibrary = (Library)super.clone();
		clonedLibrary.books = new HashSet<>();
		for(Book book : books) {
			clonedLibrary.getBooks().add(book);
		}
		return clonedLibrary;
	}

	@Override
	public String toString() {
		return "Library{" + "name='" + name + '\'' + ", books=" + books + '}';
	}
}