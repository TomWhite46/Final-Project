package com.example.demo.data;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vehicle {

	@Id
	private Integer vehicleId;

	@Column
	private String vehicleColour;
	private String vehicleModel;
	private String vehicleRegistrationNumber;
	private String vehicleMake;

	@OneToMany(mappedBy = "vehicle")
	Set<Person_Vehicle> carInfo;

	public Vehicle(Integer vehicleId, String vehicleColour, String vehicleModel, String vehicleRegistrationNumber,
			String vehicleMake) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleColour = vehicleColour;
		this.vehicleModel = vehicleModel;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.vehicleMake = vehicleMake;
	}

	public Vehicle(String vehicleColour, String vehicleModel, String vehicleRegistrationNumber, String vehicleMake) {
		super();
		this.vehicleColour = vehicleColour;
		this.vehicleModel = vehicleModel;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.vehicleMake = vehicleMake;
	}

	public Vehicle() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(vehicleColour, vehicleId, vehicleMake, vehicleModel, vehicleRegistrationNumber);
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
		Vehicle other = (Vehicle) obj;
		return Objects.equals(vehicleColour, other.vehicleColour) && Objects.equals(vehicleId, other.vehicleId)
				&& Objects.equals(vehicleMake, other.vehicleMake) && Objects.equals(vehicleModel, other.vehicleModel)
				&& Objects.equals(vehicleRegistrationNumber, other.vehicleRegistrationNumber);
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}

	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleColour=" + vehicleColour + ", vehicleModel=" + vehicleModel
				+ ", vehicleRegistrationNumber=" + vehicleRegistrationNumber + ", vehicleMake=" + vehicleMake + "]";
	}

}
