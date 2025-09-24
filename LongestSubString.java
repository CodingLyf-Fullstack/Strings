package com.strings;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * LongestSubString
 * 
 * This program finds the longest substring of a given string that contains
 * all unique characters (no repeats). 
 * 
 * Approach:
 * - We use the sliding window technique with two pointers: 'start' and 'end'.
 * - 'start' marks the beginning of the current substring window.
 * - 'end' iterates through each character in the string.
 * - A HashSet keeps track of characters already in the current window.
 * - If we encounter a duplicate character, we shrink the window from the left 
 *   (increment 'start') until the duplicate is removed.
 * - The length of the current substring window is calculated as: end - start + 1.
 * 
 * Why end - start + 1?
 * - Both 'start' and 'end' are positions (indices) in the string, and both are 
 *   included in the current window.
 * - Example: 
 *     start = 2, end = 4 => substring includes indices 2,3,4 
 *     Number of characters = 4 - 2 + 1 = 3
 * 
 */
public class LongestSubString {

    public static void main(String[] args) {
        String nameString = "pwwkew";

        int maxLength = 0;                  // Stores the length of the longest substring
        String longestSubString = "";       // Stores the actual longest substring

        Set<Character> set = new HashSet<>();  // HashSet to track unique characters
        int start = 0;                        // Left boundary of sliding window
        int n = nameString.length();
        
        // end is the right boundary of sliding window
        for (int end = 0; end < n; end++) {
        	
        	// If current character already exists in set, shrink window from left
            while (set.contains(nameString.charAt(end))) {
                set.remove(nameString.charAt(start));
                start++;
            }

            // Add current character to window
            set.add(nameString.charAt(end));

            // Update max length and longest substring
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubString = nameString.substring(start, end + 1);
            }
        }

        System.out.println("Longest substring without repeating characters: " 
                           + longestSubString + " -- Length: " + maxLength);
    }
}

