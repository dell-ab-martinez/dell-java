
public class ParkingGarage {
	// Properties
	private Car[] parkingSpots;
	
	// Constructor
	public ParkingGarage(int capacity) {
		parkingSpots =  new Car[capacity];
	}
	
	// Park car in spot if available
	public void park(Car car, int spot) {
		try {
			if (parkingSpots[spot] != null) {
				throw new IllegalArgumentException("You cannot park in that spot.");
			} else {
				parkingSpots[spot] = car;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("That parking spot does not exist");
		} catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
	
	// Remove car from parking spot if not empty
	public void vacate(int spot) {
		try {
			if (parkingSpots[spot] == null) {
				throw new IllegalArgumentException("There is no car in that spot.");
			} else {
				parkingSpots[spot] = null;
			}
			
		} catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
	
	// Print parking garage's current inventory
	public void printInventory() {
		String description = "";
		for(int i = 0; i < parkingSpots.length; i++) {
			Car currentCar = parkingSpots[i];
			if (currentCar != null) {
				description += "Spot " + i + " contains a " + currentCar.getColor() + " " + currentCar.getMake() + " " + currentCar.getModel() + " with license plate " + currentCar.getLicenseNum() + "\n";
			} else {
				description += "Spot " + i + " is empty \n";
			}			
		}
		
		System.out.println(description);
	}
}
