package com.entryexit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entryexit.beans.VehicleDetails;
import com.entryexit.service.EntryExitService;

@RestController
@RequestMapping("/vehicle")
public class EntryExitController {

	@Autowired
	EntryExitService enttryExitService;

	@RequestMapping(value = "/entry", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> setVehicleDetails(@RequestBody VehicleDetails vehicleDetails) {

		enttryExitService.saveVehicleDetails(vehicleDetails);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
