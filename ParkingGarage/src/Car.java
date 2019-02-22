
public class Car {
	// Properties
	private String color;
	private String licenseNum;
	private String make;
	private String model;
	
	// Constructor
	public Car(String color, String licenseNum, String make, String model) {
		this.color = color;
		this.licenseNum = licenseNum;
		this.make = make;
		this.model = model;
	}
	
	// Getters and Setters
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getLicenseNum() {
		return licenseNum;
	}
	
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() { 
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
}
