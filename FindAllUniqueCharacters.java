package com.strings;

import java.util.HashMap;
import java.util.Map;

public class FindAllUniqueCharacters {

	public static void main(String[] args) {
		String inputString = "success";

		// Step 1: Count frequency of each character
		Map<Character, Integer> map = new HashMap<>();
		for (char c : inputString.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Step 2: Collect characters that appear only once
		StringBuilder builder = new StringBuilder();
		for (char c : inputString.toCharArray()) {
			if (map.get(c) == 1) {
				builder.append(c);
			}
		}

		// Output unique characters
		System.err.println("Unique characters: " + builder.toString()); // ue
	}
}
