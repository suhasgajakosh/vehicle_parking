package com.entryexit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entryexit.beans.VehicleDetails;
import com.entryexit.service.EntryExitService;

@RestController
public class EntryExitController {

	@Autowired
	EntryExitService entryExitService;

	@RequestMapping(value = "/entry", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> entryVehicle(@RequestBody VehicleDetails vehicleDetails) {

		entryExitService.saveVehicleDetails(vehicleDetails);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/exit", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VehicleDetails> exitVehicle(@RequestParam(value = "vehicleId") long vehicleId) {

		// enttryExitService.saveVehicleDetails(vehicleDetails);
		VehicleDetails vehicleDetails = entryExitService.getVehicleDetails(vehicleId);

		if (null != vehicleDetails) {
			return new ResponseEntity<VehicleDetails>(vehicleDetails, HttpStatus.OK);
		} else {

			
			
			return new ResponseEntity<VehicleDetails>(vehicleDetails, HttpStatus.NO_CONTENT);
		}

	}

}
