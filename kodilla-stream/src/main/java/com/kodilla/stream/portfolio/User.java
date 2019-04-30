package com.kodilla.stream.portfolio;

import java.util.Objects;

public final class User {
	private final String username;
	private final String realName;

	//CONSTRUCTOR
	public User(final String username, final String realName) {
		this.username = username;
		this.realName = realName;
	}

	//GETTERS
	public String getUsername() {
		return username;
	}
	public String getRealName() {
		return realName;
	}

	//TO STRING
	@Override
	public String toString() {
		return "User{" +
			"username='" + username + '\'' +
			'}';
	}

	//EQUALS
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(username, user.username);
	}
}
