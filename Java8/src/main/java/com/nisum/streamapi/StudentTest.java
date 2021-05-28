package com.nisum.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {
	public static <S> void main(String[] args) {

		List<Student> student = new ArrayList<Student>();

		List<String> add1 = Arrays.asList("KA", "12345");
		List<String> add2 = Arrays.asList("OD", "000789");
		List<String> add3 = Arrays.asList("KN", "000456");

		student.add(new Student(101, "charan", add1));
		student.add(new Student(102, "sai", add2));
		student.add(new Student(103, "balu", add3));

		// using map
		List<Integer> list = student.stream().map((x -> {

			return x.getId();

		})).collect(Collectors.toList());
		System.out.println(list);

		List<String> names = student.stream().map((x -> {

			return x.getName();

		})).collect(Collectors.toList());
		System.out.println(names + " " + names.size());

		

		// using flatmap
		List<String> ad1 = student.stream().flatMap(x -> x.getAddresses().stream()).collect(Collectors.toList());

		System.out.println(ad1 + " " + ad1.size());

		List<String> ad = student.stream().flatMap((x -> {
			return x.getAddresses().stream();
		})).collect(Collectors.toList());

		System.out.println(ad + " " + ad.size());
	}
}
