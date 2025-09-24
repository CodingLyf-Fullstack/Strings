package com.strings;

/**
 * This program checks if one string (s1) is a subsequence of another string (s2).
 * 
 * Definition:
 * A string s1 is a subsequence of s2 if all characters of s1 appear in s2
 * in the same order, but not necessarily contiguously.
 * 
 * Example:
 * s1 = "abc", s2 = "axbycz" then "abc" is a subsequence of s2
 * s1 = "abc", s2 = "acb"   then it is not a subsequence because order matters
 * 
 * Approach:
 * 1. Use two pointers i (for s1) and j (for s2).
 * 2. Traverse s2 with j. Whenever s1[i] matches s2[j], increment i.
 * 3. At the end, if i == s1.length(), then s1 is a subsequence of s2.
 */

public class CheckSubsequence {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "axbycz";

		int i = 0; // Pointer for s1
		int j = 0; // Pointer for s2

		while (j < s2.length()) {
			// If characters match, move pointer i
			if (i < s1.length() && s1.charAt(i) == s2.charAt(j)) {
				i++;
			}
			j++; // Always move pointer j
		}

		// If i reached the end of s1, all characters were found in order
		if (i == s1.length()) {
			System.out.println(s1 + " is a subsequence of " + s2);
		} else {
			System.out.println(s1 + " is NOT a subsequence of " + s2);
		}
	}
}
