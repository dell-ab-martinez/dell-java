
public class Truck extends Vehicle {
	// Properties
	private String bedSize;
	
	// Constructor
	public Truck(String bedSize, String myLicenseNumber, String myMake, String myModel, int myPrice) {
		super(myLicenseNumber, myMake, myModel, myPrice);
		
		this.bedSize = bedSize;
	}
	
	// Print truck description
	public void printDescription() {
		super.printDescription();
		System.out.println(", Bed Size: " + bedSize);
	}
}
