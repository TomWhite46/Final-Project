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

import com.example.demo.data.Address;
import com.example.demo.data.repo.AddressRepo;

@SpringBootTest
@ActiveProfiles("test")
public class AddressServiceUnitTest {

	@Autowired
	private AddressService service;

	@MockBean
	private AddressRepo repo;

	@Test
	void testGetAllAddresses() {

		List<Address> testAddress = List.of(new Address(1, "Beechcroft", "SN3 9QP", "Cheltenham", "12"));

		Mockito.when(this.repo.findAll()).thenReturn(testAddress);

		assertThat(this.service.getAllAddresses()).isEqualTo(testAddress);
		assertThat(testAddress.size()).isEqualTo(1);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByAddressId() {

		Integer search = 1;

		Address testAddress = new Address(search, "Beechcroft", "SN3 9QP", "Cheltenham", "12");

		Mockito.when(this.repo.findById(1)).thenReturn(Optional.of(testAddress));

		assertThat(this.service.getByAddressId(search)).isEqualTo(testAddress);

		Mockito.verify(this.repo, Mockito.times(1)).findById(search);
		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetAddressPersonId() {
		List<Address> testAddress = List.of(new Address(1, "Beechcroft", "SN3 9QP", "Cheltenham", "12"));

		Long personId = (long) 1;

		Mockito.when(this.service.getAddressPersonId(personId)).thenReturn(testAddress);
		assertThat(this.service.getAddressPersonId(personId)).isEqualTo(testAddress);

	}

}
