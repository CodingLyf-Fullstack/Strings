package com.strings;

import java.util.Arrays;

public class RotateStringLeftAndRight {

    // Function to reverse part of the array
    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Left rotate by k positions
    public static void leftRotate(char[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle k > n
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Right rotate by k positions
    public static void rightRotate(char[] arr, int k) {
        int n = arr.length;
        k = k % n;
        leftRotate(arr, n - k); // Right rotation is left rotation by n-k
    }

    public static void main(String[] args) {
        char[] arr = "abcdef".toCharArray();
        
        leftRotate(arr, 2);
        System.out.println("Left rotated by 2: " + new String(arr));

        arr = "abcdef".toCharArray();
        rightRotate(arr, 2);
        System.out.println("Right rotated by 2: " + new String(arr));
    }
}

