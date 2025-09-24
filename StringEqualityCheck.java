package com.strings;

public class StringEqualityCheck {

    public static boolean areEqual(String s1, String s2) {
        // If both are null, consider them equal
        if (s1 == null && s2 == null) return true;

        // If one is null, not equal
        if (s1 == null || s2 == null) return false;

        // If lengths differ, not equal
        if (s1.length() != s2.length()) return false;

        // Compare characters one by one
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true; // all checks passed
    }

    public static void main(String[] args) {
        System.out.println(areEqual("hello", "hello")); // true
        System.out.println(areEqual("hello", "world")); // false
        System.out.println(areEqual("java", "javA"));   // false
        System.out.println(areEqual(null, null));       // true
        System.out.println(areEqual("test", null));     // false
    }
}
