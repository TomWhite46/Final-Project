package com.example.demo.data;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Embeddable
@Entity
public class Person {

	@Id
	@Column(name = "person_id")
	private Long personID;

	@Column(name = "is_citizen")
	private String isCitizen;
	@Column(name = "forenames")
	private String personForenames;
	@Column(name = "surname")
	private String personSurname;
	@Column(name = "dob")
	private LocalDate personDOB;
	@Column(name = "place_of_birth")
	private String personPOB;
	@Column(name = "nationality")
	private String personNationality;
	@Column(name = "sex")
	private String personSex;

	@OneToMany(mappedBy = "person")
	Set<Person_Citizen> identity;

	@OneToMany(mappedBy = "person")
	Set<Person_Vehicle> carInfo;

	public Person(Long personID, String isCitizen, String personForenames, String personSurname, LocalDate personDOB,
			String personPOB, String personNationality, String personSex) {
		super();
		this.personID = personID;
		this.isCitizen = isCitizen;
		this.personForenames = personForenames;
		this.personSurname = personSurname;
		this.personDOB = personDOB;
		this.personPOB = personPOB;
		this.personNationality = personNationality;
		this.personSex = personSex;

	}

	public Person(String isCitizen, String personForenames, String personSurname, LocalDate personDOB, String personPOB,
			String personNationality, String personSex) {
		super();
		this.isCitizen = isCitizen;
		this.personForenames = personForenames;
		this.personSurname = personSurname;
		this.personDOB = personDOB;
		this.personPOB = personPOB;
		this.personNationality = personNationality;
		this.personSex = personSex;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(isCitizen, personDOB, personForenames, personSex, personID, personNationality, personPOB,
				personSurname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return isCitizen == other.isCitizen && Objects.equals(personDOB, other.personDOB)
				&& Objects.equals(personForenames, other.personForenames) && personSex == other.personSex
				&& Objects.equals(personID, other.personID)
				&& Objects.equals(personNationality, other.personNationality)
				&& Objects.equals(personPOB, other.personPOB) && Objects.equals(personSurname, other.personSurname);
	}

	public Long getPersonID() {
		return personID;
	}

	public void setPersonID(Long personID) {
		this.personID = personID;
	}

	public String isIs_Citizen() {
		return isCitizen;
	}

	public void setIsCitizen(String isCitizen) {
		this.isCitizen = isCitizen;
	}

	public String getPersonForenames() {
		return personForenames;
	}

	public void setPersonForename(String personForenames) {
		this.personForenames = personForenames;
	}

	public String getPersonSurname() {
		return personSurname;
	}

	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}

	public LocalDate getPersonDOB() {
		return personDOB;
	}

	public void setPersonDOB(LocalDate personDOB) {
		this.personDOB = personDOB;
	}

	public String getPersonPOB() {
		return personPOB;
	}

	public void setPersonPOB(String personPOB) {
		this.personPOB = personPOB;
	}

	public String getPersonNationality() {
		return personNationality;
	}

	public void setPersonNationality(String personNationality) {
		this.personNationality = personNationality;
	}

	public String getByPersonSex() {
		return personSex;
	}

	public void setByPersonSex(String personSex) {
		this.personSex = personSex;
	}

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", is_Citizen=" + isCitizen + ", personForenames=" + personForenames
				+ ", personSurname=" + personSurname + ", personDOB=" + personDOB + ", personPOB=" + personPOB
				+ ", personNationality=" + personNationality + ", personSex=" + personSex + "]";
	}

}
