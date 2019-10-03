package com.dxc.pms.client;

import java.util.Scanner;

import com.dxc.pms.dao.PassengerDAO;
import com.dxc.pms.dao.PassengerDAOImpl;
import com.dxc.pms.model.Passenger;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PassengerDAO passengerDAO=new PassengerDAOImpl();
		while(true) {
			System.out.println("PASSENGER MENU");
			System.out.println("1) Add Passenger");
			System.out.println("2) Get Passenger By PnrNumber");
			System.out.println("3) Get All Passengers");
			System.out.println("4) Delete Passenger By PnrNumber");
			System.out.println("5) Update Passenger By PnrNumber");
			System.out.println("6) EXIT");
			Scanner scanner=new Scanner(System.in);
			int choice=0;
			System.out.println("Please enter your choice:(1-6)");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter PNR number");
				int pnrNumber=scanner.nextInt();
				System.out.println("Enter Passenger name");
				String passengerName=scanner.next();
				System.out.println("Enter Source");
				String source=scanner.next();
				System.out.println("Enter Destination");
				String destination=scanner.next();
				System.out.println("Enter fare");
				int fare=scanner.nextInt();
				Passenger passenger=new Passenger(pnrNumber,passengerName,source,destination,fare);
				passengerDAO.addPassenger(passenger);
				break;
			case 2:
				System.out.println(passengerDAO.getAllPassengerData());
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Thanks for using the app");
				System.exit(0);
			default:
				System.out.println("Please select options from the menu");
			}
		}
		
		

	}

}
