package com.nisum.streams;

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}
}

public class ListOfAddresses {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		// Adding Persons
		personList.add(new Person(1, "Bhimavaram"));
		personList.add(new Person(2, "Akividu"));
		personList.add(new Person(3, "Narsapuram"));
		personList.add(new Person(4, "Palkol"));
		personList.add(new Person(5, "Rajolu"));
		// Fetching person Addresses as List
		List<String> names = personList.stream().map(n -> n.name).collect(Collectors.toList());
		System.out.println(names);
	}
}