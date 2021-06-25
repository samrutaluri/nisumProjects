package com.example.demo.serviceImpl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;

@Component
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;

	@Override
	public void createPerson(List<Person> person) {
		personRepository.saveAll(person);

	}

	@Override
	public Collection<Person> getAllPerson() {

		return personRepository.findAll();
	}

	@Override
	public void updatePerson(Person person) {
		personRepository.save(person);

	}

	@Override
	public void deletePersonById(int id) {
		personRepository.deleteById(id);

	}
}