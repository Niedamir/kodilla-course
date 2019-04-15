package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
	int users = 0;
	int posts = 0;
	int comments = 0;
	double postPerUser = 0;
	double commentsPerUser = 0;
	double commentsPerPost = 0;

	public void calculateAdvStatistics(Statistics statistics) {
		List<String> usersList = statistics.usersNames();
		users = usersList.size();
		posts = statistics.postsCount();
		comments = statistics.commentsCount();

		if(users != 0) {
			postPerUser = posts / users;
		}else {
			postPerUser = 0;
		}
		if(users != 0) {
			commentsPerUser = comments / users;
		}else {
			commentsPerUser = 0;
		}
		if(posts != 0) {
			commentsPerPost = comments / posts;
		}else {
			commentsPerPost = 0;
		}
	}

	//GETTERS
	public int getUsers() {
		return users;
	}
	public int getPosts() {
		return posts;
	}
	public int getComments() {
		return comments;
	}
	public double getPostPerUser() {
		return postPerUser;
	}
	public double getCommentsPerUser() {
		return commentsPerUser;
	}
	public double getCommentsPerPost() {
		return commentsPerPost;
	}
}
