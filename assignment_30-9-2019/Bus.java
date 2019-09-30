package assignment;

public class Bus extends Vehicle {

	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(String vehicleColor, int noOfWheels, String model) {
		super(vehicleColor, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bus [VehicleColor=" + getVehicleColor() + ", NoOfWheels=" + getNoOfWheels() + ", Model="
				+ getModel() + "]";
	}
	
	

}
