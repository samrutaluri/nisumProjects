package com.nisum.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import com.nisum.sample.CharacterCountLength;
import com.nisum.sample.OccuanceOfEachString;

public class OccuranceCount {
	public static void main(String[] args) {
		String quoteArray[] = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key",
				"to", " unlocking", "our", "potential" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(quoteArray));

		Map<Character, Integer> eachchar = CharacterCountLength.characterCount(list);
		System.out.println(eachchar);
		System.out.println("-----------------------------");

		OccuanceOfEachString findOccuOfEachString = new OccuanceOfEachString();
		ArrayList<String> findOccerance = new ArrayList<String>();
		findOccerance.add("sai");
		findOccerance.add("charan");
		findOccerance.add("amrutaluri");
		findOccerance.add("kumar");
		findOccerance.add("mahesh");
		Integer count = OccuanceOfEachString.countFrequencies(findOccerance);
		System.out.println();
	}

}
