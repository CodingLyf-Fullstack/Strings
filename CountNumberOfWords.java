package com.strings;

/**
 * Problem: Count the number of words in a given string.
 *
 * Explanation:
 * A word is assumed to be separated by spaces.
 * So, the number of words = number of spaces + 1.
 *
 * Example:
 *   Input:  "This is coding lyf"
 *   Spaces: 3
 *   Words:  3 + 1 = 4
 *
 * Note: This simple approach works only when words are separated by a single space
 * and there are no leading/trailing/multiple consecutive spaces.
 */

public class CountNumberOfWords {

    public static void main(String[] args) {
        String str = "This is coding lyf";
        int n = str.length();
        int spaces = 0;

        // Loop through the string and count spaces
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaces = spaces + 1;
            }
        }

        // Number of words = spaces + 1
        System.out.print("Number of words are ");
        System.out.print(spaces + 1); // Output: 4
    }
}

