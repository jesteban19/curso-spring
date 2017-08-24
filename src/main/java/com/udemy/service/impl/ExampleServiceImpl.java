package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Jhon", 24));
		people.add(new Person("Eva", 14));
		people.add(new Person("Ana", 44));
		people.add(new Person("Petter", 14));
		people.add(new Person("Fiorella", 44));
		people.add(new Person("Saori", 54));
		
		return people;
	}

}
