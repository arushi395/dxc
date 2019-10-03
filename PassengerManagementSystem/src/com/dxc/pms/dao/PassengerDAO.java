package com.dxc.pms.dao;

import java.util.List;

import com.dxc.pms.model.Passenger;


public interface PassengerDAO {
	public Passenger getPassengerData(int pnrNumber);
	public List<Passenger> getAllPassengerData();
	public void addPassenger(Passenger passenger);
	public void deletePassenger(int pnrNumber);
	public void updatePassengerData(Passenger passenger);
	

}
