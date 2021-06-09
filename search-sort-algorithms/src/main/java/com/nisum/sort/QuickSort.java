package com.nisum.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class QuickSort {

	public List<Person> quickSort(List<Person> persons, boolean isDescendingOrder) {
		List<Person> distinct = removeDuplicates(persons);
		return quicksort(distinct, isDescendingOrder);
	}

	public List<Person> quicksort(List<Person> distinctpersonData, boolean isDescendingOrder) {

		if (!isDescendingOrder) {
			System.out.println("reverse order");
			List<Person> per = QuickSort.quickSortingPerson(distinctpersonData);
			Collections.reverse(per);
			return per;
		} else {
			System.out.println("before quick sorting");
			return QuickSort.quickSortingPerson(distinctpersonData);
		}
	}

	private static List<Person> quickSortingPerson(List<Person> distinctpersonData) {
		return null;
	}

	public List<Person> removeDuplicates(List<Person> persons) {

		Set<Person> uniqPersonData = persons.stream().distinct().collect(Collectors.toSet());
		return uniqPersonData.stream().collect(Collectors.toList());

	}

	public List<Person> quickSort(List<Person> persons, Comparator<Person> comparator, boolean isDescendingOrder) {
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

	public static void quickSort(Person[] arr, int low, int high) {
		if (arr == null || arr.length == 0) {
			return;
		}
		if (low >= high) {
			return;
		}
		int middle = low + (high - low) / 2;
		Person pivot = arr[middle];
		int i = low, j = high;
		while (i <= j) {
			while (arr[i].getCijfer() < pivot.getCijfer()) {
				i++;
			}
			while (arr[j].getCijfer() > pivot.getCijfer()) {
				j--;
			}
			if (i <= j) {
				Person temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}
	}
}