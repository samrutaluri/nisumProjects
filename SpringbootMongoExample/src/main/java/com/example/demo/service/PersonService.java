package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Person;


@Component
public interface PersonService {

	public void createPerson(List<Person> person);

	public Collection<Person> getAllPerson();

	public void deletePersonById(int id);

	public void updatePerson(Person emp);
}