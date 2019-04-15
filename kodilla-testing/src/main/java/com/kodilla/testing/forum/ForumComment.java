package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumComment {
	ForumPost forumPost;
	String commentBody;
	String author;

	//CONSTRUCTOR
	public ForumComment(ForumPost forumPost, String commentBody, String author) {
		this.forumPost = forumPost;
		this.commentBody = commentBody;
		this.author = author;
	}

	//GETTERS
	public ForumPost getForumPost() {
		return forumPost;
	}
	public String getCommentBody() {
		return commentBody;
	}
	public String getAuthor() {
		return author;
	}

	//EQUALS & HASH
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		ForumComment that = (ForumComment) o;
		return forumPost.equals(that.forumPost) &&
			commentBody.equals(that.commentBody) &&
			author.equals(that.author);
	}
	@Override
	public int hashCode() {
		return Objects.hash(forumPost, commentBody, author);
	}
}
