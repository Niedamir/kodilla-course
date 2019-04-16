package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
	String firstName;
	String lastName;
	String peselId;

	//CONSTRUCTOR
	public LibraryUser(String firstName, String lastName, String peselId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.peselId = peselId;
	}

	//EQUALS & HASH
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		LibraryUser that = (LibraryUser) o;
		return Objects.equals(firstName, that.firstName) &&
			Objects.equals(lastName, that.lastName) &&
			Objects.equals(peselId, that.peselId);
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, peselId);
	}

	//GETTERS
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPeselId() {
		return peselId;
	}

	// TO STRING
	@Override
	public String toString() {
		return "LibraryUser{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", peselId='" + peselId + '\'' +
			'}';
	}
}
