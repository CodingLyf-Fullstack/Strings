package com.strings;

public class StringtoCamelCase {
	public static void main(String[] args) {
		// Input string
		String inputString = "hello from coding lyf";

		// Split the input into words using space as a delimiter
		String arr[] = inputString.split(" ");

		// StringBuilder is used to efficiently build the result
		StringBuilder builder = new StringBuilder();

		// Loop through each word
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];

			// Convert the first character of each word to uppercase
			// and the rest of the word to lowercase
			// Example: "hello" -> "Hello"
			builder.append(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());

			// Add a space after each word (so final result will be title case)
			builder.append(" ");
		}

		// Print the result (extra space at the end is harmless but can be trimmed if
		// needed)
		System.err.println(builder.toString());
	}
}
