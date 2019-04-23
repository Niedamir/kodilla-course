package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
	int userID = 0;
	String userName = "";
	char sex ='M';
	LocalDate birthDate = null;
	int posts = 0;

	//CONSTRUCTOR
	public ForumUser(int userID, String userName, char sex, LocalDate birthDate, int posts) {
		this.userID = userID;
		this.userName = userName;
		this.sex = sex;
		this.birthDate = birthDate;
		this.posts = posts;
	}

	//GETTERS
	public int getUserID() {
		return userID;
	}
	public String getUserName() {
		return userName;
	}
	public char getSex() {
		return sex;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public int getPosts() {
		return posts;
	}

	//TO STRING
	@Override
	public String toString() {
		return "{userName='" + userName + '\'' +
			", sex=" + sex +
			", birthDate=" + birthDate +
			", posts=" + posts +
			'}';
	}
}
