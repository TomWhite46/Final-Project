package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Epos {

	@Id
	@Column(name = "epos_id")
	private Integer eposId;
	private String vendor;
	@Column(name = "street_name")
	private String streetName;
	private String postcode;

	public Epos(Integer eposId, String vendor, String streetName, String postcode) {
		super();
		this.eposId = eposId;
		this.vendor = vendor;
		this.streetName = streetName;
		this.postcode = postcode;
	}

	public Epos() {
		super();
	}

	public Integer getEposId() {
		return eposId;
	}

	public void setEposId(Integer eposId) {
		this.eposId = eposId;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eposId, postcode, streetName, vendor);
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
		Epos other = (Epos) obj;
		return Objects.equals(eposId, other.eposId) && Objects.equals(postcode, other.postcode)
				&& Objects.equals(streetName, other.streetName) && Objects.equals(vendor, other.vendor);
	}

}
