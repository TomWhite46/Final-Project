package com.example.demo.data;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.Gender;

@Embeddable
@Entity
public class Person {

	@Id
	private String personID;

	@Column
	private boolean isCitizen;
	private String personForename;
	private String personSurname;
	private LocalDate personDOB;
	private String personPOB;
	private String personNationality;
	private Gender personGender;

	@OneToMany(mappedBy = "person")
	Set<Person_Citizen> identity;

	public Person(String personID, boolean isCitizen, String personForename, String personSurname, LocalDate personDOB,
			String personPOB, String personNationality, Gender personGender) {
		super();
		this.personID = personID;
		this.isCitizen = isCitizen;
		this.personForename = personForename;
		this.personSurname = personSurname;
		this.personDOB = personDOB;
		this.personPOB = personPOB;
		this.personNationality = personNationality;
		this.personGender = personGender;

	}

	public Person(boolean isCitizen, String personForename, String personSurname, LocalDate personDOB, String personPOB,
			String personNationality, Gender personGender) {
		super();
		this.isCitizen = isCitizen;
		this.personForename = personForename;
		this.personSurname = personSurname;
		this.personDOB = personDOB;
		this.personPOB = personPOB;
		this.personNationality = personNationality;
		this.personGender = personGender;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(isCitizen, personDOB, personForename, personGender, personID, personNationality, personPOB,
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
				&& Objects.equals(personForename, other.personForename) && personGender == other.personGender
				&& Objects.equals(personID, other.personID)
				&& Objects.equals(personNationality, other.personNationality)
				&& Objects.equals(personPOB, other.personPOB) && Objects.equals(personSurname, other.personSurname);
	}

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public boolean isIs_Citizen() {
		return isCitizen;
	}

	public void setIs_Citizen(boolean is_Citizen) {
		this.isCitizen = is_Citizen;
	}

	public String getPersonForename() {
		return personForename;
	}

	public void setPersonForename(String personForename) {
		this.personForename = personForename;
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

	public Gender getPersonGender() {
		return personGender;
	}

	public void setPersonGender(Gender personGender) {
		this.personGender = personGender;
	}

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", is_Citizen=" + isCitizen + ", personForename=" + personForename
				+ ", personSurname=" + personSurname + ", personDOB=" + personDOB + ", personPOB=" + personPOB
				+ ", personNationality=" + personNationality + ", personGender=" + personGender + "]";
	}

}
