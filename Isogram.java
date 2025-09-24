package com.strings;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Program to check if a given word is an Isogram.
 * An Isogram is a word where no letter repeats.
 * 
 * Example:
 *   "Machine" > true (all characters unique)
 *   "Programming" > false ('m' appears twice)
 */
public class Isogram {

    public static void main(String[] args) {
        System.out.println("Machine is Isogram: "+checkIsogram("Machine")); // true
        System.out.println("Programming is Isogram: "+checkIsogram("Programming"));   // false
    }

    /**
     * Checks if a string is an isogram.
     *
     * @param string input word to check
     * @return true if isogram, false otherwise
     */
    private static boolean checkIsogram(String string) {
        Set<Character> set = new HashSet<>();
        char[] arr = string.toLowerCase().toCharArray(); // Convert to lowercase for case-insensitive check

        for (char c : arr) {
            // Try to add the character to the set
            // If it already exists, set.add(c) will return false → not an isogram
            if (!set.add(c)) {
                return false;
            }
        }
        // If we finish loop with no duplicates, it's an isogram
        return true;
    }
}

