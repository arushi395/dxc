package assignment;

public class Car extends Vehicle {
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String vehicleColor, int noOfWheels, String model) {
		super(vehicleColor, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [VehicleColor=" + getVehicleColor() + ", NoOfWheels=" + getNoOfWheels() + ", Model="
				+ getModel() + "]";
	}
	
}
