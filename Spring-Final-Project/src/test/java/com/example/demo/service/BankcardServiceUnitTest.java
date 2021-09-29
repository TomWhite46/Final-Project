package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.data.Bankcard;
import com.example.demo.data.repo.BankcardRepo;

@SpringBootTest
@ActiveProfiles("test")
public class BankcardServiceUnitTest {

	@Autowired
	private BankcardService service;

	@MockBean
	private BankcardRepo repo;

	@Test
	void testGetAllBankCards() {

		List<Bankcard> testBankcard = List.of(new Bankcard(1, "123456", (long) 12345678));

		Mockito.when(this.repo.findAll()).thenReturn(testBankcard);

		assertThat(this.service.getAllBankcards()).isEqualTo(testBankcard);
		assertThat(testBankcard.size()).isEqualTo(1);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		Mockito.verifyNoMoreInteractions(this.repo);

	}

	@Test
	void testGetBankcardByPersonId() {
		List<Bankcard> testBankcard = List.of(new Bankcard(1, "123456", (long) 12345678));

		Long personId = (long) 1;

		Mockito.when(this.service.getBankcardByPersonId(personId)).thenReturn(testBankcard);
		assertThat(this.service.getBankcardByPersonId(personId)).isEqualTo(testBankcard);

	}

}
