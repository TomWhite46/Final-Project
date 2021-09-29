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

import com.example.demo.data.Citizen;
import com.example.demo.data.repo.CitizenRepo;

@SpringBootTest
@ActiveProfiles("test")
public class CitizenServiceDBUnitTest {

	@Autowired
	private CitizenServiceDB service;

	@MockBean
	private CitizenRepo repo;

	@Test
	void contextLoads() throws Exception {
		assertThat(service).isNotNull();
	}

	@Test
	void testGetAll() {
		List<Citizen> testCitizens = List
				.of(new Citizen("1", "Rob", "Fletcher", "2 Grange Close", "2000, 05, 30", "Shrewsbury", "Male"));

		Mockito.when(this.repo.findAll()).thenReturn(testCitizens);

		assertThat(this.service.getAllCitizens()).isEqualTo(testCitizens);

		assertThat(testCitizens.size()).isEqualTo(1);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByFirstName() {
		List<Citizen> testCitizens = List
				.of(new Citizen("1", "Rob", "Fletcher", "2 Grange Close", "2000, 05, 30", "Shrewsbury", "Male"));

		String search = "rob";

		Mockito.when(this.repo.findByForenamesIgnoreCase(search)).thenReturn(testCitizens);

		assertThat(this.service.getByCitizenForenames(search)).isEqualTo(testCitizens);

		Mockito.verify(this.repo, Mockito.times(1)).findByForenamesIgnoreCase(search);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByLastName() {
		List<Citizen> testCitizens = List
				.of(new Citizen("1", "Rob", "Fletcher", "2 Grange Close", "2000, 05, 30", "Shrewsbury", "Male"));

		String search = "fletcher";

		Mockito.when(this.repo.findBySurnameIgnoreCase(search)).thenReturn(testCitizens);

		assertThat(this.service.getByCitizenSurname(search)).isEqualTo(testCitizens);

		Mockito.verify(this.repo, Mockito.times(1)).findBySurnameIgnoreCase(search);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByAddress() {
		List<Citizen> testCitizens = List
				.of(new Citizen("1", "Rob", "Fletcher", "2 Grange Close", "2000, 05, 30", "Shrewsbury", "Male"));

		String search = "2 Grange Close";

		Mockito.when(this.repo.findByAddressIgnoreCase(search)).thenReturn(testCitizens);

		assertThat(this.service.getByCitizenAddress(search)).isEqualTo(testCitizens);

		Mockito.verify(this.repo, Mockito.times(1)).findByAddressIgnoreCase(search);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByDOB() {
		List<Citizen> testCitizens = List
				.of(new Citizen("1", "Rob", "Fletcher", "2 Grange Close", "2000, 05, 30", "Shrewsbury", "Male"));

		String testDOB = "2000, 05, 30";

		Mockito.when(this.repo.findByDob(testDOB)).thenReturn(testCitizens);

		assertThat(this.service.getByCitizenDob(testDOB)).isEqualTo(testCitizens);

		Mockito.verify(this.repo, Mockito.times(1)).findByDob(testDOB);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByPOB() {
		List<Citizen> testCitizens = List
				.of(new Citizen("1", "Rob", "Fletcher", "2 Grange Close", "2000, 05, 30", "Shrewsbury", "Male"));

		String search = "shrewsbury";

		Mockito.when(this.repo.findByPlaceOfBirthIgnoreCase(search)).thenReturn(testCitizens);

		assertThat(this.service.getByCitizenPOB(search)).isEqualTo(testCitizens);

		Mockito.verify(this.repo, Mockito.times(1)).findByPlaceOfBirthIgnoreCase(search);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByGender() {
		List<Citizen> testCitizens = List
				.of(new Citizen("1", "Rob", "Fletcher", "2 Grange Close", "2000, 05, 30", "Shrewsbury", "Male"));

		String search = "Male";

		Mockito.when(this.repo.findBySex(search)).thenReturn(testCitizens);

		assertThat(this.service.getByCitizenSex(search)).isEqualTo(testCitizens);

		Mockito.verify(this.repo, Mockito.times(1)).findBySex(search);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByID() {
		String search = "1";

		Citizen testCitizen = new Citizen(search, "Rob", "Fletcher", "2 Grange Close", "2000, 05, 30", "Shrewsbury",
				"Male");

		Mockito.when(this.repo.findById(search)).thenReturn(Optional.of(testCitizen));

		assertThat(this.service.getByCitizenID(search)).isEqualTo(testCitizen);

		Mockito.verify(this.repo, Mockito.times(1)).findById(search);
		Mockito.verifyNoMoreInteractions(this.repo);

	}
}
