import java.util.ArrayList;
import java.util.List;

public class Dao {
	// Member variables
	List<ToDoItem> toDoItems = new ArrayList<ToDoItem>();
	
	public Dao() {}
	
	// Methods
	// Mark item as completed
	public void update(int id) {
		for (int i = 0; i < toDoItems.size(); i++) {
			ToDoItem currItem = toDoItems.get(i);
			if (currItem.id == id) {
				currItem.completed = true;
				continue;
			}
		}
	}
	
	// Add new item
	public void add(String description) {
		ToDoItem newItem = new ToDoItem(description);
		toDoItems.add(newItem);
	}
	
	// Delete item by id
	public void delete(int id) { 
		for (int i = 0; i < toDoItems.size(); i++) {
			ToDoItem currItem = toDoItems.get(i);
			if (currItem.id == id) {
				toDoItems.remove(currItem);
				continue;
			}
		}
	}
	
	// List items
	public List<ToDoItem> list(String filter) {
		
		// List pending items
		if (filter.equals("pending")) {
			List<ToDoItem> pendingItems = new ArrayList<ToDoItem>();
			
			// Add !completed items to pendingItems list
			for(int i = 0; i < toDoItems.size(); i++) {
				ToDoItem currItem = toDoItems.get(i);
				if(!currItem.completed) {
					pendingItems.add(currItem);
				}
			}
			
			return pendingItems;
			
		} else if (filter.equals("done")) { // List completed items
			List<ToDoItem> completedItems = new ArrayList<ToDoItem>();
			
			
			for(int i = 0; i < toDoItems.size(); i++) {
				ToDoItem currItem = toDoItems.get(i);
				if(currItem.completed) {
					completedItems.add(currItem);
				}
			}
			
			return completedItems;
		} else { // List all items
			return toDoItems;	
		}
		
	}
	
}
