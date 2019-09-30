package assignment;

public class Truck extends Vehicle {
	public Truck() {
		// TODO Auto-generated constructor stub
	}
	public Truck(String vehicleColor, int noOfWheels, String model) {
		super(vehicleColor, noOfWheels, model);}
		
	public String toString() {
		return "Truck [VehicleColor=" + getVehicleColor() + ", NoOfWheels="
				+ getNoOfWheels() + ", Model=" + getModel() + "]";
	}
	

}
