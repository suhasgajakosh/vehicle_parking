package com.entryexit.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entryexit.beans.VehicleDetails;
import com.entryexit.dao.VehicleDetailsRepository;
import com.entryexit.service.EntryExitService;

@Service
public class EntryExitServiceImpl implements EntryExitService {

	@Autowired
	VehicleDetailsRepository repo;
	
	
	String news = null;

	@Override
	public void saveVehicleDetails(VehicleDetails vehicleDetails) {

		repo.save(vehicleDetails);
	}

	@Override
	public VehicleDetails getVehicleDetails(long vehicleId) {
		VehicleDetails vehicleDetails = repo.findOne(vehicleId);
		if (null != vehicleDetails) {
			vehicleDetails.setVehicleExitTime(new Date());
		} else {
			vehicleDetails = new VehicleDetails();
			vehicleDetails.setErrorMessage("Vehicle Not Found");
		}		
		
		return vehicleDetails;
	}

}
