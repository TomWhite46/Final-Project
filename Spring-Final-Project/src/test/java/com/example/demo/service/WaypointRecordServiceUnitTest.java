package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.data.WaypointRecord;
import com.example.demo.data.repo.WaypointRecordRepo;

@SpringBootTest
@ActiveProfiles("test")
public class WaypointRecordServiceUnitTest {

	@Autowired
	private WaypointRecordService service;

	@MockBean
	private WaypointRecordRepo repo;

	@Test
	void testGetWaypointByPersonId() {
		List<WaypointRecord> testWaypointRecord = List.of(new WaypointRecord((long) 1,
				Timestamp.valueOf("2015-05-01 09:08:52"), 1, "Clive", 51.70248955568275, -1.9426944168514255));

		Long personId = (long) 1;

		Mockito.when(this.service.getWaypointByPersonId(personId)).thenReturn(testWaypointRecord);
		assertThat(this.service.getWaypointByPersonId(personId)).isEqualTo(testWaypointRecord);

	}

}
