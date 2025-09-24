package com.strings;

/**
 * StringCompression
 * 
 * This class demonstrates a simple string compression algorithm.
 * Consecutive repeating characters in the input string are replaced
 * by a single character followed by the count of repetitions.
 * 
 * Example:
 * Input:  "aaabbc"
 * Output: "a3b2c"
 * 
 * The approach is straightforward:
 * - Traverse the string character by character.
 * - Keep a counter for consecutive repeating characters.
 * - Append the character and its count (if >1) to the result.
 * - Reset the count when a new character is encountered.
 */
public class StringCompression {

    public static void main(String[] args) {
        String input = "aaabbc";
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compress(input));
    }

    private static String compress(String str) {
        StringBuilder sb = new StringBuilder(); // To build the compressed string
        int count = 1; // Initialize counter for consecutive characters

        // Traverse the string starting from second character
        for (int i = 1; i <= str.length(); i++) {
            // If current character is same as previous, increment count
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append previous character
                sb.append(str.charAt(i - 1));
                // Append count only if greater than 1
                if (count > 1) sb.append(count);
                count = 1; // Reset count for next character
            }
        }

        return sb.toString(); // Return the compressed string
    }
}

