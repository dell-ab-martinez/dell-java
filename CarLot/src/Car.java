
public class Car extends Vehicle {
	// Properties
	private String type;
	private int numDoors;
	
	// Constructor
	public Car(String type, int numDoors, String myLicenseNumber, String myMake, String myModel, int myPrice) {
		super(myLicenseNumber, myMake, myModel, myPrice);

		this.type = type;
		this.numDoors = numDoors;
	}
	
	// Print car description
	public void printDescription() {
		super.printDescription();
		System.out.println(", Type: " + type + ", Num Doors: " + numDoors);
	}
}
