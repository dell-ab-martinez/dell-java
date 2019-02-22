
public class GarageManager {

	public static void main(String[] args) {
		// Cars
		Car corvette = new Car("blue", "1234", "Chevrolet", "Corvette");
		Car mustang = new Car("red", "49dlkja", "Ford", "Mustang");
		Car benz = new Car("black", "idclskK", "Mercedes", "CLA250");
		Car audi = new Car("gray", "alkjwe", "Audi", "A5");
		
		
		// Parking Garages
		ParkingGarage mainGarage = new ParkingGarage(3);
		ParkingGarage secondaryGarage = new ParkingGarage(2);
		
		
		// Park/vacate main garage
		mainGarage.park(corvette, 0);
		mainGarage.park(audi, 2);
		mainGarage.park(mustang, 1);
		
		mainGarage.vacate(0);
		
		mainGarage.park(benz, 0);
		
		
		// Park/vacate secondary garage
		secondaryGarage.park(audi, 0);
		secondaryGarage.park(benz, 1);
		
		secondaryGarage.vacate(1);
		
		secondaryGarage.park(mustang, 1);
	
		
		// Print garage inventories
		System.out.println("The main garage's inventory is as follows:");
		mainGarage.printInventory();
		
		System.out.println("The secondary garage's inventory is as follows:");
		secondaryGarage.printInventory();	
	}
}
