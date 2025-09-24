package com.strings;

/**
 * MergeTwoStringsAlternatively
 * ----------------------------
 * This program merges two strings by taking characters alternately 
 * from each string. 
 * 
 * Approach:
 * 1. Use a loop to append characters from both strings one by one.
 * 2. Stop the loop when the shorter string ends.
 * 3. If one string is longer than the other, append the remaining part 
 *    of the longer string at the end.
 *
 * Example:
 * Input: s1 = "Coding", s2 = "Lyf"
 * Output: "CLoydfing"
 *   - First characters: 'C' + 'L'
 *   - Second characters: 'o' + 'y'
 *   - Third characters: 'd' + 'f'
 *   - Remaining: "ing" from s1
 */

public class MergeTwoStringsAlternatively {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Lyf";

        // Find the length of the smaller string (loop runs till this length)
        int length = Math.min(s1.length(), s2.length());
        int i = 0;

        StringBuilder builder = new StringBuilder();

        // Append characters alternately from both strings
        while (i < length) {
            builder.append(s1.charAt(i)).append(s2.charAt(i));
            i++;
        }

        // Append remaining characters from the longer string (if any)
        if (i < s1.length()) {
            builder.append(s1.substring(i));
        } else if (i < s2.length()) {
            builder.append(s2.substring(i));
        }

        // Final merged result
        System.err.println(builder.toString());
    }
}

