package com.kodilla.stream.immutable;

public final class ForumUser {
	private final String userName;
	private final String realName;

	//CONSTRUCTOR
	public ForumUser(final String userName, final String realName) {
		this.userName = userName;
		this.realName = realName;
	}

	//GETTERS
	public String getUserName() {
		return userName;
	}
	public String getRealName() {
		return realName;
	}
}
