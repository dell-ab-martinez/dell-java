import java.util.List;
import java.util.Scanner;

public class Controller {
	// Member variables
	Dao dao;
	ConsoleUtils consoleUtils;
	
	public Controller() {
		this.dao = new Dao();
		this.consoleUtils = new ConsoleUtils();
	}
	
	// Start app
	public void start() {
		
		consoleUtils.printHelp();
		Scanner reader = new Scanner(System.in);
		
		boolean quit = false;
		while(!quit) {
			
			// Prompt user for input			
			String input = consoleUtils.promptUserInput("> ");
			String[] actionParts = input.split(" ");
			String action = actionParts[0].trim();

			if (action.equals("help")) {
				consoleUtils.printHelp();
			} else if (action.equals("add")) {
				processAddAction();
			} else if (action.equals("list")) {
				String listFilter = actionParts[1];
				processListAction(listFilter);
			} else if (action.equals("mark")) {
				processMarkDoneAction();
			} else if (action.equals("delete")) {
				processDeleteAction();
			} else if (action.equals("quit")) {
				quit = true;
			}
		}
		
		reader.close();
	}
	
	// Process add action
	public void processAddAction() {
		String description = consoleUtils.promptUserInput("Enter a description: ");
		dao.add(description);
		System.out.println("\n[item added]");
	}
	
	// Process list action
	public void processListAction(String listFilter) {
		List<ToDoItem> list = dao.list(listFilter);
		consoleUtils.printList(list);
	}
	
	
	// Process mark action
	public void processMarkDoneAction() {
		int itemId = Integer.parseInt(consoleUtils.promptUserInput("Enter an ID: "));
		dao.update(itemId);
		System.out.println("\n[item marked done]");
	}
	
	// Process delete action
	public void processDeleteAction() { 
		int itemId = Integer.parseInt(consoleUtils.promptUserInput("Enter an ID: "));
		dao.delete(itemId);
		System.out.println("\n[item deleted]");
	}
}
