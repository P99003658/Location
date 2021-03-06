package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.BoatLocation;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatLocationService;

@Controller
public class LocationController {
	@Autowired
	private BoatLocationService service;
	
	@GetMapping("/")
	public String viewMain(Model model) {
		List<BoatLocation> li = service.listAll();
		model.addAttribute("boatlocation", li);
		System.out.println(li);
		//Main m=li.get(1);
		//System.out.println(li.size());
		//System.out.println(m);
		return "boatlocation";
	}
}
