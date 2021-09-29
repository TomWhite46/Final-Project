package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@Column(name = "address_id")
	private Integer addressId;

	@Column(name = "street_name")
	private String streetName;
	@Column(name = "postcode")
	private String postcode;
	@Column(name = "town")
	private String town;
	@Column(name = "house_number")
	private String houseNumber;

	public Address(Integer addressId, String streetName, String postcode, String town, String houseNumber) {
		super();
		this.addressId = addressId;
		this.streetName = streetName;
		this.postcode = postcode;
		this.town = town;
		this.houseNumber = houseNumber;
	}

	public Address(String streetName, String postcode, String town, String houseNumber) {
		super();
		this.streetName = streetName;
		this.postcode = postcode;
		this.town = town;
		this.houseNumber = houseNumber;
	}

	public Address() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(houseNumber, addressId, postcode, streetName, town);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(houseNumber, other.houseNumber) && Objects.equals(addressId, other.addressId)
				&& Objects.equals(postcode, other.postcode) && Objects.equals(streetName, other.streetName)
				&& Objects.equals(town, other.town);
	}

	public Integer getaddressId() {
		return addressId;
	}

	public void setaddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getstreetName() {
		return streetName;
	}

	public void setstreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getpostcode() {
		return postcode;
	}

	public void setpostcode(String postcode) {
		this.postcode = postcode;
	}

	public String gettown() {
		return town;
	}

	public void settown(String town) {
		this.town = town;
	}

	public String gethouseNumber() {
		return houseNumber;
	}

	public void sethouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetName=" + streetName + ", postcode=" + postcode + ", town="
				+ town + ", houseNumber=" + houseNumber + "]";
	}

}
