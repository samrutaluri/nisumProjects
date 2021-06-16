package com.nisum.method;

import java.util.ArrayList;
import java.util.List;

import com.nisum.model.Address;
import com.nisum.model.Person;
import com.nisum.sample.PersonData;
import com.nisum.sample.PersonNameLength;
import com.nisum.sample.WithPersonNames;

public class ListOfPerson {

	public static void main(String[] args) {
		Address address1 = new Address("KNR", "TELANGANA");
		Address address2 = new Address("MUBAI", "MAHARASTRA");
		Address address3 = new Address("WRNG", "TELANGANA");
		Address address4 = new Address("VIZAG", "AP");
		Address address5 = new Address("CHENNAI", "TM");
		Address address6 = new Address("KADAPA", "AP");

		List<Person> list = new ArrayList<Person>();
		list.add(new Person(101, "RAM", "amrutaluri", address1));
		list.add(new Person(102, "rajeswari", "chinta", address2));
		list.add(new Person(103, "ramgopal", "akkina", address3));
		list.add(new Person(104, "charan", "mamidala", address4));
		list.add(new Person(105, "saketh", "ch", address5));
		list.add(new Person(106, "rajesh", "kommuala", address6));

		List<Person> personDataUsingJava7 = PersonData.getPersonDataUsingJava7(list);

		for (Person person : personDataUsingJava7) {
			System.out.println(person.getAddress().getState() + " " + person.getFirstname());
		}

		System.out.println("-------------------Using Java 8-----------------");
		List<Person> personDataUsingJava8 = PersonData.getPersonDataUsingJava8(list);

		for (Person person : personDataUsingJava8) {
			System.out.println(person.getAddress().getState() + " " + person.getFirstname());
		}

		// list of persons and it should return true if all persons first name length is
		// 5, otherwise it should return false
		List<Person> list1 = new ArrayList<Person>();
		list1.add(new Person(101, "charan", "amrutaluri", address1));
		list1.add(new Person(102, "RAM", "achanta", address2));
		list1.add(new Person(103, "ramgopal", "akkina", address3));
		list1.add(new Person(104, "rajeswari", "mamidala", address4));

		boolean listOfPersonNames = PersonNameLength.getNameLength(list1);
		System.out.println(listOfPersonNames);
		boolean listOfPersonUsingJava8 = PersonNameLength.getNameLengthUsingJava8(list1);
		System.out.println(listOfPersonUsingJava8);
		System.out.println("-------------------------------------------------------------------------------");
		// should return true if there is at-least one person whose name first name is
		// RAM, otherwise it should return

		List<Person> listofpersons = new ArrayList<Person>();
		listofpersons.add(new Person(101, "charan", "amrutaluri", address1));
		listofpersons.add(new Person(102, "RAM", "achanta", address2));
		listofpersons.add(new Person(103, "ramgopal", "akkina", address3));
		listofpersons.add(new Person(104, "rajeswari", "mamidala", address4));
		listofpersons.add(new Person(105, "saketh", "ch", address5));
		list.add(new Person(106, "rajesh", "kommuala", address6));

		boolean listOfPerson = WithPersonNames.getNameUsingJava7(listofpersons);
		System.out.println(listOfPerson);
		boolean listUsingJava8 = WithPersonNames.getNameUsingJava8(listofpersons);
		System.out.println(listUsingJava8);
	}
}
