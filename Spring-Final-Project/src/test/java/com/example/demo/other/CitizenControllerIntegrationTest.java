package com.example.demo.other;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.text.IsEmptyString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.example.demo.data.Citizen;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:citizen-schema.sql",
		"classpath:citizen-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class CitizenControllerIntegrationTest {

	@Autowired
	private MockMvc mockMVC;

	@Autowired
	private ObjectMapper mapper;

	@Test
	void contextLoads() throws Exception {
		assertThat(mockMVC).isNotNull();
	}

	@Test
	void testGetAllPeople() throws Exception {

		RequestBuilder request = get("/getAllCitizens");

		Citizen testCitizen = new Citizen("1", "Bob", "Norman", "Swindon", "1995-13-12", "Swindon", "Male");

		List<Citizen> testCitizens = new ArrayList<Citizen>();
		testCitizens.add(testCitizen);

		System.out.println(testCitizens);
		String testPeopleJSON = this.mapper.writeValueAsString(testCitizens);

		ResultMatcher checkStatus = status().is(200);
		ResultMatcher checkBody = content().json(testPeopleJSON);

		this.mockMVC.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testFindByForename() throws Exception {
		RequestBuilder request = get("/getByCitizenForenames/Bob");

		ResultMatcher checkStatus = status().isOk();

		List<Citizen> testCitizen = List
				.of(new Citizen("1", "Bob", "Norman", "Swindon", "1995-13-12", "Swindon", "Male"));

		String testCitizenAsJSON = this.mapper.writeValueAsString(testCitizen);

		ResultMatcher checkBody = content().json(testCitizenAsJSON);

		this.mockMVC.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testFindBySurname() throws Exception {
		RequestBuilder request = get("/getByCitizenLastName/Norman");

		ResultMatcher checkStatus = status().isOk();

		List<Citizen> testCitizen = List
				.of(new Citizen("1", "Bob", "Norman", "Swindon", "1995-13-12", "Swindon", "Male"));

		String testCitizenAsJSON = this.mapper.writeValueAsString(testCitizen);

		ResultMatcher checkBody = content().json(testCitizenAsJSON);

		this.mockMVC.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testFindByAddress() throws Exception {
		RequestBuilder request = get("/getByCitizenAddress/Swindon");

		ResultMatcher checkStatus = status().isOk();

		List<Citizen> testCitizen = List
				.of(new Citizen("1", "Bob", "Norman", "Swindon", "1995-13-12", "Swindon", "Male"));

		String testCitizenAsJSON = this.mapper.writeValueAsString(testCitizen);

		ResultMatcher checkBody = content().json(testCitizenAsJSON);
		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);

	}

	@Test
	void testFindByDob() throws Exception {
		RequestBuilder request = get("/getByCitizenDob/1995-13-12");

		ResultMatcher checkStatus = status().isOk();

		List<Citizen> testCitizen = List
				.of(new Citizen("1", "Bob", "Norman", "Swindon", "1995-13-12", "Swindon", "Male"));

		String testCitizenAsJSON = this.mapper.writeValueAsString(testCitizen);

		ResultMatcher checkBody = content().json(testCitizenAsJSON);
		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);

	}

	@Test
	void testFindByPOB() throws Exception {
		RequestBuilder request = get("/getByCitizenPOB/Swindon");

		ResultMatcher checkStatus = status().isOk();

		List<Citizen> testCitizen = List
				.of(new Citizen("1", "Bob", "Norman", "Swindon", "1995-13-12", "Swindon", "Male"));

		String testCitizenAsJSON = this.mapper.writeValueAsString(testCitizen);

		ResultMatcher checkBody = content().json(testCitizenAsJSON);
		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);

	}

	@Test
	void testFindPersonBySex() throws Exception {
		RequestBuilder request = get("/getByCitizenSex/Male");

		ResultMatcher checkStatus = status().isOk();

		List<Citizen> testCitizen = List
				.of(new Citizen("1", "Bob", "Norman", "Swindon", "1995-13-12", "Swindon", "Male"));

		String testCitizenAsJSON = this.mapper.writeValueAsString(testCitizen);

		ResultMatcher checkBody = content().json(testCitizenAsJSON);
		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);

	}

	@Test
	void testFindPersonById() throws Exception {
		RequestBuilder request = get("/getByCitizenID/1");

		ResultMatcher checkStatus = status().isOk();

		Citizen testCitizen = new Citizen("1", "Bob", "Norman", "Swindon", "1995-13-12", "Swindon", "Male");

		String testCitizenAsJSON = this.mapper.writeValueAsString(testCitizen);

		ResultMatcher checkBody = content().json(testCitizenAsJSON);
		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);

	}

	@Test
	void testNotFindingPersonById() throws Exception {
		RequestBuilder request = get("/getByCitizenID/2");

		this.mockMVC.perform(request).andExpect(status().isOk())
				.andExpect(content().string(IsEmptyString.emptyOrNullString()));

	}

	@Test
	void testNotFindingPersonByForename() throws Exception {
		RequestBuilder request = get("/getByCitizenForenames/Clive");

		ResultMatcher checkBody = content().json("[]");

		this.mockMVC.perform(request).andExpect(status().isOk()).andExpect(checkBody);

	}

	@Test
	void testNotFindingPersonBySurname() throws Exception {
		RequestBuilder request = get("/getByCitizenLastName/Clive");

		ResultMatcher checkBody = content().json("[]");

		this.mockMVC.perform(request).andExpect(status().isOk()).andExpect(checkBody);

	}

	@Test
	void testNotFindingPersonByDob() throws Exception {
		RequestBuilder request = get("/getByCitizenDob/1966-12-09");

		ResultMatcher checkBody = content().json("[]");

		this.mockMVC.perform(request).andExpect(status().isOk()).andExpect(checkBody);

	}

}
