package com.nisum.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
	public static void main(String[] args) {
		Person a1 = new Person("Ram");
		Person a2 = new Person("sai");
		Person a3 = new Person("balu");
		List<Person> list = new ArrayList<Person>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		Collections.sort(list);
		for (Person a : list) {
			System.out.print(a.getName() + " ");
		}
		Person a = new Person("sai");
		int index = Collections.binarySearch(list, a);
		System.out.println("\nIndex of sai:" + index);
	}
}

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}
}