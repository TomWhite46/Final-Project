package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

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
		List<Person> testPeople = List
				.of(new Person((long) 1, "true", "Rob", "Fletcher", "2000, 05, 30", "Shrewsbury", "British", "Male"));

		Mockito.when(this.repo.findAll()).thenReturn(testPeople);

		assertThat(this.service.getAllPerson()).isEqualTo(testPeople);

		assertThat(testPeople.size()).isEqualTo(1);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();

		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByFirstName() {
		List<Person> testPeople = List
				.of(new Person((long) 1, "true", "Rob", "Fletcher", "2000, 05, 30", "Shrewsbury", "British", "Male"));

		String search = "rob";

		Mockito.when(this.repo.findByPersonForenamesIgnoreCase(search)).thenReturn(testPeople);

		assertThat(this.service.getByPersonForenames(search)).isEqualTo(testPeople);

		Mockito.verify(this.repo, Mockito.times(1)).findByPersonForenamesIgnoreCase(search);

		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByLastName() {
		List<Person> testPeople = List
				.of(new Person((long) 1, "true", "Rob", "Fletcher", "2000, 05, 30", "Shrewsbury", "British", "Male"));

		String search = "fletcher";

		Mockito.when(this.repo.findByPersonSurnameIgnoreCase(search)).thenReturn(testPeople);

		assertThat(this.service.getByPersonSurname(search)).isEqualTo(testPeople);

		Mockito.verify(this.repo, Mockito.times(1)).findByPersonSurnameIgnoreCase(search);

		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByNationality() {
		List<Person> testPeople = List
				.of(new Person((long) 1, "true", "Rob", "Fletcher", "2000, 05, 30", "Shrewsbury", "British", "Male"));

		String search = "british";

		Mockito.when(this.repo.findByPersonNationalityIgnoreCase(search)).thenReturn(testPeople);

		assertThat(this.service.getByPersonNationality(search)).isEqualTo(testPeople);

		Mockito.verify(this.repo, Mockito.times(1)).findByPersonNationalityIgnoreCase(search);

		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByDOB() {
		List<Person> testPeople = List
				.of(new Person((long) 1, "true", "Rob", "Fletcher", "2000, 05, 30", "Shrewsbury", "British", "Male"));

		String search = "2000, 05, 30";

		Mockito.when(this.repo.findByPersonDOB(search)).thenReturn(testPeople);

		assertThat(this.service.getByPersonDOB(search)).isEqualTo(testPeople);

		Mockito.verify(this.repo, Mockito.times(1)).findByPersonDOB(search);

		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByPOB() {
		List<Person> testPeople = List
				.of(new Person((long) 1, "true", "Rob", "Fletcher", "2000, 05, 30", "Shrewsbury", "British", "Male"));

		String search = "shrewsbury";

		Mockito.when(this.repo.findByPersonPOBIgnoreCase(search)).thenReturn(testPeople);

		assertThat(this.service.getByPersonPOB(search)).isEqualTo(testPeople);

		Mockito.verify(this.repo, Mockito.times(1)).findByPersonPOBIgnoreCase(search);

		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByGender() {
		List<Person> testPeople = List
				.of(new Person((long) 1, "true", "Rob", "Fletcher", "2000, 05, 30", "Shrewsbury", "British", "Male"));

		String search = "Male";

		Mockito.when(this.repo.findByPersonSex(search)).thenReturn(testPeople);

		assertThat(this.service.getByPersonSex(search)).isEqualTo(testPeople);

		Mockito.verify(this.repo, Mockito.times(1)).findByPersonSex(search);

		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByID() {
		Long search = (long) 1;

		Person testPerson = new Person((long) 1, "true", "Rob", "Fletcher", "2000, 05, 30", "Shrewsbury", "British",
				"Male");

		Mockito.when(this.repo.findById(search)).thenReturn(Optional.of(testPerson));

		assertThat(this.service.getByPersonID(search)).isEqualTo(testPerson);

		Mockito.verify(this.repo, Mockito.times(1)).findById(search);

		Mockito.verifyNoMoreInteractions(this.repo);
	}

}
