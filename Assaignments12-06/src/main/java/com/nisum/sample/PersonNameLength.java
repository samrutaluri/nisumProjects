package com.nisum.sample;

import java.util.List;
import java.util.stream.Collectors;

import com.nisum.model.Person;

public class PersonNameLength {

	public static boolean getNameLength(List<Person> list) {

		for (Person person : list) {
			if (list != null && person.getFirstname().length() == 5) {
				System.out.println(person.getFirstname().length());
				return true;
			}

		}
		return false;
	}

	// java 8
	public static boolean getNameLengthUsingJava8(List<Person> list) {

		boolean listofpersonnames = list.stream().filter(n -> (n.getFirstname().length()) == 5)
				.collect(Collectors.toList()) != null;
		System.out.println(listofpersonnames);

		return listofpersonnames;

	}
}
