package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

	private List<Book> generateListOfNBooks(int booksQuantity) {
		List<Book> resultList = new ArrayList<Book>();
		for(int n = 1; n <= booksQuantity; n++){
			Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
			resultList.add(theBook);
		}
		return resultList;
	}

	//SEARCH TESTS
	@Test //#1
	public void testListBooksWithConditionsReturnList() {
		// Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		List<Book> resultListOfBooks = new ArrayList<Book>();
		Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
		Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
		Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
		Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
		resultListOfBooks.add(book1);
		resultListOfBooks.add(book2);
		resultListOfBooks.add(book3);
		resultListOfBooks.add(book4);
		when(libraryDatabaseMock.listBooksWithCondition("Secret"))
			.thenReturn(resultListOfBooks);

		// When
		List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

		// Then
		assertEquals(4, theListOfBooks.size());
	}
	@Test //#2
	public void testListBooksWithConditionMoreThan20() {
		// Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		List<Book> resultListOf0Books = new ArrayList<Book>();
		List<Book> resultListOf15Books = generateListOfNBooks(15);
		List<Book> resultListOf40Books = generateListOfNBooks(40);
		when(libraryDatabaseMock.listBooksWithCondition(anyString()))
			.thenReturn(resultListOf15Books);
		when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
			.thenReturn(resultListOf0Books);
		when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
			.thenReturn(resultListOf40Books);

		// When
		List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
		List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
		List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
		// Then

		assertEquals(0, theListOfBooks0.size());
		assertEquals(15, theListOfBooks15.size());
		assertEquals(0, theListOfBooks40.size());
	}
	@Test //#3
	public void testListBooksWithConditionFragmentShorterThan3() {
		// Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		List<Book> resultListOf10Books = generateListOfNBooks(10);
		when(libraryDatabaseMock.listBooksWithCondition(anyString()))
			.thenReturn(resultListOf10Books);

		// When
		List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

		// Then
		assertEquals(0, theListOfBooks10.size());
		verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
	}

	//HANDS OFF TEST
	@Test //#1
	public void theListBooksInHandsOfZero() {
		//Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		LibraryUser user = new LibraryUser("Franciszek", "Rakoczi", "76032301676");
		List<Book> listOf0Books = new ArrayList<Book>();
		when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOf0Books);
		//When
		List<Book> outputList = bookLibrary.listBooksInHandsOf(user);
		//Then
		assertEquals(0, outputList.size());
	}
	@Test //#2
	public void theListBooksInHandsOfOne() {
		//Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		LibraryUser user = new LibraryUser("Franciszek", "Rakoczi", "76032301676");
		List<Book> listOf1Books = generateListOfNBooks(1);

		when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOf1Books);
		//When
		List<Book> outputList = bookLibrary.listBooksInHandsOf(user);
		//Then
		assertEquals(1, outputList.size());
	}
	@Test //#3
	public void theListBooksInHandsOfFive() {
		//Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		LibraryUser user = new LibraryUser("Franciszek", "Rakoczi", "76032301676");
		List<Book> listOf5Books = generateListOfNBooks(5);
		when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOf5Books);
		//When
		List<Book> outputList = bookLibrary.listBooksInHandsOf(user);
		//Then
		assertEquals(5, outputList.size());
	}
}