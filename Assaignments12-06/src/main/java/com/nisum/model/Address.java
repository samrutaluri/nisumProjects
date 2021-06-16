package com.nisum.model;

public class Address {
	private String Dist;
	private String state;

	public String getDist() {
		return Dist;
	}

	public void setDist(String dist) {
		Dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String dist, String state) {
		super();
		Dist = dist;
		this.state = state;
	}

}
