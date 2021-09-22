package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BusinessAddress {

	@Id
	private Integer businessAddressId;

	@Column
	private String businessName;
	private String businessAddressLocation;
	private String businessAddressStreetName;
	private String businessAddressHouseNumber;
	private String businessAddressTown;
	private String businessAddressTypeOfBusiness;
	private String businessAddressPostcode;

	public BusinessAddress(Integer businessAddressId, String businessName, String businessAddressLocation,
			String businessAddressStreetName, String businessAddressHouseNumber, String businessAddressTown,
			String businessAddressTypeOfBusiness, String businessAddressPostcode) {
		super();
		this.businessAddressId = businessAddressId;
		this.businessName = businessName;
		this.businessAddressLocation = businessAddressLocation;
		this.businessAddressStreetName = businessAddressStreetName;
		this.businessAddressHouseNumber = businessAddressHouseNumber;
		this.businessAddressTown = businessAddressTown;
		this.businessAddressTypeOfBusiness = businessAddressTypeOfBusiness;
		this.businessAddressPostcode = businessAddressPostcode;
	}

	public BusinessAddress(String businessName, String businessAddressLocation, String businessAddressStreetName,
			String businessAddressHouseNumber, String businessAddressTown, String businessAddressTypeOfBusiness,
			String businessAddressPostcode) {
		super();
		this.businessName = businessName;
		this.businessAddressLocation = businessAddressLocation;
		this.businessAddressStreetName = businessAddressStreetName;
		this.businessAddressHouseNumber = businessAddressHouseNumber;
		this.businessAddressTown = businessAddressTown;
		this.businessAddressTypeOfBusiness = businessAddressTypeOfBusiness;
		this.businessAddressPostcode = businessAddressPostcode;
	}

	public BusinessAddress() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(businessAddressHouseNumber, businessAddressId, businessAddressLocation,
				businessAddressPostcode, businessAddressStreetName, businessAddressTown, businessAddressTypeOfBusiness,
				businessName);
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
		BusinessAddress other = (BusinessAddress) obj;
		return Objects.equals(businessAddressHouseNumber, other.businessAddressHouseNumber)
				&& Objects.equals(businessAddressId, other.businessAddressId)
				&& Objects.equals(businessAddressLocation, other.businessAddressLocation)
				&& Objects.equals(businessAddressPostcode, other.businessAddressPostcode)
				&& Objects.equals(businessAddressStreetName, other.businessAddressStreetName)
				&& Objects.equals(businessAddressTown, other.businessAddressTown)
				&& Objects.equals(businessAddressTypeOfBusiness, other.businessAddressTypeOfBusiness)
				&& Objects.equals(businessName, other.businessName);
	}

	public Integer getBusinessAddressId() {
		return businessAddressId;
	}

	public void setBusinessAddressId(Integer businessAddressId) {
		this.businessAddressId = businessAddressId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessAddressLocation() {
		return businessAddressLocation;
	}

	public void setBusinessAddressLocation(String businessAddressLocation) {
		this.businessAddressLocation = businessAddressLocation;
	}

	public String getBusinessAddressStreetName() {
		return businessAddressStreetName;
	}

	public void setBusinessAddressStreetName(String businessAddressStreetName) {
		this.businessAddressStreetName = businessAddressStreetName;
	}

	public String getBusinessAddressHouseNumber() {
		return businessAddressHouseNumber;
	}

	public void setBusinessAddressHouseNumber(String businessAddressHouseNumber) {
		this.businessAddressHouseNumber = businessAddressHouseNumber;
	}

	public String getBusinessAddressTown() {
		return businessAddressTown;
	}

	public void setBusinessAddressTown(String businessAddressTown) {
		this.businessAddressTown = businessAddressTown;
	}

	public String getBusinessAddressTypeOfBusiness() {
		return businessAddressTypeOfBusiness;
	}

	public void setBusinessAddressTypeOfBusiness(String businessAddressTypeOfBusiness) {
		this.businessAddressTypeOfBusiness = businessAddressTypeOfBusiness;
	}

	public String getBusinessAddressPostcode() {
		return businessAddressPostcode;
	}

	public void setBusinessAddressPostcode(String businessAddressPostcode) {
		this.businessAddressPostcode = businessAddressPostcode;
	}

	@Override
	public String toString() {
		return "BusinessAddress [businessAddressId=" + businessAddressId + ", businessName=" + businessName
				+ ", businessAddressLocation=" + businessAddressLocation + ", businessAddressStreetName="
				+ businessAddressStreetName + ", businessAddressHouseNumber=" + businessAddressHouseNumber
				+ ", businessAddressTown=" + businessAddressTown + ", businessAddressTypeOfBusiness="
				+ businessAddressTypeOfBusiness + ", businessAddressPostcode=" + businessAddressPostcode + "]";
	}

}
