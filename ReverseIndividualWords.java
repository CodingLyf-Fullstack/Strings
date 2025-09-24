package com.strings;

import java.util.Stack;

/**
 * Problem: Reverse each word in a sentence individually without changing the order of words.
 *
 * Example:
 * Input:  "Hello World"
 * Output: "olleH dlroW"
 *
 * Approach:
 * 1. Use a stack to reverse characters of each word.
 * 2. Traverse the string character by character.
 * 3. Push each character onto the stack until a whitespace is found.
 * 4. When a whitespace is encountered, pop all characters from the stack (this reverses the word)
 *    and append them to the result.
 * 5. Append the whitespace after each word.
 * 6. After the loop, pop any remaining characters in the stack to handle the last word.
 */
public class ReverseIndividualWords {

    public static void main(String[] args) {
        String str = "Hello World";

        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (Character.isWhitespace(c)) {
                // Pop all characters from stack to reverse the current word
                while (!stack.isEmpty()) {
                    builder.append(stack.pop());
                }
                // Append the space after the reversed word
                builder.append(" ");
            }
            // Push current character to stack
            stack.push(c);
        }

        // Pop remaining characters in the stack to reverse the last word
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        System.err.println("Output: " + builder.toString());
    }
}
