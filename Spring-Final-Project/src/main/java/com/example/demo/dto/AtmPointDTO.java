package com.example.demo.dto;

import java.util.Objects;

public class AtmPointDTO {

	private Integer atmId;
	private String operator;
	private String streetName;
	private String postcode;

	public AtmPointDTO(Integer atmId, String operator, String streetName, String postcode) {
		super();
		this.atmId = atmId;
		this.operator = operator;
		this.streetName = streetName;
		this.postcode = postcode;
	}

	public AtmPointDTO(String operator, String streetName, String postcode) {
		super();
		this.operator = operator;
		this.streetName = streetName;
		this.postcode = postcode;
	}

	public AtmPointDTO() {
		super();
	}

	public Integer getAtmId() {
		return atmId;
	}

	public void setAtmId(Integer atmId) {
		this.atmId = atmId;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
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
		return Objects.hash(atmId, operator, postcode, streetName);
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
		AtmPointDTO other = (AtmPointDTO) obj;
		return Objects.equals(atmId, other.atmId) && Objects.equals(operator, other.operator)
				&& Objects.equals(postcode, other.postcode) && Objects.equals(streetName, other.streetName);
	}

}
