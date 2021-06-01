package com.nisum.pincode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReturnWithTwoAddress {

	public static void main(String args[]) {

		Address saiAddress = new Address(" Bhimavaram", "Andhra Prasdesh", "India", 534235);
		Address baluAddress = new Address(" Rajolu", "Andhra Prasdesh", "India", 500089);
		Address ramAddress = new Address(" Akividu", "Andhra Prasdesh", "India", 345678);

		Person sai = new Person("sai", Optional.of(saiAddress), 874731232);
		Person balu = new Person("balu", Optional.of(baluAddress), 333299911);
		Person ram = new Person("ram", Optional.of(ramAddress), 533299911);

		List<Person> people = new ArrayList<>();
		people.add(sai);
		people.add(balu);
		people.add(ram);

		people.stream().forEach((p) -> {
			System.out.printf("%s from %s %n", p.name(), p.address().orElse(Address.EMPTY_ADDRESS));
		});
	}

}

class Person {
	private String name;
	private Optional<Address> address;
	private int phone;

	public Person(String name, Optional<Address> address, int phone) {
		if (name == null) {
			throw new IllegalArgumentException("Null value for name is not permitted");
		}
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String name() {
		return name;
	}

	public Optional<Address> address() {
		return address;
	}

	public int phone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + '}';
	}

}

class Address {
	public static final Address EMPTY_ADDRESS = new Address("", "", "", 0);
	private final String line1;
	private final String city;
	private final String country;
	private final int zipcode;

	public Address(String line1, String city, String country, int zipcode) {
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String line1() {
		return line1;
	}

	public String city() {
		return city;
	}

	public String country() {
		return country;
	}

	public int zipcode() {
		return zipcode;
	}

	@Override
	public String toString() {
		return "Address{" + "line1=" + line1 + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + '}';
	}
}