package com.example.demo.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Person;
import com.example.demo.data.Person_Citizen;

@Repository
public interface PersonCitizenRepo extends JpaRepository<Person_Citizen, Integer> {

	Person_Citizen findByPerson(Person person);

}
