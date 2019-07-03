package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
	Library booksSet = new Library("Library");

	@Before
	public void prepareTests() {
		LocalDate date = LocalDate.of(1990, 01, 01);
		IntStream.iterate(1, n -> n + 1)
			.limit(10)
			.forEach(n -> booksSet.getBooks().add(new Book("Title " + n, "Author " + n, date)));
	}

	@Test
	public void testShallowCopy() {
		//given
		Library clonedBooksSet = null;
		try {
			clonedBooksSet = booksSet.shallowCopy();
			clonedBooksSet.setName("Library 2");
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		System.out.println(booksSet);
		System.out.println(clonedBooksSet);
		//When
		//Then
		Assert.assertEquals(10, booksSet.getBooks().size());
		Assert.assertEquals(10, clonedBooksSet.getBooks().size());
	}

	@Test
	public void testDeepCopy() {
		//given
		Library clonedBooksSet = null;
		try {
			clonedBooksSet = booksSet.deepCopy();
			clonedBooksSet.setName("Library 2");
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		System.out.println(booksSet);
		System.out.println(clonedBooksSet);
		//When
		//Then
		Assert.assertEquals(10, booksSet.getBooks().size());
		Assert.assertEquals(10, clonedBooksSet.getBooks().size());
	}
}
