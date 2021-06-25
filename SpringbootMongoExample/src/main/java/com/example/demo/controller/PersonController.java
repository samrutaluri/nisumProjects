package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

	@Autowired
	PersonService personservice;

	@GetMapping(value = "/getperson/{id}")
	public Collection<Person> getById(@PathVariable int id) {
		return personservice.getAllPerson();
	}

	@PostMapping(value = "/addperson")
	public String create(@RequestBody List<Person> person) {
		personservice.createPerson(person);
		return "Person recoreds are saved";
	}

	@PutMapping(value = "/update/{id}")
	public String update(@PathVariable int id, @RequestBody Person p) {
		p.setId(id);
		personservice.updatePerson(p);
		return "Person record for person= " + id + " updated.";
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable int id) {
		personservice.deletePersonById(id);
		return "Person record for person name= " + id + " deleted.";
	}

}