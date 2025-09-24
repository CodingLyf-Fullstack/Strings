package com.strings;

/**
 * LongestCommonPrefix
 *
 * This program finds the longest common prefix among an array of strings.
 *
 * Approach:
 * - We start by assuming the first string in the array is the prefix.
 * - Then, we compare this prefix with every other string in the array:
 *     - If the current string does not start with the prefix, we shrink
 *       the prefix from the end by one character.
 *     - Repeat this until the current string starts with the prefix.
 * - After checking all strings, the remaining prefix is the longest common prefix.
 *
 * Example:
 * Input: {"flower", "flow", "flight"}
 * Steps:
 *   Start with prefix = "flower"
 *   Compare with "flow": "flower" -> "flowe" -> "flow" (matches start)
 *   Compare with "flight": "flow" -> "flo" -> "fl" (matches start)
 * Output: "fl"
 *
 */
public class LongestCommenPrefix {

    public static void main(String[] args) {
        String[] arr = { "flower", "flow", "flight" };

        // Assume first string is the initial prefix
        String prefix = arr[0];

        // Compare prefix with each string in array
        for (int i = 1; i < arr.length; i++) {
            // Shrink prefix until current string starts with it
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
}
