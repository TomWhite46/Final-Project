package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	@Column(name = "passport_number")
	private Long passportNumber;

	@Column
	private String surname;
	private String forenames;
	private String nationality;
	private String dob;
	private String sex;
	@Column(name = "place_of_birth")
	private String placeOfBirth;
	@Column(name = "issuing_country")
	private String passportIssuingCountry;
	@Column(name = "date_of_issue")
	private String passportDateOfIssue;
	@Column(name = "date_of_expiry")
	private String passportDateOfExpiry;

	public Passport(Long passportNumber, String surname, String forenames, String nationality, String dob, String sex,
			String placeOfBirth, String passportIssuingCountry, String passportDateOfIssue,
			String passportDateOfExpiry) {
		super();
		this.passportNumber = passportNumber;
		this.surname = surname;
		this.forenames = forenames;
		this.nationality = nationality;
		this.dob = dob;
		this.sex = sex;
		this.placeOfBirth = placeOfBirth;
		this.passportIssuingCountry = passportIssuingCountry;
		this.passportDateOfIssue = passportDateOfIssue;
		this.passportDateOfExpiry = passportDateOfExpiry;
	}

	public Passport(String surname, String forenames, String nationality, String dob, String sex, String placeOfBirth,
			String passportIssuingCountry, String passportDateOfIssue, String passportDateOfExpiry) {
		super();
		this.surname = surname;
		this.forenames = forenames;
		this.nationality = nationality;
		this.dob = dob;
		this.sex = sex;
		this.placeOfBirth = placeOfBirth;
		this.passportIssuingCountry = passportIssuingCountry;
		this.passportDateOfIssue = passportDateOfIssue;
		this.passportDateOfExpiry = passportDateOfExpiry;
	}

	public Passport() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(dob, forenames, nationality, passportDateOfExpiry, passportDateOfIssue,
				passportIssuingCountry, passportNumber, placeOfBirth, sex, surname);
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
		Passport other = (Passport) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(forenames, other.forenames)
				&& Objects.equals(nationality, other.nationality)
				&& Objects.equals(passportDateOfExpiry, other.passportDateOfExpiry)
				&& Objects.equals(passportDateOfIssue, other.passportDateOfIssue)
				&& Objects.equals(passportIssuingCountry, other.passportIssuingCountry)
				&& Objects.equals(passportNumber, other.passportNumber)
				&& Objects.equals(placeOfBirth, other.placeOfBirth) && Objects.equals(sex, other.sex)
				&& Objects.equals(surname, other.surname);
	}

	public Long getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(Long passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForenames() {
		return forenames;
	}

	public void setForenames(String forenames) {
		this.forenames = forenames;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getPassportIssuingCountry() {
		return passportIssuingCountry;
	}

	public void setPassportIssuingCountry(String passportIssuingCountry) {
		this.passportIssuingCountry = passportIssuingCountry;
	}

	public String getPassportDateOfIssue() {
		return passportDateOfIssue;
	}

	public void setPassportDateOfIssue(String passportDateOfIssue) {
		this.passportDateOfIssue = passportDateOfIssue;
	}

	public String getPassportDateOfExpiry() {
		return passportDateOfExpiry;
	}

	public void setPassportDateOfExpiry(String passportDateOfExpiry) {
		this.passportDateOfExpiry = passportDateOfExpiry;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", surname=" + surname + ", forenames=" + forenames
				+ ", nationality=" + nationality + ", dob=" + dob + ", sex=" + sex + ", placeOfBirth=" + placeOfBirth
				+ ", passportIssuingCountry=" + passportIssuingCountry + ", passportDateOfIssue=" + passportDateOfIssue
				+ ", passportDateOfExpiry=" + passportDateOfExpiry + "]";
	}

}
