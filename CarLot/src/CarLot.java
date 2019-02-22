import java.util.ArrayList;
import java.util.List;

public class CarLot {
	// Properties
	private String name;
	private List<Vehicle> vehicles;
	
	//  Constructor
	public CarLot(String name) {
		this.name = name;
		vehicles = new ArrayList<Vehicle>();
	}
	
	// Add vehicle to list
	public void addVehicle(Vehicle newVehicle) {
		vehicles.add(newVehicle);
	}
	
	// Print vehicles in lot
	public void printInventory() {
		System.out.println("Car lot " + name + " has " + vehicles.size() + " vehicles in it. The vehicles are:");
		for(int i = 0; i < vehicles.size(); i++) {
			vehicles.get(i).printDescription();
		}
	}
}
