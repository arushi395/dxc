package com.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.model.Passenger;

public class PassengerDAOImpl implements PassengerDAO {
	List<Passenger> passengers=new ArrayList<Passenger>();
	public PassengerDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Passenger getPassengerData(int pnrNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> getAllPassengerData() {
		// TODO Auto-generated method stub
		return passengers;
	}

	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		passengers.add(passenger);
		
	}

	@Override
	public void deletePassenger(int pnrNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePassengerData(Passenger passenger) {
		// TODO Auto-generated method stub
		
	}

}
