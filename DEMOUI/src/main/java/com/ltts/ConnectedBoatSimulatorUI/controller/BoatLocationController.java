package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.ConnectedBoatSimulatorUI.model.BoatLocation;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatLocationService;

@RestController

public class BoatLocationController {
	
	@Autowired
	private BoatLocationService service;
	
	@GetMapping("/location/{hullId}")
	public BoatLocation getCurrentLocationDetail(@PathVariable("hullId") String hullId) {
		List<BoatLocation> li = service.listAll();
		BoatLocation m=li.get(li.size()-1);
		//System.out.println(m);
		BoatLocation currentLocation= service.getCurrentLocation(m);
		return currentLocation;
	}	

}
