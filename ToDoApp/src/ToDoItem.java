
public class ToDoItem {
	// Member variables
	int id;
	String description;
	Boolean completed;
	
	private static int NEXTID = 1;
	
	// Constructor
	public ToDoItem(String description) {
		this.description = description;
		this.completed = false;
		this.id = NEXTID;
		
		// Increment id after each initialization
		NEXTID++;
	}
}
