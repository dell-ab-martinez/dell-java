
public class CarLotProgram {

	public static void main(String[] args) {
		// Create lots
		CarLot lotOne = new CarLot("Lot One");
		CarLot lotTwo = new CarLot("Lot Two");
		
		// Create cars
		Car benzo = new Car("coupe", 2, "JEIDL23", "Mercedes", "CLA250", 35000);
		Car audi = new Car("hatchback", 4, "IEISL2", "Audi", "A5", 54000);
		Truck ford = new Truck("large", "IELKD23", "Ford", "F250", 30000);
		Truck chevy = new Truck("medium", "ESDSDF23", "Chevrolet", "Silverado", 40000);
		
		// Add cars to lots
		lotOne.addVehicle(benzo);
		lotOne.addVehicle(audi);
		lotOne.addVehicle(ford);
		
		lotTwo.addVehicle(benzo);
		lotTwo.addVehicle(audi);
		lotTwo.addVehicle(chevy);
		
		// Print Inventories
		lotOne.printInventory();
		lotTwo.printInventory();
	}

}
