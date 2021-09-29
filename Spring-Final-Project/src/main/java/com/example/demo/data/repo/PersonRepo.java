package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

	List<Person> findByPersonForenamesIgnoreCase(String personForenames);

	List<Person> findByPersonSurnameIgnoreCase(String personSurname);

	List<Person> findByPersonNationalityIgnoreCase(String personNationality);

	List<Person> findByPersonPOBIgnoreCase(String personPOB);

	List<Person> findByPersonSex(String sex);

	List<Person> findByPersonDOB(String dateOfBirth);

	List<Person> findPersonByPersonForenamesAndPersonSurname(String personForenames, String personSurname);

	List<Person> findPersonByPersonForenamesAndPersonDOB(String personForenames, String personDOB);

	List<Person> findPersonByPersonForenamesAndPersonSurnameAndPersonDOB(String personForenames, String personSurname,
			String personDOB);

	@Query(value = "SELECT * FROM person WHERE forenames Like :forenames% AND surname LIKE :surname% AND dob LIKE :dob% ORDER BY surname, forenames, dob", nativeQuery = true)
	List<Person> getPersonFromSearch(@Param("forenames") String forenames, @Param("surname") String surname,
			@Param("dob") String dob);

	@Query(value = "select * from person where person_id in (select friend_id from friend where person_id = :personId) ORDER BY surname, forenames, dob", nativeQuery = true)
	List<Person> getFriendsFromPersonId(@Param("personId") Long personId);

	@Query(value = "select * from person where person_id in (select partner_id from person_partner where person_id = :personId) ORDER BY surname, forenames, dob", nativeQuery = true)
	List<Person> getPartnersFromPersonId(@Param("personId") Long personId);

	@Query(value = "SELECT * FROM person WHERE person_id IN (SELECT person_id FROM person_mobile_phone WHERE mobile_phone_id IN (SELECT phone_id FROM mobile_phone WHERE phone_number IN (SELECT receiver_number FROM mobile_call_record WHERE caller_number IN (SELECT phone_number FROM mobile_phone WHERE phone_id IN (select mobile_phone_id from person_mobile_phone WHERE person_id = :personId))))) ORDER BY surname, forenames, dob", nativeQuery = true)
	List<Person> getPhoneContactsByPersonId(@Param("personId") Long personId);

	@Query(value = "SELECT * FROM person WHERE person_id IN (SELECT person_id FROM person_business_address WHERE person_id <> :personId AND address_id IN (SELECT address_id FROM person_business_address WHERE person_id = :personId)) ORDER BY surname, forenames, dob", nativeQuery = true)
	List<Person> getColleaguesByPersonId(@Param("personId") Long personId);

	@Query(value = "SELECT * FROM person WHERE person_id IN (SELECT person_id FROM person_vehicle WHERE vehicle_id IN (SELECT vehicle_id FROM vehicle WHERE vehicle_registration_number=:reg))", nativeQuery = true)
	List<Person> findPersonByReg(@Param("reg") String reg);

}