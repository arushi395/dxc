package assignment;

public class Vehicle {
	
	private String vehicleColor;
	private int noOfWheels;
	private String model;
	
	public Vehicle() {
		//super();
	}

	public Vehicle(String vehicleColor, int noOfWheels, String model) {
		super();
		this.vehicleColor = vehicleColor;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleColor=" + vehicleColor + ", noOfWheels=" + noOfWheels + ", model=" + model + "]";
	}
	

	
	
	

}
