package com.nisum.java8;

interface Sayable {

	default void say() {
		System.out.println("Hello, this is sai charan");
	}

	void sayMore(String msg);
}

public class DefaultMethods implements Sayable {
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say();
		dm.sayMore("i'm sai charan");

	}
}
