package com.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveCharactersFromFirstString {

    public static void main(String[] args) {
        String firstString = "computer";
        String secondString = "cat";

        // Step 1: Store all characters of secondString in a HashSet
        // This allows O(1) average-time lookup for each character
        Set<Character> set = new HashSet<>();
        for (char c : secondString.toCharArray()) {
            set.add(c);
        }

        // Step 2: Build a new string by skipping characters
        // that are present in the set (i.e., present in secondString)
        StringBuilder builder = new StringBuilder();
        for (char c : firstString.toCharArray()) {
            if (!set.contains(c)) {   // only keep characters NOT in secondString
                builder.append(c);
            }
        }

        // Final output string after removing all characters of secondString from firstString
        System.out.println("Final String: " + builder.toString());
    }
}
