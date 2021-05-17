package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Main;
import com.ltts.ConnectedBoatSimulatorUI.repository.MainRepository;

@Service
public class MainService {

	@Autowired
	private MainRepository repo;
	
	public List<Main> listAll(){
		return repo.findAll();
	}
	public void save(Main boat) {
		repo.save(boat);
	}
	public Main get(int id) {
		return repo.findById(id).get();
	}
	public Main getCurrentLocation(Main m) {
		//return repo.findByLocationId(id).get();
		  
		 return m;
	}
	public void delete(int id) {
		repo.deleteById(id);
	}
}
