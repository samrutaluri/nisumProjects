package com.nisum.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*public class CustomArrayList {

	public static void main(String[] args) {
		List list = new ArrayList<>();

//  adding elements

		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");

		System.out.println(list);

	}*/

// removing elements from list

/*public class CustomArrayList {
	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("monday", "tuesdy", "Wednesday", "Thursday"));

		System.out.println(namesList);

		namesList.remove("monday");

		System.out.println(namesList);
	}*/

//getting elements from the list

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("monday", "tuesday", "wednesday", "thursday"));

		String firstName = list.get(0);
		String secondName = list.get(1);

		System.out.println(firstName);
		System.out.println(secondName);
	}
}
