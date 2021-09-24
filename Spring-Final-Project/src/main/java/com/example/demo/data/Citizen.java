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
public class Citizen {

	@Id
	@Column(name="citizen_id")
	private String id;

	@Column
	private String forenames;
	private String surname;
	@Column(name="home_address")
	private String address;
	private LocalDate dob;
	@Column(name="place_of_birth")
	private String placeOfBirth;
	private String sex;
	
	@OneToMany(mappedBy = "citizen")
	Set<Person_Citizen> identity;

	public Citizen(String id, String forenames, String surname, String address, LocalDate dob, String placeOfBirth,
			String sex) {
		super();
		this.id = id;
		this.forenames = forenames;
		this.surname = surname;
		this.address = address;
		this.dob = dob;
		this.placeOfBirth = placeOfBirth;
		this.sex = sex;
	}
	public Citizen(String forenames, String surname, String address, LocalDate dob, String placeOfBirth,
			String sex) {
		super();
		this.forenames = forenames;
		this.surname = surname;
		this.address = address;
		this.dob = dob;
		this.placeOfBirth = placeOfBirth;
		this.sex = sex;
	}
	public Citizen() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, dob, forenames, id, placeOfBirth, sex, surname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citizen other = (Citizen) obj;
		return Objects.equals(address, other.address) && Objects.equals(dob, other.dob)
				&& Objects.equals(forenames, other.forenames) && Objects.equals(id, other.id)
				&& Objects.equals(placeOfBirth, other.placeOfBirth) && Objects.equals(sex, other.sex)
				&& Objects.equals(surname, other.surname);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getForenames() {
		return forenames;
	}
	public void setForenames(String forenames) {
		this.forenames = forenames;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", forenames=" + forenames + ", surname=" + surname + ", address=" + address
				+ ", dob=" + dob + ", placeOfBirth=" + placeOfBirth + ", sex=" + sex + "]";
	}
	
	
	
	
	

	

}
