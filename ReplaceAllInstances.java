package com.strings;

/**
 * ReplaceAllInstances
 * -------------------
 * This program demonstrates how to replace all occurrences of a given substring
 * with another substring WITHOUT using the built-in String replace() method.
 *
 * Approach:
 * 1. Iterate through the input string character by character.
 * 2. At each position, check if the substring starting at this position 
 *    matches the target substring.
 * 3. If it matches, append the replacement string to the result and skip ahead
 *    by the length of the target substring.
 * 4. If it does not match, append the current character and move ahead by 1.
 * 
 * Example:
 * Input:  "abc123abc456abc", target = "abc", replacement = "XYZ"
 * Output: "XYZ123XYZ456XYZ"
 */

public class ReplaceAllInstances {

    public static void main(String[] args) {
        String input = "abc123abc456abc";
        String target = "abc";
        String replacement = "XYZ";

        String output = replaceSubstring(input, target, replacement);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    /**
     * Replaces all occurrences of 'target' in 'input' with 'replacement'.
     */
    private static String replaceSubstring(String input, String target, String replacement) {
        StringBuilder builder = new StringBuilder();
        int n = input.length();   // length of original string
        int m = target.length();  // length of target substring
        int i = 0;

        while (i < n) {
            // Check if substring from i to i+m matches target
            if (i + m <= n && input.substring(i, i + m).equals(target)) {
                builder.append(replacement); // append replacement
                i = i + m;                   // skip past target
            } else {
                builder.append(input.charAt(i)); // append current char
                i++;                             // move to next character
            }
        }

        return builder.toString();
    }
}

