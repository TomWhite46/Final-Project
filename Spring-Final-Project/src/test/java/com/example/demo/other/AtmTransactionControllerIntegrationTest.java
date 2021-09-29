//package com.example.demo.other;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.ResultMatcher;
//
//import com.example.demo.data.AtmTransaction;
//import com.example.demo.dto.AtmPointDTO;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//public class AtmTransactionControllerIntegrationTest {
//
//	@Autowired
//	private MockMvc mockMVC;
//
//	@Autowired
//	private ObjectMapper mapper;
//
//	@Test
//	void contextLoads() throws Exception {
//		assertThat(mockMVC).isNotNull();
//	}
//
//	@Test
//	void testGetByAtmCardNumber() throws Exception {
//
//		RequestBuilder request = get("/getByAtmCardNumber/1234567891");
//
//		ResultMatcher checkStatus = status().isOk();
//
//		List<AtmTransaction> testAtmTransaction = List
//				.of(new AtmTransaction(0, 1234, "2015-05-03T17:34:54.880", (long) 1234567891, "Cash", 120.00));
//
//		String testAtmTransactionAsJSON = this.mapper.writeValueAsString(testAtmTransaction);
//
//		ResultMatcher checkBody = content().json(testAtmTransactionAsJSON);
//		System.out.println(checkBody);
//		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);
//
//	}
//
//	@Test
//	void testGetAllAtmInfo() throws Exception {
//
//		RequestBuilder request = get("/getByAtmId/1234");
//
//		ResultMatcher checkStatus = status().isOk();
//
//		AtmPointDTO testAtmPoint = new AtmPointDTO(1234, "Tesco", "Clive Road", "GL1 4RU");
//
//		System.out.println(testAtmPoint);
//		String testAtmPointAsJSON = this.mapper.writeValueAsString(testAtmPoint);
//
//		ResultMatcher checkBody = content().json(testAtmPointAsJSON);
//		System.out.println(testAtmPointAsJSON);
//		System.out.println(checkBody);
//		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);
//
//	}

//	@GetMapping("getByAtmId/{atmId}")
//	public ResponseEntity<AtmPoint> getByAtmId1(@PathVariable Integer atmId) {
//		return new ResponseEntity<>(this.service.getByAtmId(atmId), HttpStatus.OK);
//	}

//	@GetMapping("getByAtmCardNumber/{cardNumber}")
//	public ResponseEntity<List<AtmTransaction>> getByAtmCardNumber(@PathVariable Long cardNumber) {
//		return ResponseEntity.ok(this.service.getByAtmCardNumber(cardNumber));
//	}
//
//	@GetMapping("getByEposCardNumber/{cardNumber}")
//	public ResponseEntity<List<EposTransaction>> getByEposCardNumber(@PathVariable Long cardNumber) {
//		return ResponseEntity.ok(this.eposService.getByEposCardNumber(cardNumber));
//	}
//
//	@GetMapping("getAllAtmInfo/{atmId}")
//	public ResponseEntity<Optional<AtmPoint>> getByAtmId(@PathVariable Integer atmId) {
//		return ResponseEntity.ok(this.service.getAllAtmInfo(atmId));
//	}
//
//	@GetMapping("getAllEposInfo/{eposId}")
//	public ResponseEntity<Optional<Epos>> getByEposId(@PathVariable Integer eposId) {
//		return ResponseEntity.ok(this.eposService.getByEposId(eposId));
//	}
