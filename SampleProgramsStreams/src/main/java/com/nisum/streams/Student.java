package com.nisum.streams;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Student(int id, String name, List<String> add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAddresses() {
		return add;
	}

	public void setAddresses(List<String> addresses) {
		this.add = addresses;
	}

}