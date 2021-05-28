package com.nisum.streamapi;

import java.util.*;
import java.util.stream.Collectors;

class Map {

	public static void main(String[] args) {

		System.out.println("The stream after applying " + "the function is : ");

		List<String> list = Arrays.asList("sai", "amru", "a", "m", "e", "k", "u");

		List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(answer);
	}
}