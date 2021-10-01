package com.example.demo.other;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
	void testFindByForename() throws Exception {
		RequestBuilder request = get("/findPersonByForename/Bob");

		ResultMatcher checkStatus = status().isOk();

		List<Person> testPerson = List
				.of(new Person((long) 1, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male"));

		String testPersonAsJSON = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJSON);

		this.mockMVC.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testFindBySurname() throws Exception {
		RequestBuilder request = get("/findPersonBySurname/Norman");

		ResultMatcher checkStatus = status().isOk();

		List<Person> testPerson = List
				.of(new Person((long) 1, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male"));

		System.out.println(testPerson);
		String testPersonAsJSON = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJSON);
		System.out.println(testPersonAsJSON);
		this.mockMVC.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testFindByDob() throws Exception {
		RequestBuilder request = get("/findPersonByDob/1995-13-12");

		ResultMatcher checkStatus = status().isOk();

		List<Person> testPerson = List
				.of(new Person((long) 1, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male"));

		String testPersonAsJson = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJson);
		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);

	}

	@Test
	void testFindPersonById() throws Exception {
		RequestBuilder request = get("/getByID/1");

		ResultMatcher checkStatus = status().isOk();

		Person testPerson = new Person((long) 1, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male");

		String testPersonAsJson = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJson);
		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);

	}

	@Test
	void testFindPersonByForenamesAndSurname() throws Exception {
		RequestBuilder request = get("/findPersonByForenameSurname/Bob/Norman");

		ResultMatcher checkStatus = status().isOk();

		List<Person> testPerson = List
				.of(new Person((long) 1, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male"));

		String testPersonAsJson = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJson);

		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);
	}

	@Test
	void testFindPersonByForenamesAndSurnameAndDob() throws Exception {
		RequestBuilder request = get("/findPersonByForenameSurnameDob/Bob/Norman/1995-13-12");

		ResultMatcher checkStatus = status().isOk();

		List<Person> testPerson = List
				.of(new Person((long) 1, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male"));

		String testPersonAsJson = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJson);

		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);
	}

	@Test
	void testFindPersonByForenameDob() throws Exception {
		RequestBuilder request = get("/findPersonByForenameDob/Bob/1995-13-12");

		ResultMatcher checkStatus = status().isOk();

		List<Person> testPerson = List
				.of(new Person((long) 1, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male"));

		String testPersonAsJson = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJson);

		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);
	}

	@Test
	void testFindPersonBySurnameDob() throws Exception {
		RequestBuilder request = get("/findPersonBySurnameDob/Norman/1995-13-12");

		ResultMatcher checkStatus = status().isOk();

		List<Person> testPerson = List
				.of(new Person((long) 1, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male"));

		String testPersonAsJson = this.mapper.writeValueAsString(testPerson);

		ResultMatcher checkBody = content().json(testPersonAsJson);

		this.mockMVC.perform(request).andExpect(checkBody).andExpect(checkStatus);
	}

	@Test
	void testGetPartnerByPersonId() throws Exception {
		RequestBuilder request = get("/getFriendsByPersonId/1");

		ResultMatcher checkStatus = status().isOk();

		Long personId = (long) 1;
		Long partnerId = (long) 123456;

		List<Person> testPerson = List
				.of(new Person(personId, "true", "Bob", "Norman", "1995-13-12", "Swindon", "British", "Male"));

		String testPersonAsJSON = this.mapper.writeValueAsString(testPerson);
		String testPartnerIdAsJson = this.mapper.writeValueAsString(partnerId);

		ResultMatcher checkBody = content().json(testPersonAsJSON);

	}

	@Test
	void testNotFindingPersonById() throws Exception {
		RequestBuilder request = get("/getByID/2");

		this.mockMVC.perform(request).andExpect(status().isOk())
				.andExpect(content().string(IsEmptyString.emptyOrNullString()));

	}

	@Test
	void testNotFindingPersonByForename() throws Exception {
		RequestBuilder request = get("/findPersonByForename/Clive");

		ResultMatcher checkBody = content().json("[]");

		this.mockMVC.perform(request).andExpect(status().isOk()).andExpect(checkBody);

	}

	@Test
	void testNotFindingPersonBySurname() throws Exception {
		RequestBuilder request = get("/findPersonBySurname/Clive");

		ResultMatcher checkBody = content().json("[]");

		this.mockMVC.perform(request).andExpect(status().isOk()).andExpect(checkBody);

	}

	@Test
	void testNotFindingPersonByDob() throws Exception {
		RequestBuilder request = get("/findPersonByDob/1966-12-09");

		ResultMatcher checkBody = content().json("[]");

		this.mockMVC.perform(request).andExpect(status().isOk()).andExpect(checkBody);

	}

}
