package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.ConnectedBoatSimulatorUI.model.Main;
import com.ltts.ConnectedBoatSimulatorUI.service.MainService;

@RestController

public class LocationController {
	
	@Autowired
	private MainService service;
	
	@GetMapping("/boatlocation/{hullId}")
	public Main getCurrentLocationDetail(@PathVariable("hullId") String hullId) {
		List<Main> li = service.listAll();
		//System.out.println(li);
		Main m=li.get(li.size()-1);
		//System.out.println(m);
		Main currentLocation= service.getCurrentLocation(m);
		return currentLocation;
	}	
	
	

}
