package com.strings;

/**
 * CheckAnagrams class
 *
 * This program checks whether two strings are anagrams of each other.
 *
 * An anagram means both strings contain the same characters with the same frequency,
 * but possibly in a different order.
 *
 * Example:
 *   "silent" and "listen" are anagrams.
 *   "hello" and "world" are not.
 *
 * Approach used here:
 * 1. If the lengths of both strings are different, they cannot be anagrams.
 * 2. Use an integer array `count[256]` (to cover all ASCII characters).
 * 3. Traverse both strings:
 *    - Increment count for each character in the first string.
 *    - Decrement count for each character in the second string.
 * 4. After traversal, if all values in `count` are zero, the strings are anagrams.
 *    Otherwise, they are not.
 *
 */
public class CheckAnagrams {

	public static void main(String args[]) {
		boolean isAnagram = isAnagram("silent", "listen");
		System.out.println("Are anagrams: " + isAnagram);
	}

	public static boolean isAnagram(String str1, String str2) {
		// Step 1: If lengths differ, not anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Step 2: Array to count character frequencies (256 for extended ASCII)
		int count[] = new int[256];

		// Step 3: Update count by traversing both strings
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++; // increment for str1
			count[str2.charAt(i)]--; // decrement for str2
		}

		// Step 4: If all counts are zero, strings are anagrams
		for (int i = 0; i < 256; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
