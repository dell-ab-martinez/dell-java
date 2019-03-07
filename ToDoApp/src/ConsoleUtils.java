import java.util.List;
import java.util.Scanner;

public class ConsoleUtils {
	
	private Scanner reader;
	
	// Constructor
	public ConsoleUtils() {
		this.reader =  new Scanner(System.in);
	}
	
	// Methods
	// Print all commands
	public void printHelp() {
		System.out.println("Available functions:");
		System.out.println("add: to add an item");
		System.out.println("delete: to delete an item");
		System.out.println("mark done: the item to mark as done");
		System.out.println("list pending: to list the pending items");
		System.out.println("list done: to list the done items");
		System.out.println("list all: to list all items");
		System.out.println("help: display available functions");
		System.out.println("quit: to exit");
	}
	
	// Ask user for imput
	public String promptUserInput(String helpText) {
		System.out.print(helpText);
		String input = reader.nextLine();
		return input;
	}
	
	// Print returned list
	public void printList(List<ToDoItem> list) {
		String databaseVis = " ID | Description | Status";
		databaseVis += "\n" + "----+-------------+-------";
		
		for(int i = 0; i < list.size(); i++) {
			ToDoItem currItem = list.get(i);
			String status = "pending";
			if(currItem.completed) {
				status = "done";
			}
			databaseVis += "\n" + "  " + currItem.id + " | " + currItem.description + "     | " + status;
		}
		
		System.out.println(databaseVis);
	}
}
