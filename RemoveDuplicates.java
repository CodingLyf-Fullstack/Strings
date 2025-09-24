package com.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "bcabc";

        // A Set to track already seen characters
        Set<Character> seen = new HashSet<>();
        
        // Use StringBuilder to build the result
        StringBuilder builder = new StringBuilder();

        // Iterate through each character
        for (char c : str.toCharArray()) {
            // add() returns true if character not already present
            if (seen.add(c)) {
                builder.append(c); // append only first occurrence
            }
        }
        
        System.err.println("String without duplicates: " + builder.toString());
    }
}
