package com.nisum.sample;

import java.util.HashMap;
import java.util.Map;

public class WordCoundUsingHash {
	public static void main(String args[]) {

		String s = "i'm sai charan amrutaluri";
		String[] count = s.split(" ");
		Map<String, Integer> n = new HashMap<String, Integer>();

		for (int i = 0; i < count.length; i++) {
			if (n.containsKey(count[i])) {
				int cont = n.get(count[i]);
				n.put(count[i], cont + 1);
			} else {
				n.put(count[i], 1);
			}
		}
		System.out.println(n);
	}
}