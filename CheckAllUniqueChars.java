package com.strings;

import java.util.HashSet;

public class CheckAllUniqueChars {

	public static void main(String[] args) {
		System.out.println("silent has all unique chars : " + hasAllUniqueChars("silent")); // true
		System.out.println("hello has all unique chars : " + hasAllUniqueChars("hello")); // false
	}

    /**
     * Checks if the given string has all unique characters.
     * 
     * Approach:
     * - Use a HashSet to store characters as we see them.
     * - If we ever encounter a character that's already in the set, return false.
     * - Otherwise, after processing the string, return true.
     * 
     */
	public static boolean hasAllUniqueChars(String word) {
		HashSet<Character> alphaSet = new HashSet<>();

		for (char c : word.toCharArray()) {
			// If character already exists, HashSet.add() will return false
			if (!alphaSet.add(c)) {
				return false;
			}
		}
		return true;
	}
}
