package com.nisum.customexception;

public class AddressIsNullExcetion extends RuntimeException {

	public AddressIsNullExcetion(String massage) {
		super(massage);
	}
}
