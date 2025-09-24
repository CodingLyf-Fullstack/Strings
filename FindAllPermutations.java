package com.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Program: Find all permutations of a given string using recursion + backtracking.
 * 
 * Idea:
 * - We maintain a boolean array `used[]` to track which characters are already used.
 * - At each recursive call, we try to add one unused character to the current path.
 * - When the path length equals the original string length, we have a complete permutation.
 * - After exploring one choice, we backtrack (mark the character as unused again) 
 *   so that other possibilities can be explored.
 * 
 * Example: "ABC"
 * Steps:
 *   A → AB → ABC
 *   A → AC → ACB
 *   B → BA → BAC ...
 *   etc.
 */

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutations {
    public static void main(String[] args) {
        String str = "ABC";

        // Boolean array to mark whether a character is already used in the current path
        boolean[] used = new boolean[str.length()];

        // To store the generated permutations
        List<String> output = new ArrayList<>();

        // Start recursive backtracking with empty path
        backtrack(str, "", output, used);

        // Print final result
        System.out.println("Permutations: " + output);
    }

    /**
     * Recursive backtracking function to generate permutations
     *
     * @param str     Original string
     * @param path    Current partial permutation
     * @param output  List to store completed permutations
     * @param used    Tracks which characters are already used
     */
    static void backtrack(String str, String path, List<String> output, boolean[] used) {
        // Base condition: if path length equals original string length → complete permutation
        if (path.length() == str.length()) {
            output.add(path); // add to output list
            return;
        }

        // Try every character in the string
        for (int i = 0; i < str.length(); i++) {
            // Only pick characters that are not yet used in the current path
            if (!used[i]) {
                used[i] = true; // Mark character as used
                backtrack(str, path + str.charAt(i), output, used); // Recurse deeper
                used[i] = false; // Backtrack and unmark, so it can be used in other branches
            }
        }
    }
}

