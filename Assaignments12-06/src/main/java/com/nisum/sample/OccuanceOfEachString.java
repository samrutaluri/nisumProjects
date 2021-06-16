package com.nisum.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccuanceOfEachString {
	public static Integer countFrequencies(ArrayList<String> list)
    {
        Map<String, Integer> hm = new HashMap<String, Integer>();
  
        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
  
        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times");
        }
		return null;
    }
}
