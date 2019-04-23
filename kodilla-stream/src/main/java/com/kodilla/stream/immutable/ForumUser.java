package com.kodilla.stream.immutable;

public final class ForumUser {
	private String userName = "";
	private String realName = "";

	//CONSTRUCTOR
	public ForumUser(String userName, String realName) {
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
