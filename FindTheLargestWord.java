package com.strings;

public class FindTheLargestWord {

    public static void main(String[] args) {
        // Input string
        String str = "Java makes coding enjoyable and challenging";

        // Split the string into words using space as a delimiter
        String[] words = str.split(" ");

        // Variable to hold the largest word found so far
        String largestWord = "";

        // Loop through each word
        for (String word : words) {
            // If current word length is greater than the previous largest word, update it
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        // Print the largest word
        System.out.println("Largest Word is: " + largestWord);
    }
}
