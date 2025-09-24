package com.strings;

/**
 * CountOfStringAppearsInAnother
 *
 * This program counts how many times a string `s1` occurs contiguously
 * in another string `s2`. 
 *
 * Example:
 * s1 = "abc", s2 = "abcabcabc" then Output: 3
 * s1 = "xyz", s2 = "xyabcz" then Output: 0
 *
 * Approach:
 * - Slide a window of size equal to s1.length() over s2.
 * - Compare each substring with s1.
 * - Increment count if they match, and move the index forward by s1.length() to avoid overlapping counts.
 */
public class CountOfStringAppearsInAnother {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcabcabc";

        int n = s2.length();      // Length of the main string
        int m = s1.length();      // Length of the target substring
        int i = 0;                // Index to traverse s2
        int count = 0;            // Count of occurrences

        while (i < n) {
            // Check if the current substring matches s1
            if (i + m <= n && s2.substring(i, i + m).equals(s1)) {
                count++;           // Increment count for match
                i = i + m;         // Move index forward by length of s1
            } else {
                i++;               // Move to next character if no match
            }
        }

        System.out.println("Occurrences of '" + s1 + "' in '" + s2 + "': " + count);
    }
}
