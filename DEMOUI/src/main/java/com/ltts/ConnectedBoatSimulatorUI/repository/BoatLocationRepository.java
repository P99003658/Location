package com.ltts.ConnectedBoatSimulatorUI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.BoatLocation;

@Repository
public interface BoatLocationRepository extends JpaRepository<BoatLocation,Integer>{

}
