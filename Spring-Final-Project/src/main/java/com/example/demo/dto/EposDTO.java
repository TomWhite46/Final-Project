package com.example.demo.dto;

import java.util.Objects;

public class EposDTO {

	private Integer eposId;
	private String vendor;
	private String streetName;
	private String postcode;

	public EposDTO(Integer eposId, String vendor, String streetName, String postcode) {
		super();
		this.eposId = eposId;
		this.vendor = vendor;
		this.streetName = streetName;
		this.postcode = postcode;
	}

	public EposDTO() {
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
		EposDTO other = (EposDTO) obj;
		return Objects.equals(eposId, other.eposId) && Objects.equals(postcode, other.postcode)
				&& Objects.equals(streetName, other.streetName) && Objects.equals(vendor, other.vendor);
	}

}
