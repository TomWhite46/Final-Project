package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AtmPoint {

	@Id
	private Integer atmId;

	@Column
	private String operator;
	@Column(name = "street_name")
	private String streetName;
	private String postcode;

	public AtmPoint(Integer atmId, String operator, String streetName, String postcode) {
		super();
		this.atmId = atmId;
		this.operator = operator;
		this.streetName = streetName;
		this.postcode = postcode;
	}

	public AtmPoint(String operator, String streetName, String postcode) {
		super();
		this.operator = operator;
		this.streetName = streetName;
		this.postcode = postcode;
	}

	public AtmPoint() {
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
		AtmPoint other = (AtmPoint) obj;
		return Objects.equals(atmId, other.atmId) && Objects.equals(operator, other.operator)
				&& Objects.equals(postcode, other.postcode) && Objects.equals(streetName, other.streetName);
	}

}
