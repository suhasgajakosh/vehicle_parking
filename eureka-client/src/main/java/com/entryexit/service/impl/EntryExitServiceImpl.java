package com.entryexit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entryexit.beans.VehicleDetails;
import com.entryexit.dao.VehicleDetailsRepository;
import com.entryexit.service.EntryExitService;

@Service
public class EntryExitServiceImpl implements EntryExitService {

	@Autowired
	VehicleDetailsRepository repo;
	
	@Override
	public void saveVehicleDetails(VehicleDetails vehicleDetails) {
		
		repo.save(vehicleDetails);
	}

}
