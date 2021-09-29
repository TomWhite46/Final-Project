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

import com.example.demo.data.BusinessAddress;
import com.example.demo.data.repo.BusinessAddressRepo;

@SpringBootTest
@ActiveProfiles("test")
public class BusinessAddressServiceUnitTest {

	@Autowired
	private BusinessAddressService service;

	@MockBean
	private BusinessAddressRepo repo;

	@Test
	void testGetAllBusinessAddresses() {

		List<BusinessAddress> testBusinessAddress = List
				.of(new BusinessAddress(1, "Co-op", "Beechcroft", "Shopping", "GL9 2DQ", "Swindon", "2"));

		Mockito.when(this.repo.findAll()).thenReturn(testBusinessAddress);

		assertThat(this.service.getAllBusinessAddresses()).isEqualTo(testBusinessAddress);
		assertThat(testBusinessAddress.size()).isEqualTo(1);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByBusinessAddressId() {
		Integer search = 1;

		BusinessAddress testBusinessAddress = new BusinessAddress(search, "Co-op", "Beechcroft", "Shopping", "GL9 2DQ",
				"Swindon", "2");

		Mockito.when(this.repo.findById(1)).thenReturn(Optional.of(testBusinessAddress));

		assertThat(this.service.getByBusinessAddressId(search)).isEqualTo(testBusinessAddress);

		Mockito.verify(this.repo, Mockito.times(1)).findById(search);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetBusinessAddressPersonId() {
		List<BusinessAddress> testBusinessAddress = List
				.of(new BusinessAddress(1, "Co-op", "Beechcroft", "Shopping", "GL9 2DQ", "Swindon", "2"));

		Long businessId = (long) 1;

		Mockito.when(this.service.getBusinessAddressPersonId(businessId)).thenReturn(testBusinessAddress);
		assertThat(this.service.getBusinessAddressPersonId(businessId)).isEqualTo(testBusinessAddress);

	}
}
