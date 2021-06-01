package com.nisum.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfPincode {
	public static <S> void main(String[] args) {

		List<Student> student = new ArrayList<Student>();

		List<String> add1 = Arrays.asList("Telengana", "500089");
		List<String> add2 = Arrays.asList("Andhra", "08816");
		List<String> add3 = Arrays.asList("karnataka", "123455");

		student.add(new Student(101, "charan", add1));
		student.add(new Student(102, "sai", add2));
		student.add(new Student(103, "balu", add3));

		List<String> ad1 = student.stream().flatMap(s -> s.getAddresses()
														  .stream())
														  .collect(Collectors.toList());

		List<String> ad = student.stream().flatMap((s -> {
			return s.getAddresses().stream();
		})).collect(Collectors.toList());

		System.out.println(ad + " ");
	}
}
