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
public class Person_Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@MapsId("personID")
	@JoinColumn(name = "person_id")
	private Person person;

	@ManyToOne
	@MapsId("vehicleId")
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;

	public Person_Vehicle(Person person, Vehicle vehicle) {
		super();
		this.person = person;
		this.vehicle = vehicle;
	}

	public Person_Vehicle() {

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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, person, vehicle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person_Vehicle other = (Person_Vehicle) obj;
		return id == other.id && Objects.equals(person, other.person) && Objects.equals(vehicle, other.vehicle);
	}

}
