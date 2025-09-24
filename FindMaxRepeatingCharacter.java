package com.strings;

/*
 * Problem: Find the maximum occurring (most frequent) character in a string.
 * Example: 
 * Input: "apple"
 * Output: "p"
 *
 * Approach:
 * 1. Use an integer frequency array of size 256 (to cover all ASCII characters).
 * 2. Traverse the string and count the frequency of each character.
 * 3. Traverse again to find the character with the highest frequency.
 * 4. Print that character.
 *
 * Why array[256]?
 * Because in Java, char is 16-bit Unicode, but for simplicity in interview-style
 * questions we usually assume ASCII (0–255).
 */

public class FindMaxRepeatingCharacter {

    public static void main(String[] args) {
        String str = "apple";

        // Step 1: Frequency array for ASCII chars
        int[] freq = new int[256];

        // Step 2: Count frequency of each character
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int maxFrequency = 0;
        char result = '\0'; // placeholder for max occurring char

        // Step 3: Find the character with the maximum frequency
        for (char c : str.toCharArray()) {
            if (freq[c] > maxFrequency) {
                maxFrequency = freq[c];
                result = c;
            }
        }

        // Step 4: Print result
        System.out.println("Most Repeating Character: " + result +
                           " with frequency " + maxFrequency);
    }
}

