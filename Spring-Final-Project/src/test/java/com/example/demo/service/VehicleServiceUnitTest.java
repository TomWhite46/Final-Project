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

import com.example.demo.data.Vehicle;
import com.example.demo.data.repo.VehicleRepo;

@SpringBootTest
@ActiveProfiles("test")
public class VehicleServiceUnitTest {

	@Autowired
	private VehicleService service;

	@MockBean
	private VehicleRepo repo;

	@Test
	void testGetAllVehicles() {
		List<Vehicle> testVehicle = List.of(new Vehicle("Black", 1, "Zoe", "AB12 3CD", "Renault"));

		Mockito.when(this.repo.findAll()).thenReturn(testVehicle);

		assertThat(this.service.getAllVehicles()).isEqualTo(testVehicle);

		assertThat(testVehicle.size()).isEqualTo(1);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();

		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetByVehicleId() {

		Integer search = 1;

		Vehicle testVehicle = new Vehicle("Black", search, "Zoe", "AB12 3CD", "Renault");

		Mockito.when(this.repo.findById(1)).thenReturn(Optional.of(testVehicle));

		assertThat(this.service.getByVehicleId(search)).isEqualTo(testVehicle);

		Mockito.verify(this.repo, Mockito.times(1)).findById(search);
		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetVehicleByPersonId() {
		List<Vehicle> testVehicle = List.of(new Vehicle("Black", 1, "Zoe", "AB12 3CD", "Renault"));

		Long personId = (long) 1;

		Mockito.when(this.service.getVehicleByPersonId(personId)).thenReturn(testVehicle);
		assertThat(this.service.getVehicleByPersonId(personId)).isEqualTo(testVehicle);
	}

}
