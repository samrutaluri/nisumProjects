package com.nisum.java8;

interface Sayable {
	// Default method
	default void say() {
		System.out.println("Hello, this is sai charan");
	}

	// Abstract method
	void sayMore(String msg);
}

public class DefaultMethods implements Sayable {
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say(); // calling default method
		dm.sayMore("i'm sai charan"); // calling abstract method

	}
}
