package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.data.MobilePhone;
import com.example.demo.data.repo.MobilePhoneRepo;

@SpringBootTest
@ActiveProfiles("test")
public class MobilePhoneServiceUnitTest {

	@Autowired
	private MobilePhoneService service;

	@MockBean
	private MobilePhoneRepo repo;

	@Test
	void testGetAllMobilePhones() {

		List<MobilePhone> testMobilePhone = List.of(new MobilePhone(1, "07551 123123", "Three"));

		Mockito.when(this.repo.findAll()).thenReturn(testMobilePhone);

		assertThat(this.service.getAllMobilePhones()).isEqualTo(testMobilePhone);
		assertThat(testMobilePhone.size()).isEqualTo(1);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		Mockito.verifyNoMoreInteractions(this.repo);
	}

// 	@Test
// 	void testGetPhoneByPersonId() {

// 		List<MobilePhone> testMobilePhone = List.of(new MobilePhone(1, "07551 123123", "Three"));

// 		int personId = 0;

// 		Mockito.when(this.repo.getPhoneByPersonId(personId)).thenReturn(testMobilePhone);

// 		assertThat(this.service.getPhoneByPersonId(personId)).isEqualTo(testMobilePhone);

// 		Mockito.verify(this.repo, Mockito.times(1)).findAll();
// 		Mockito.verifyNoMoreInteractions(this.repo);

// 	}

}
