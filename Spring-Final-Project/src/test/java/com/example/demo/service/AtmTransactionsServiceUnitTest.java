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

import com.example.demo.data.AtmPoint;
import com.example.demo.data.AtmTransaction;
import com.example.demo.data.repo.AtmPointRepo;
import com.example.demo.data.repo.AtmTransactionsRepo;

@SpringBootTest
@ActiveProfiles("test")
public class AtmTransactionsServiceUnitTest {

	@Autowired
	private AtmTransactionsService service;

	@MockBean
	private AtmTransactionsRepo repo;

	@MockBean
	private AtmPointRepo atmRepo;

	@Test
	void testGetByAtmCardNumber() {

		Long cardNumber = (long) 12345678;

		List<AtmTransaction> testAtmTransaction = List
				.of(new AtmTransaction(1, 1, "2015-05-01 09:08:52", cardNumber, "Cash", 140.00));

		Mockito.when(this.repo.findByCardNumber(cardNumber)).thenReturn(testAtmTransaction);

		assertThat(this.service.getByAtmCardNumber(cardNumber)).isEqualTo(testAtmTransaction);

		Mockito.verify(this.repo, Mockito.times(1)).findByCardNumber(cardNumber);
		Mockito.verifyNoMoreInteractions(this.repo);
	}

	@Test
	void testGetAllAtmInfo() {
		Integer atmId = 1;

		AtmPoint testAtmPoint = new AtmPoint(atmId, "Bank of England", "Beechcroft Road", "GL3 0RP");

		Mockito.when(this.atmRepo.findById(1)).thenReturn(Optional.of(testAtmPoint));

		assertThat(this.service.getAllAtmInfo(atmId)).isEqualTo(Optional.of(testAtmPoint));

		Mockito.verify(this.atmRepo, Mockito.times(1)).findById(atmId);
		Mockito.verifyNoMoreInteractions(this.atmRepo);
	}

	@Test
	void testGetAtmTransactionByPersonId() {
		List<AtmTransaction> testAtmTransaction = List
				.of(new AtmTransaction(1, 1, "2015-05-01 09:08:52", (long) 1234567, "Cash", 140.00));

		Long personId = (long) 1;

		Mockito.when(this.service.getAtmTransactionByPersonId(personId)).thenReturn(testAtmTransaction);
		assertThat(this.service.getAtmTransactionByPersonId(personId)).isEqualTo(testAtmTransaction);

	}

}
