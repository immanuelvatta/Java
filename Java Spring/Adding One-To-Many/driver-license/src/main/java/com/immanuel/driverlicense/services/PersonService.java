package com.immanuel.driverlicense.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.immanuel.driverlicense.models.Person;
import com.immanuel.driverlicense.repositories.PersonRepository;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
