package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.BoatLocation;
import com.ltts.ConnectedBoatSimulatorUI.repository.BoatLocationRepository;

@Service
public class BoatLocationService {

	@Autowired
	private BoatLocationRepository repo;
	
	public List<BoatLocation> listAll(){
		return repo.findAll();
	}
	public void save(BoatLocation boat) {
		repo.save(boat);
	}
	public BoatLocation get(int id) {
		return repo.findById(id).get();
	}
	public BoatLocation getCurrentLocation(BoatLocation m) {
		//return repo.findByLocationId(id).get();
		  
		 return m;
	}
	public void delete(int id) {
		repo.deleteById(id);
	}
}
