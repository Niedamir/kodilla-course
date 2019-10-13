package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
	@Test
	public void publicationYearMedianTest() {
		//Given
		MedianAdapter adapter = new MedianAdapter();
		Set<Book> bookSet = new HashSet();
		bookSet.add(new Book("J.R.R. Tolkien", "Hobbit", 1990, "libA01"));
		bookSet.add(new Book("R. Wegner", "Opowieści z Meekhańskiego pogranicza", 2010, "libA02"));
		bookSet.add(new Book("H. Sienkiewicz", "Ogniem i mieczem", 2000, "libA03"));
		//When
		int median = adapter.publicationYearMedian(bookSet);
		//Then
		System.out.println(median);
		assertEquals(2000, median);
	}
}