package com.nisum.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MergeSort {

	public List<Person> mergeSort(List<Person> persons, boolean isDescendingOrder) {
		List<Person> distinct = removeDuplicates(persons);
		return sort(distinct, isDescendingOrder);
	}

	public List<Person> sort(List<Person> distinctpersonData, boolean isDescendingOrder) {

		if (!isDescendingOrder) {
			System.out.println("reverse order");
			List<Person> per = MergeSort.mergeSortingPerson(distinctpersonData);
			Collections.reverse(per);
			return per;
		} else {
			System.out.println("before merge sorting");
			return MergeSort.mergeSortingPerson(distinctpersonData);
		}
	}

	private static List<Person> mergeSortingPerson(List<Person> distinctpersonData) {
		return null;
	}

	public List<Person> removeDuplicates(List<Person> persons) {

		Set<Person> uniqPersonData = persons.stream().distinct().collect(Collectors.toSet());
		return uniqPersonData.stream().collect(Collectors.toList());

	}

	public List<Person> bubbleSort(List<Person> persons, Comparator<Person> comparator, boolean isDescendingOrder) {
		List<Person> distinct = removeDuplicates(persons);
		return sort(distinct, comparator, isDescendingOrder);

	}

	public List<Person> sort(List<Person> distinct, Comparator<Person> comparator, boolean isDescendingOrder) {

		if (isDescendingOrder) {
			Collections.sort(distinct, new Comparator<Person>() {
				@Override
				public int compare(Person o1, Person o2) {
					return o1.firstName.compareTo(o1.firstName);

				}

			});

		} else {

			distinct.sort((o1, o2) -> o2.firstName.compareTo(o1.firstName));
		}
		return distinct;
	}

	private static void MergeSort(ArrayList<Person> list, ArrayList<Person> helper, int low, int middle, int high,
			Comparator<Person> compTr) {
		for (int i = low; i < high + 1; i++) {
			helper.add(i, list.get(i));
		}

		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;

		while (helperLeft < middle && helperRight < high) {
			if (isGreaterThan(helper.get(helperLeft), helper.get(helperRight), compTr)) {
				list.set(current, helper.get(helperLeft));
				helperLeft++;
			} else {
				list.set(current, helper.get(helperRight));
				helperRight++;
			}
			current++;
		}

		int remaining = middle - helperLeft;
		for (int j = 0; j <= remaining; j++) {
			list.set(current + j, helper.get(helperLeft + j));
		}
	}

	private static boolean isGreaterThan(Person person, Person person2, Comparator<Person> compTr) {
		return false;
	}
}
