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

import com.example.demo.data.Passport;
import com.example.demo.data.repo.PassportRepo;

@SpringBootTest
@ActiveProfiles("test")
public class PassportServiceUnitTest {

	@Autowired
	private PassportService service;

	@MockBean
	private PassportRepo repo;

	@Test
	void testGetAllPassports() {
		List<Passport> testPassport = List.of(new Passport((long) 1, "Norman", "Clive", "GBR", "1995-13-12", "Male",
				"Swindon", "Britain", "2010-12-12", "2030-12-12"));

		Mockito.when(this.repo.findAll()).thenReturn(testPassport);

		assertThat(this.service.getAllPassports()).isEqualTo(testPassport);
		assertThat(testPassport.size()).isEqualTo(1);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByPassportNumber() {
		Long passportNumber = (long) 1;

		Passport testPassport = new Passport(passportNumber, "Norman", "Clive", "GBR", "1995-13-12", "Male", "Swindon",
				"Britain", "2010-12-12", "2030-12-12");
		Mockito.when(this.repo.findById(passportNumber)).thenReturn(Optional.of(testPassport));

		assertThat(this.service.getbyPassportNumber(passportNumber)).isEqualTo(testPassport);

		Mockito.verify(this.repo, Mockito.times(1)).findById(passportNumber);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

}
