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

import com.example.demo.data.Epos;
import com.example.demo.data.EposTransaction;
import com.example.demo.data.repo.EposRepo;
import com.example.demo.data.repo.EposTransactionRepo;

@SpringBootTest
@ActiveProfiles("test")
public class EposTransactionServiceUnitTest {

	@Autowired
	private EposTransactionService service;

	@MockBean
	private EposTransactionRepo repo;

	@MockBean
	private EposRepo eposRepo;

	@Test
	void contextLoads() throws Exception {
		assertThat(service).isNotNull();
	}

	@Test
	void testGetByEposCardNumber() {
		Long cardNumber = (long) 12345678;
		List<EposTransaction> testEposTransaction = List
				.of(new EposTransaction(1, 1, "2015-05-01 09:08:52", cardNumber, (long) 1234567, 140.00));

		Mockito.when(this.repo.findByEposCardNumber(cardNumber)).thenReturn(testEposTransaction);
		assertThat(this.service.getByEposCardNumber(cardNumber)).isEqualTo(testEposTransaction);

		Mockito.verify(this.repo, Mockito.times(1)).findByEposCardNumber(cardNumber);
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetByEposId() {
		Integer eposId = 1;

		Epos testEpos = new Epos(eposId, "Co-op", "Beechcroft", "GL2 7JS");

		Mockito.when(this.eposRepo.findById(eposId)).thenReturn(Optional.of(testEpos));

		assertThat(this.service.getByEposId(eposId)).isEqualTo(Optional.of(testEpos));

		Mockito.verify(this.eposRepo, Mockito.times(1)).findById(eposId);
		Mockito.verifyNoMoreInteractions(this.eposRepo);

	}

	@Test
	void testGetEposTransactionByPersonId() {
		List<EposTransaction> testEposTransaction = List
				.of(new EposTransaction(1, 1, "2015-05-01 09:08:52", (long) 12345678, (long) 1234567, 140.00));

		Long personId = (long) 1;

		Mockito.when(this.service.getEposTransactionByPersonId(personId)).thenReturn(testEposTransaction);
		assertThat(this.service.getEposTransactionByPersonId(personId)).isEqualTo(testEposTransaction);

	}

}
