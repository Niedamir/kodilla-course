package com.kodilla.stream;

//import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
	public static void main(String[] args) {
		Forum forum = new Forum();
		Map<Integer, ForumUser> result = forum.getUserList().stream()
			.filter(user -> user.getSex() == 'M')
			.filter(user -> user.getBirthDate().isBefore(LocalDate.of(1999, 04, 23)))
			.filter(user -> user.getPosts() > 0)
			.collect(Collectors.toMap(ForumUser::getUserID, user -> user));

		result.entrySet().stream()
			.map(entry -> entry.getKey() + ": " + entry.getValue().toString())
			.forEach(System.out::println);
	}

	// EXCERCISE 7.1
	/*public static void main(String[] args) {
		String inputText1 = "Lorem ipsum dolor sit amet";
		String inputText2 = "consectetur adipiscing elit";
		String inputText3 = "sed do eiusmod tempor incididunt";
		String inputText4 = "ut labore et dolore magna aliqua";

		PoemBeautifier beautifier1 = new PoemBeautifier();
		String outputText1 = beautifier1.beautify(inputText1, (text) -> "ABC " + text + " ABC");
		String outputText2 = beautifier1.beautify(inputText2, (text) -> text.toUpperCase());
		String outputText3 = beautifier1.beautify(inputText3, (text) -> text.trim());
		String outputText4 = beautifier1.beautify(inputText4, (text) -> text.replaceAll("et", "&&"));

		System.out.println(outputText1 + "\n" + outputText2 + "\n" + outputText3 + "\n" + outputText4);
	}*/
}
