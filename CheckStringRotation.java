package com.strings;

/**
 * Problem: Check if one string is a rotation of another.
 *
 * Explanation:
 * A string s2 is a rotation of s1 if it can be obtained by shifting characters
 * of s1 circularly. For example:
 *   s1 = "abcd", s2 = "cdab" → rotation (shift "ab" to the end).
 *   s1 = "abcd", s2 = "acbd" → not a rotation.
 *
 * Trick:
 * If you concatenate s1 with itself (s1+s1), every possible rotation of s1 
 * will appear as a substring inside this new string.
 *
 * Example:
 *   s1 = "abcd"
 *   s1+s1 = "abcdabcd"
 *   s2 = "cdab"
 *   "cdab" is present in "abcdabcd" return true, it's a rotation.
 */

public class CheckStringRotation {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        // Concatenate s1 with itself
        String newString = s1 + s1;

        // Check if s2 is a substring of ds1
        System.out.println(newString.contains(s2)); // Output: true
    }
}
