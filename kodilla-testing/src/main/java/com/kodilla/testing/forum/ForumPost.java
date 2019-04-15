package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {
	String postBody;
	String author;

	//CONSTRUCTOR
	public ForumPost(String postBody, String author) {
		this.postBody = postBody;
		this.author = author;
	}

	//GETTERS
	public String getPostBody() {
		return postBody;
	}
	public String getAuthor() {
		return author;
	}

	//EQUALS & HASH
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		ForumPost forumPost = (ForumPost) o;
		return postBody.equals(forumPost.postBody) &&
			author.equals(forumPost.author);
	}
	@Override
	public int hashCode() {
		return Objects.hash(postBody, author);
	}
}
