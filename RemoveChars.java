package com.strings;

/**
 * Program to remove all occurrences of a given character from a String.
 *
 * Approach:
 * - We iterate through the string character by character.
 * - For each character, if it is not the one we want to remove, 
 *   we append it to a StringBuilder.
 * - Finally, we return the StringBuilder as a new string.
 *
 * Example:
 * Input:  "banana", charToRemove = 'a'
 * Output: "bnn"
 *
 */

public class RemoveChars {

    // Method to remove all occurrences of a given character from a string
    public static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder(str.length()); // create buffer with initial capacity
        for (int i = 0; i < str.length(); i++) {
            // Check each character
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i)); // Append only if not equal to 'ch'
            }
        }
        return sb.toString(); // Convert back to String
    }

    public static void main(String[] args) {
        String result = removeChar("banana", 'a');
        System.out.println(result); // Output: bnn
    }
}
