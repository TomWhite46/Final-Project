package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.data.Person;
import com.example.demo.data.repo.PersonRepo;

@SpringBootTest
@ActiveProfiles("test")
public class PersonServiceDBUnitTest {
	
	@Autowired
	private PersonServiceDB service;
	
	@MockBean
	private PersonRepo repo;
	
	@Test
	void testGetAll() {
		List<Person> testPeople = List.of(new Person("1",true,"Rob","Fletcher",LocalDate.of(2000, 05, 30),"Shrewsbury","British","Male"));
		
		Mockito.when(this.repo.findAll()).thenReturn(testPeople);
		
		assertThat(this.service.getAllPerson()).isEqualTo(testPeople);
		
		assertThat(testPeople.size()).isEqualTo(1);
		
		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		
		Mockito.verifyNoMoreInteractions(this.repo);
	}

}
