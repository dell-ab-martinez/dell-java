
public abstract class Vehicle {
	// Properties
	private String licenseNumber;
	private String make;
	private String model;
	private int price;
	
	// Constructor
	public Vehicle(String myLicenseNumber, String myMake, String myModel, int myPrice) {
		licenseNumber = myLicenseNumber;
		make = myMake;
		model = myModel;
		price = myPrice;
	}
	
	// Print vehicle description
	public void printDescription() {
		System.out.print("License: " + licenseNumber 
				+ ", Make: " + make + ", Model: " + model 
				+ ", Price: "  + price);
	}
}
