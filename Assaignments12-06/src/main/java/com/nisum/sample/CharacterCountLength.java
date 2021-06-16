package com.nisum.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CharacterCountLength {

	public static Map<Character, Integer> characterCount(ArrayList<String> inputString) {

		String res = null;

		StringBuilder sb = new StringBuilder();

		int i = 0;
		while (i < inputString.size() - 1) {

			System.out.println("adding string builder");
			sb.append(inputString.get(i));

			i++;
		}

		// sb.append(inputString.get(i));
		res = sb.toString();
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = res.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				System.out.println("contains of key");
				charCountMap.put(c, charCountMap.get(c) + 1);

			} else {
				charCountMap.put(c, 1);
			}
		}
		return charCountMap;

	}

}
