package com.strings;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {

    /**
     * Problem:
     * Find the first non-repeating character in a string.
     *
     * Approach:
     * 1. Use a LinkedHashMap<Character, Integer> to store the frequency of each character.
     *    - LinkedHashMap is used instead of HashMap because it maintains insertion order.
     * 2. Traverse the string and update frequency counts.
     * 3. Iterate over the LinkedHashMap to find the first character with frequency = 1.
     *
     * Example:
     * Input:  "swiss"
     * Map:    {s=3, w=1, i=1}
     * Output: 'w' (first char with count = 1)
     */

    public static void main(String[] args) {
        String nameString = "swiss";

        // Step 1: Store character frequencies in LinkedHashMap
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nameString.length(); i++) {
            // Convert to lowercase for case-insensitivity
            Character keyChar = nameString.toLowerCase().charAt(i);

            // Update frequency count
            map.put(keyChar, map.getOrDefault(keyChar, 0) + 1);
        }

        // Step 2: Find the first non-repeating character using streams
        Character c = map.entrySet()
                         .stream()
                         .filter(m -> m.getValue() == 1) // keep only non-repeating
                         .findFirst()                     // pick the first one (order preserved)
                         .get()
                         .getKey();

        System.out.println("First non-repeating character: " + c);
    }
}
