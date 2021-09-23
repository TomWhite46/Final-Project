package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Person_Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@MapsId("personID")
	@JoinColumn(name = "person_id")
	private Person person;

	@ManyToOne
	@MapsId("citizenID")
	@JoinColumn(name = "citizen_id")
	private Citizen citizen;

	public Person_Citizen(Person person, Citizen citizen) {
		super();
		this.person = person;
		this.citizen = citizen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(citizen, id, person);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person_Citizen other = (Person_Citizen) obj;
		return Objects.equals(citizen, other.citizen) && id == other.id && Objects.equals(person, other.person);
	}

}
