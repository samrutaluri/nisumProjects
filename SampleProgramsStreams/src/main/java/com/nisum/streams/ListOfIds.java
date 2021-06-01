package com.nisum.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfIds {

	public static void main(final String[] args) {

		List<Customer> customers = Arrays.asList(new Customer(1l, "sai charan"), new Customer(2l, "bala chandan"),
				new Customer(3l, "ram kumar"));

		List<Long> ids = customers.stream()
								  .map(Customer::getId)
								  .collect(Collectors.toList());

		System.out.println("Ids = " + ids);
	}
}

class Customer {
	private final Long id;
	private final String name;

	Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	Long getId() {
		return id;
	}

	String getName() {
		return name;
	}

}