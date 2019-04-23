package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
	public final List<ForumUser> getUserList() {
		List<ForumUser> theList = new ArrayList<>();
		theList.add(new ForumUser(1, "Richard Lionheart", 'M', LocalDate.of(1999, 02, 8), 10));
		theList.add(new ForumUser(2, "Saladin The Great", 'M', LocalDate.of(1999, 03, 12), 10));
		theList.add(new ForumUser(3, "Caliph", 'F', LocalDate.of(2002, 04, 15), 3));
		theList.add(new ForumUser(4, "Sultan", 'F', LocalDate.of(1989,02, 03), 1));
		theList.add(new ForumUser(5, "Rat", 'F', LocalDate.of(2010,12, 13), 0));
		theList.add(new ForumUser(6, "Snake", 'M', LocalDate.of(1998,01, 01), 4));
		theList.add(new ForumUser(7, "Pig", 'M', LocalDate.of(1990,12, 30), 6));
		theList.add(new ForumUser(8, "Wolf", 'M', LocalDate.of(2008,10, 27), 8));
		return theList;
	}
}
