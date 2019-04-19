package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
	public static void main(String[] args) {
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
	}
}
