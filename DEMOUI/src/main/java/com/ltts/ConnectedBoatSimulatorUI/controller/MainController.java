package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Main;
import com.ltts.ConnectedBoatSimulatorUI.service.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService service;
	
	@GetMapping("/")
	public String viewMain(Model model) {
		List<Main> li = service.listAll();
		model.addAttribute("boatlist", li);
		//System.out.println(li);
		//Main m=li.get(1);
		//System.out.println(li.size());
		//System.out.println(m);
		return "boatlist";
	}
}
