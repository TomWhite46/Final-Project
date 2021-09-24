package com.example.demo.other;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

import com.example.demo.data.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:person-schema.sql",
		"classpath:person-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class PersonControllerIntegrationTest {

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

		RequestBuilder request = get("/getAllPeople");

		Person testPerson = new Person((long) 1, "true", "Clive", "Clivedon", LocalDate.of(1995, 03, 12), "CliveTown",
				"British", "Male");
		testPerson.setPersonID((long) 1);

		List<Person> testPeople = new ArrayList<Person>();
		testPeople.add(testPerson);

		System.out.println(testPeople);
		String testPeopleJSON = this.mapper.writeValueAsString(testPeople);

		ResultMatcher checkStatus = status().is(200);
		ResultMatcher checkBody = content().json(testPeopleJSON);

		this.mockMVC.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testFindByName() throws Exception {
		RequestBuilder request = get("/getByFirstName/Clive");

		ResultMatcher checkStatus = status().isOk();

		List<Person> testPerson = List.of(new Person((long) 1, "true", "Clive", "Clivedon", LocalDate.of(1995, 03, 12),
				"CliveTown", "British", "Male"));

		String testPersonAsJSON = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJSON);

		this.mockMVC.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

}
