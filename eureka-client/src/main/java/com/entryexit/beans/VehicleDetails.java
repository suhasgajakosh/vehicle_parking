package com.entryexit.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.entryexit.beans.VehicleType;


@Entity
public class VehicleDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private VehicleType vehicleType;

	private String vehicleNumber;

	private String vehicleOwnerName;

	private Date vehicleEntryTime;

	private Date vehicleExitTime;
	
	private String errorMessage;
	
	

	public VehicleDetails() {

	}

	public VehicleDetails(VehicleType vehicleType, String vehicleNumber, String vehicleOwnerName,
			Date vehicleEntryTime, Date vehicleExitTime, String errorMessage) {
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.vehicleOwnerName = vehicleOwnerName;
		this.vehicleEntryTime = vehicleEntryTime;
		this.vehicleExitTime = vehicleExitTime;
		this.errorMessage = errorMessage;
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

	public Date getVehicleEntryTime() {
		return vehicleEntryTime;
	}

	public void setVehicleEntryTime(Date vehicleEntryTime) {
		this.vehicleEntryTime = vehicleEntryTime;
	}

	public Date getVehicleExitTime() {
		return vehicleExitTime;
	}

	public void setVehicleExitTime(Date vehicleExitTime) {
		this.vehicleExitTime = vehicleExitTime;
	}

	public String getVehicleOwnerName() {
		return vehicleOwnerName;
	}

	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "VehicleDetails [id=" + id + ", vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber
				+ ", vehicleOwnerName=" + vehicleOwnerName + ", vehicleEntryTime=" + vehicleEntryTime
				+ ", vehicleExitTime=" + vehicleExitTime + ", errorMessage=" + errorMessage + "]";
	}
	
}
