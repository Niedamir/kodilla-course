package com.kodilla.stream.beautifier;

public class PoemBeautifier {
	public String beautify(String text, PoemDecorator lambda) {
		return lambda.decorate(text);
	}
}
