package com.entryexit.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.joda.time.DateTime;

@Entity
public class VehicleDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private VehicleType vehicleType;

	private String vehicleNumber;

	private String vehicleOwnerName;

	private DateTime vehicleEntryTime;

	private DateTime vehicleExitTime;

	protected VehicleDetails() {

	}

	public VehicleDetails(VehicleType vehicleType, String vehicleNumber, String vehicleOwnerName,
			DateTime vehicleEntryTime, DateTime vehicleExitTime) {
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.vehicleOwnerName = vehicleOwnerName;
		this.vehicleEntryTime = vehicleEntryTime;
		this.vehicleExitTime = vehicleExitTime;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public DateTime getVehicleEntryTime() {
		return vehicleEntryTime;
	}

	public void setVehicleEntryTime(DateTime vehicleEntryTime) {
		this.vehicleEntryTime = vehicleEntryTime;
	}

	public DateTime getVehicleExitTime() {
		return vehicleExitTime;
	}

	public void setVehicleExitTime(DateTime vehicleExitTime) {
		this.vehicleExitTime = vehicleExitTime;
	}

	public String getVehicleOwnerName() {
		return vehicleOwnerName;
	}

	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	@Override
	public String toString() {
		return "VehicleDetails [id=" + id + ", vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber
				+ ", vehicleOwnerName=" + vehicleOwnerName + ", vehicleEntryTime=" + vehicleEntryTime
				+ ", vehicleExitTime=" + vehicleExitTime + "]";
	}

}
