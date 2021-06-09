package com.nisum.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.nisum.model.Person;

public class Test {
	public static void main(String[] args) {
		Comparator<Person> comparator = null;
		boolean isDescendingOrder = false;
		List<Person> personlist = new ArrayList<Person>();
		personlist.add(new Person(1, 12343234, "kumar", "chette"));
		personlist.add(new Person(2, 12685869, "rakesh", "bandari"));
		personlist.add(new Person(3, 98778765, "shiva", "choedary"));
		personlist.add(new Person(4, 97669876, "buuny", "egurla"));
		personlist.add(new Person(5, 11222111, "rajesh", "ponnala"));
		personlist.add(new Person(6, 99866587, "saketh", "padigela"));
		personlist.add(new Person(7, 12343234, "kumar", "oraging"));

		BubbleSort bubbleSort = new BubbleSort();
		List<Person> listOfpersons = bubbleSort.bubbleSort(personlist, isDescendingOrder);
		for (Person p : listOfpersons) {
			System.out.println(p.id + " " + p.getFirstName() + " " + p.adharNumber);
		}

		List<Person> listofPersonUsingComparator = bubbleSort.bubbleSort(personlist, comparator, isDescendingOrder);
		System.out.println(" using comparator to sorting the elements");
		for (Person p : listofPersonUsingComparator) {
			System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.adharNumber + " " + p.id);
		}

		SelectionSort selectionsorting = new SelectionSort();
		List<Person> selectionSortlist = selectionsorting.SelectionSort(personlist, isDescendingOrder);
		for (Person p : selectionSortlist) {
			System.out.println(p.id + " " + p.getFirstName() + " " + p.adharNumber);
		}

		List<Person> selectionsortUsingComparator = selectionsorting.selectionSort(personlist, comparator,
				isDescendingOrder);
		System.out.println(" using comparator to sorting the elements");
		for (Person p : selectionsortUsingComparator) {
			System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.adharNumber + " " + p.id);
		}
	}

	InsertionSort insertionsort = new InsertionSort();
	List<Person> insertionsortlist = insertionsort.insertionSort(insertionsortlist, isDescendingOrder);for(
	Person p1:insertionsortlist)
	{
		System.out.println(p1.id + " " + p1.firstName + " " + p1.adharNumber);
	}
	List<Person> insertionUsingComparator = insertionsort.insertionSort(insertionsortlist, comparator,
			isDescendingOrder);System.out.println(" using comparator to sorting the elements");

	for(
	Person p:insertionUsingComparator)
	{
		System.out.println(p1.firstName + " " + p1.lastName + " " + p1.adharNumber + " " + p1.id);
	}

	QuickSort quickSort = new QuickSort();
	List<Person> quickSort1 = quickSort.quickSort(quickSort, isDescendingOrder);for(
	Person p1:quicksortlist)
	{
		System.out.println(p1.id + " " + p1.firstName + " " + p1.adharNumber);
	}
	List<Person> quickUsingComparator1 = quickSort.quickSort(quickSort, comparator,
			isDescendingOrder);System.out.println(" using comparator to sorting the elements");

	for(
	Person p1:quickUsingComparator)
	{
		System.out.println(p1.firstName + " " + p1.lastName + " " + p1.adharNumber + " " + p1.id);
	}

	MergeSort MergeSort = new MergeSort();
	List<Person> mergeSort = mergeSort.mergeSort(mergeSort, isDescendingOrder);for(
	Person p1:mergesortlist)
	{
		System.out.println(p1.id + " " + p1.firstName + " " + p1.adharNumber);
	}
	List<Person> mergeUsingComparator1 = mergeSort.mergeSort(mergeSort, comparator,
			isDescendingOrder);System.out.println(" using comparator to sorting the elements");

	for(
	Person p1:mergeUsingComparator)
	{
		System.out.println(p1.firstName + " " + p1.lastName + " " + p1.adharNumber + " " + p1.id);
	}
}}