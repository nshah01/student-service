package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Student;

public interface StudentRepository extends MongoRepository<Student , String> {

	public Student findByFirstname(String firstname);
	
	public Student findByLastname(String lastname);
	
	//public Person insertPerson(Person person);
}
